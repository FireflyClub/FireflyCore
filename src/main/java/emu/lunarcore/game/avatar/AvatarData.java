package emu.lunarcore.game.avatar;

import dev.morphia.annotations.Entity;
import emu.lunarcore.data.excel.AvatarExcel;
import emu.lunarcore.game.inventory.GameItem;
import emu.lunarcore.game.player.Player;
import it.unimi.dsi.fastutil.ints.Int2IntMap;
import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import lombok.Getter;
import lombok.Setter;

/**
 * A helper class that contains information about an avatar's rank.
 */
@Getter
@Entity(useDiscriminator = false)
public class AvatarData {
    @Setter private int rank; // Eidolons
    private Int2IntMap skills; // Skill tree
    
    @Setter private transient IAvatar baseAvatar;
    private transient Int2ObjectMap<GameItem> equips;
        
    @Deprecated // Morphia only
    public AvatarData() {
        this.equips = new Int2ObjectOpenHashMap<>();
    }
    
    public AvatarData(AvatarExcel excel) {
        this();
        this.skills = new Int2IntOpenHashMap();
        for (var skillTree : excel.getDefaultSkillTrees()) {
            this.skills.put(skillTree.getPointID(), skillTree.getLevel());
        }
    }
    
    public Player getOwner() {
        return this.getBaseAvatar().getOwner();
    }
}
