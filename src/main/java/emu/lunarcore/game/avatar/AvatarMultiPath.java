package emu.lunarcore.game.avatar;

import java.util.Map;

import org.bson.types.ObjectId;

import dev.morphia.annotations.Entity;
import dev.morphia.annotations.Id;
import dev.morphia.annotations.Indexed;

import emu.lunarcore.LunarCore;
import emu.lunarcore.data.excel.AvatarExcel;
import emu.lunarcore.game.enums.ItemMainType;
import emu.lunarcore.game.player.Player;
import emu.lunarcore.proto.AvatarSkillTreeOuterClass.AvatarSkillTree;
import emu.lunarcore.proto.EquipRelicOuterClass.EquipRelic;
import emu.lunarcore.proto.MultiPathAvatarTypeInfoOuterClass.MultiPathAvatarTypeInfo;
import emu.lunarcore.proto.PlayerSyncScNotifyOuterClass.PlayerSyncScNotify;
import lombok.Getter;
import lombok.Setter;

@Getter
@Entity(value = "multiPaths", useDiscriminator = false)
public class AvatarMultiPath extends BaseAvatar {
    @Id private ObjectId id;
    @Indexed private int ownerUid;
    
    private int excelId;
    private AvatarData data;
    
    @Setter private transient Player owner;
    @Setter private transient GameAvatar avatar;
    private transient AvatarExcel excel;
    
    @Deprecated // Morphia only!
    public AvatarMultiPath() {
        
    }
    
    public AvatarMultiPath(Player player, AvatarExcel excel) {
        // Set excel avatar id as id
        this.excelId = excel.getId();
        this.ownerUid = player.getUid();
        this.owner = player;
        this.setExcel(excel);
    }
    
    public void setExcel(AvatarExcel excel) {
        if (this.excel == null) {
            this.excel = excel;
        }
        if (this.data == null) {
            this.data = new AvatarData(excel);
        }
        this.data.setBaseAvatar(this);
    }
    
    public int getRank() {
        return this.getData().getRank();
    }
    
    public Map<Integer, Integer> getSkills() {
        return this.getData().getSkills();
    }

    // Player sync
    public void onSync(PlayerSyncScNotify proto) {
        proto.addMultiPathAvatarInfoList(this.toProto());
    }

    // Proto
    public MultiPathAvatarTypeInfo toProto() {
        var proto = MultiPathAvatarTypeInfo.newInstance()
                .setAvatarIdValue(this.getExcelId())
                .setPathEquipmentId(0)
                .setRank(this.getRank());
        
        for (var skill : getSkills().entrySet()) {
            proto.addSkillTreeList(AvatarSkillTree.newInstance().setPointId(skill.getKey()).setLevel(skill.getValue()));
        }
        
        for (var equip : getEquips().values()) {
            if (equip.getItemMainType() == ItemMainType.Relic) {
                proto.addEquipRelicList(EquipRelic.newInstance().setSlot(equip.getEquipSlot()).setRelicUniqueId(equip.getInternalUid()));
            } else if (equip.getItemMainType() == ItemMainType.Equipment) {
                proto.setPathEquipmentId(equip.getInternalUid());
            }
        }
        
        return proto;
    }
    
    // Database
    public void save() {
        LunarCore.getGameDatabase().save(this);
    }
}
