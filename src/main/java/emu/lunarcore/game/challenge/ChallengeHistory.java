package emu.lunarcore.game.challenge;

import emu.lunarcore.proto.ChallengeBossInfoOuterClass.ChallengeBossInfo;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import org.bson.types.ObjectId;

import dev.morphia.annotations.Entity;
import dev.morphia.annotations.Id;
import dev.morphia.annotations.Indexed;
import emu.lunarcore.LunarCore;
import emu.lunarcore.game.player.Player;
import emu.lunarcore.proto.ChallengeOuterClass.Challenge;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity(value = "challenge", useDiscriminator = false)
public class ChallengeHistory {
    @Id
    private ObjectId id;
    
    @Indexed
    private int ownerUid;
    
    private int challengeId;
    @Setter private int groupId;
    private int takenReward;
    private int stars;
    private IntList scores;
    @Setter private ChallengeNodeData firstNodeData;
    @Setter private ChallengeNodeData secondNodeData;
    
    @Deprecated // Morphia
    public ChallengeHistory() {}
    
    public ChallengeHistory(Player player, int challengeId) {
        this.ownerUid = player.getUid();
        this.challengeId = challengeId;
    }
    
    public void setStars(int stars) {
        this.stars = Math.max(this.stars, stars);
    }
    
    public int getTotalStars() {
        int total = 0;
        for (int i = 0; i < 3; i++) {
            total += (this.stars & (1 << i)) != 0 ? 1 : 0;
        }
        return total;
    }
    
    public void setScore(int score1, int score2) {
        if (scores == null) {
            scores = new IntArrayList();
        }
        scores.clear();
        scores.add(score1);
        scores.add(score2);
    }
    
    private int getScoreSafe(int index) {
        try {
            return this.getScores().getInt(index);
        } catch (Exception ex) {
            return 0;
        }
    }
    
    public Challenge toProto() {
        var proto =  Challenge.newInstance()
                .setChallengeId(this.getChallengeId())
                .setTakenReward(this.getTakenReward())
                .setScore(getScoreSafe(0))
                .setScoreTwo(getScoreSafe(1))
                .setStars(this.getStars());
        
        // TODO: only proof of concept, optimize later
        
        var info = proto.getMutableStartInfo().getMutableBossInfo();
        
        if (getFirstNodeData() != null && getSecondNodeData() != null) {
            for (var avatarId: getFirstNodeData().getAvatarIds()) {
                info.addLineup1(avatarId);
                info.addAllRelics(ChallengeBossInfo.RelicsEntry.newInstance().setKey(avatarId));
                info.addAllEquipments(ChallengeBossInfo.EquipmentsEntry.newInstance().setKey(avatarId));
            }

            for (var avatarId: getSecondNodeData().getAvatarIds()) {
                info.addLineup2(avatarId);
                info.addAllRelics(ChallengeBossInfo.RelicsEntry.newInstance().setKey(avatarId));
                info.addAllEquipments(ChallengeBossInfo.EquipmentsEntry.newInstance().setKey(avatarId));
            }
            
            // set node info
            info.getMutableFirstNode()
                .setBuffId(getFirstNodeData().getBuffId())
                .setCCFNICMLEID(true)
                .setIsWin(true)
                .setStageScore(getFirstNodeData().getStageScore());
            
            // set node info
            info.getMutableSecondNode()
                .setBuffId(getSecondNodeData().getBuffId())
                .setCCFNICMLEID(true)
                .setIsWin(true)
                .setStageScore(getSecondNodeData().getStageScore());
        } else {
            // placeholder value
            info.getMutableFirstNode();
            info.getMutableSecondNode();
        }
        
        
        return proto;
    }
    
    public void delete() {
        LunarCore.getGameDatabase().delete(this);
    }
    
    public void save() {
        LunarCore.getGameDatabase().save(this);
    }
}
