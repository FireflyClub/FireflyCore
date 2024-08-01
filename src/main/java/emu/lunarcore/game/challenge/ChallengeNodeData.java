package emu.lunarcore.game.challenge;

import dev.morphia.annotations.Entity;
import emu.lunarcore.game.enums.ChallengeType;
import it.unimi.dsi.fastutil.ints.IntList;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import lombok.Getter;

import java.util.List;

@Getter
@Entity(useDiscriminator = false)
public class ChallengeNodeData {
    private int buffId;
    private int stageScore;
    private boolean isWin;
    private boolean unkBoolean;
    private IntSet avatarIds;
    
    @Deprecated
    public ChallengeNodeData() {
        // Morphia Only
    }
    
    public ChallengeNodeData(ChallengeType type, int nodeNum, IntList buffs, int stageScore, List<Integer> avatarIds) {
        if(type != ChallengeType.Memory) {
             try {
                 this.buffId = buffs.getInt(nodeNum - 1);
             } catch (Exception ex) {
                 this.buffId = 0;
             }
        }
        
        this.stageScore = stageScore;
        this.isWin = true;
        this.unkBoolean = true;
        
        var list = new IntOpenHashSet();
        list.addAll(avatarIds);
        
        this.avatarIds = list;
    }
}
