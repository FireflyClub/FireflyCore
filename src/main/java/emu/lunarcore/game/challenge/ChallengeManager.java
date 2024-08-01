package emu.lunarcore.game.challenge;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import emu.lunarcore.GameConstants;
import emu.lunarcore.LunarCore;
import emu.lunarcore.data.GameData;
import emu.lunarcore.data.GameDepot;
import emu.lunarcore.data.common.ItemParam;
import emu.lunarcore.data.excel.ChallengeExcel;
import emu.lunarcore.game.enums.ChallengeType;
import emu.lunarcore.game.player.BasePlayerManager;
import emu.lunarcore.game.player.Player;
import emu.lunarcore.game.player.lineup.PlayerLineup;
import emu.lunarcore.game.scene.entity.EntityMonster;
import emu.lunarcore.proto.ExtraLineupTypeOuterClass.ExtraLineupType;
import emu.lunarcore.proto.StartChallengeBossBuffInfoOuterClass.StartChallengeBossBuffInfo;
import emu.lunarcore.proto.StartChallengeStoryBuffInfoOuterClass.StartChallengeStoryBuffInfo;
import emu.lunarcore.proto.TakenChallengeRewardInfoOuterClass.TakenChallengeRewardInfo;
import emu.lunarcore.server.packet.Retcode;
import emu.lunarcore.server.packet.send.PacketStartChallengeScRsp;
import emu.lunarcore.server.packet.send.PacketStartPartialChallengeScRsp;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import lombok.Getter;

@Getter
public class ChallengeManager extends BasePlayerManager {
    private Int2ObjectMap<ChallengeHistory> history;
    private Int2ObjectMap<ChallengeGroupReward> takenRewards;
    
    public ChallengeManager(Player player) {
        super(player);
        this.history = new Int2ObjectOpenHashMap<>();
        this.takenRewards = new Int2ObjectOpenHashMap<>();
    }
    
    // TODO: proof of concept only
    @SuppressWarnings("deprecation")
    public void startPartialChallenge(int challengeId, int buffId, boolean isFirstHalf) {
        // get existing challenge from history
        var challengeHistory = history.get(challengeId);
        var excel = GameData.getChallengeExcelMap().get(challengeId);
        if(challengeHistory == null || excel == null) {
            getPlayer().sendPacket(new PacketStartPartialChallengeScRsp());
            return;
        }
        
        var avatars = isFirstHalf ? challengeHistory.getFirstNodeData().getAvatarIds() : challengeHistory.getSecondNodeData().getAvatarIds();
        var extraLineupType = isFirstHalf ? ExtraLineupType.LINEUP_CHALLENGE : ExtraLineupType.LINEUP_CHALLENGE_2;
        var mapEntranceId = isFirstHalf ? excel.getMapEntranceID() : excel.getMapEntranceID2();
        var groupId = isFirstHalf ? excel.getMazeGroupID1() : excel.getMazeGroupID2();
        var subGroupId = isFirstHalf ? excel.getMazeGroupID2() : excel.getMazeGroupID1();
        
        if(avatars.isEmpty()) {
            getPlayer().sendPacket(new PacketStartPartialChallengeScRsp());
            return;
        }
        getPlayer().getLineupManager().replaceLineup(0,extraLineupType.getNumber(), avatars.stream().toList());
        PlayerLineup lineup = getPlayer().getLineupManager().getExtraLineupByType(extraLineupType.getNumber());
        getPlayer().getLineupManager().setCurrentExtraLineup(extraLineupType, false);
        
        // Reset hp/sp
        lineup.forEachAvatar(avatar -> {
            avatar.setCurrentHp(lineup, 10000);
            avatar.setCurrentSp(lineup, avatar.getMaxSp() / 2);
        });
        
        // Set technique points to full
        lineup.setMp(GameConstants.MAX_MP);

        // Set challenge data for player
        ChallengeInstance instance = new ChallengeInstance(getPlayer(), excel);
        getPlayer().setChallengeInstance(instance);
        
        instance.setPartialChallenge(true);
        instance.setCurrentExtraLineup(extraLineupType);

        // Enter scene
        boolean success = getPlayer().enterScene(mapEntranceId, 0, false);
        if (!success) {
            // Reset lineup/instance if entering scene failed
            getPlayer().getLineupManager().setCurrentExtraLineup(0, false);
            getPlayer().setChallengeInstance(null);
            
            // Send error packet
            getPlayer().sendPacket(new PacketStartPartialChallengeScRsp());
            return;
        }
        
        // load the proper group
        getPlayer().getScene().getEntitiesByGroup(EntityMonster.class, subGroupId).forEach(e -> getPlayer().getScene().removeEntity(e));
        instance.setCurrentStage(isFirstHalf ? 1 : 2);
        getPlayer().getScene().loadGroup(groupId);
        
        // Save start positions
        instance.getStartPos().set(getPlayer().getPos());
        instance.getStartRot().set(getPlayer().getRot());
        instance.setSavedMp(getPlayer().getCurrentLineup().getMp());
        

        // Set boss buffs
        instance.addBuff(buffId);

        // Send packet
        getPlayer().sendPacket(new PacketStartPartialChallengeScRsp(instance, lineup, getPlayer().getScene()));
    }
    
    public void startChallenge(int challengeId, StartChallengeStoryBuffInfo storyBuffs, StartChallengeBossBuffInfo bossBuffs, List<Integer> firstLineups, List<Integer> secondLineups) {
        // Get challenge excel
        ChallengeExcel excel = GameData.getChallengeExcelMap().get(challengeId);
        if (excel == null) {
            getPlayer().sendPacket(new PacketStartChallengeScRsp(Retcode.CHALLENGE_NOT_EXIST));
            return;
        }
        
        // set lineups
        getPlayer().getLineupManager().replaceLineup(0, ExtraLineupType.LINEUP_CHALLENGE_VALUE, firstLineups);
        getPlayer().getLineupManager().replaceLineup(0, ExtraLineupType.LINEUP_CHALLENGE_2_VALUE, secondLineups);
        
        // Sanity check lineups
        if (excel.getStageNum() >= 1) {
            // Get lineup
            PlayerLineup lineup = getPlayer().getLineupManager().getExtraLineupByType(ExtraLineupType.LINEUP_CHALLENGE_VALUE);
            // Make sure this lineup has avatars set
            if (lineup.getAvatars().size() == 0) {
                getPlayer().sendPacket(new PacketStartChallengeScRsp(Retcode.CHALLENGE_LINEUP_EMPTY));
                return;
            }
            // Reset hp/sp
            lineup.forEachAvatar(avatar -> {
                avatar.setCurrentHp(lineup, 10000);
                avatar.setCurrentSp(lineup, avatar.getMaxSp() / 2);
            });
            // Set technique points to full
            lineup.setMp(GameConstants.MAX_MP);
        }
        
        if (excel.getStageNum() >= 2) {
            // Get lineup
            PlayerLineup lineup = getPlayer().getLineupManager().getExtraLineupByType(ExtraLineupType.LINEUP_CHALLENGE_2_VALUE);
            // Make sure this lineup has avatars set
            if (lineup.getAvatars().size() == 0) {
                getPlayer().sendPacket(new PacketStartChallengeScRsp(Retcode.CHALLENGE_LINEUP_EMPTY));
                return;
            }
            // Reset hp/sp
            lineup.forEachAvatar(avatar -> {
                avatar.setCurrentHp(lineup, 10000);
                avatar.setCurrentSp(lineup, avatar.getMaxSp() / 2);
            });
            // Set technique points to full
            lineup.setMp(GameConstants.MAX_MP);
        }

        // Set challenge data for player
        ChallengeInstance instance = new ChallengeInstance(getPlayer(), excel);
        getPlayer().setChallengeInstance(instance);

        // Set first lineup before we enter scenes
        getPlayer().getLineupManager().setCurrentExtraLineup(instance.getCurrentExtraLineup(), false);
        
        // Enter scene
        boolean success = getPlayer().enterScene(excel.getMapEntranceID(), 0, false);
        if (!success) {
            // Reset lineup/instance if entering scene failed
            getPlayer().getLineupManager().setCurrentExtraLineup(0, false);
            getPlayer().setChallengeInstance(null);
            // Send error packet
            getPlayer().sendPacket(new PacketStartChallengeScRsp(Retcode.CHALLENGE_NOT_EXIST));
            return;
        }
        
        // Save start positions
        instance.getStartPos().set(getPlayer().getPos());
        instance.getStartRot().set(getPlayer().getRot());
        instance.setSavedMp(getPlayer().getCurrentLineup().getMp());
        
        // Set story buffs
        if (excel.getType() == ChallengeType.Story && storyBuffs != null) {
            instance.addBuff(storyBuffs.getBuffOne());
            instance.addBuff(storyBuffs.getBuffTwo());
        }
        
        // Set boss buffs
        if (bossBuffs != null) {
            instance.addBuff(bossBuffs.getBuffOne());
            instance.addBuff(bossBuffs.getBuffTwo());
        }

        // Send packet
        getPlayer().sendPacket(new PacketStartChallengeScRsp(getPlayer(), challengeId));
    }
    
    public synchronized void addHistory(ChallengeInstance instance) {
        if(instance.isPartialChallenge()) {
            return; // TODO skip for now
        }
        
        var challengeId = instance.getExcel().getId();
        var stars = instance.getStars();
        var score1 = instance.getScoreStage1();
        var score2 = instance.getScoreStage2();
        var firstLineup = getPlayer().getLineupManager().getExtraLineupByType(ExtraLineupType.LINEUP_CHALLENGE_VALUE).getAvatars();
        var secondLineup = getPlayer().getLineupManager().getExtraLineupByType(ExtraLineupType.LINEUP_CHALLENGE_2_VALUE).getAvatars();
        
        // Don't write challenge history if the player didn't get any stars
        if (stars <= 0) return;
        
        // Get history info
        var info = this.getHistory().computeIfAbsent(challengeId, id -> new ChallengeHistory(getPlayer(), id));

        // Set
        info.setStars(stars);
        info.setScore(score1, score2);
        info.setGroupId(instance.getExcel().getGroupID());
        info.setFirstNodeData(new ChallengeNodeData(instance.getExcel().getType(), 1, instance.getBuffs(), instance.getScoreStage1(), firstLineup));
        info.setSecondNodeData(new ChallengeNodeData(instance.getExcel().getType(),2, instance.getBuffs(), instance.getScoreStage2(), secondLineup));
        info.save();
    }
    
    public synchronized List<TakenChallengeRewardInfo> takeRewards(int groupId) {
        // Get excels
        var challengeGroup = GameData.getChallengeGroupExcelMap().get(groupId);
        if (challengeGroup == null) return null;
        
        var challengeRewardLine = GameDepot.getChallengeRewardLines().get(challengeGroup.getRewardLineGroupID());
        if (challengeRewardLine == null) return null;
        
        // Get total stars
        int totalStars = 0;
        for (ChallengeHistory ch : this.getHistory().values()) {
            // Legacy compatibility
            if (ch.getGroupId() == 0) {
                var challengeExcel = GameData.getChallengeExcelMap().get(ch.getChallengeId());
                if (challengeExcel == null) continue;
                
                ch.setGroupId(challengeExcel.getGroupID());
                ch.save();
            }
            
            // Add total stars
            if (ch.getGroupId() == groupId) {
                totalStars += ch.getTotalStars();
            }
        }
        
        // Rewards
        List<TakenChallengeRewardInfo> rewardInfos = new ArrayList<>();
        List<ItemParam> rewardItems = new ArrayList<>();
        
        // Get challenge rewards
        for (var challengeReward : challengeRewardLine) {
            // Check if we have enough stars to take this reward
            if (totalStars < challengeReward.getStarCount()) {
                continue;
            }
            
            // Get reward info
            var reward = this.getTakenRewards().computeIfAbsent(groupId, id -> new ChallengeGroupReward(getPlayer(), groupId));
            
            // Check if reward has been taken
            if (reward.hasTakenReward(challengeReward.getStarCount())) {
                continue;
            }
            
            // Set reward as taken
            reward.setTakenReward(challengeReward.getStarCount());
            
            // Get reward excel
            var rewardExcel = GameData.getRewardExcelMap().get(challengeReward.getRewardID());
            if (rewardExcel == null) continue;
            
            // Add rewards
            var proto = TakenChallengeRewardInfo.newInstance()
                    .setStarCount(challengeReward.getStarCount());
            
            for (ItemParam itemParam : rewardExcel.getRewards()) {
                proto.getMutableReward().addItemList(itemParam.toProto());
                rewardItems.add(itemParam);
            }
            
            rewardInfos.add(proto);
        }
        
        // Add items to inventory
        getPlayer().getInventory().addItemParams(rewardItems);
        return rewardInfos;
    }
    
    public void loadFromDatabase() {
        // Load challenge history
        Stream<ChallengeHistory> stream = LunarCore.getGameDatabase().getObjects(ChallengeHistory.class, "ownerUid", getPlayer().getUid());

        stream.forEach(info -> {
            this.getHistory().put(info.getChallengeId(), info);
        });
        
        // Load challenge rewards
        Stream<ChallengeGroupReward> stream2 = LunarCore.getGameDatabase().getObjects(ChallengeGroupReward.class, "ownerUid", getPlayer().getUid());

        stream2.forEach(info -> {
            this.getTakenRewards().put(info.getGroupId(), info);
        });
    }
}
