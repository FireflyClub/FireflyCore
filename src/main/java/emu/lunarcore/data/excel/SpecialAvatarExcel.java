package emu.lunarcore.data.excel;

import emu.lunarcore.data.GameResource;
import emu.lunarcore.data.ResourceType;
import emu.lunarcore.game.enums.SpecialAvatarType;
import emu.lunarcore.proto.AvatarTypeOuterClass;
import emu.lunarcore.proto.BattleAvatarOuterClass.BattleAvatar;
import emu.lunarcore.proto.BattleEquipmentOuterClass.BattleEquipment;
import emu.lunarcore.proto.SpBarInfoOuterClass;
import lombok.Getter;

@Getter
@ResourceType(name = {"SpecialAvatar.json"})
public class SpecialAvatarExcel extends GameResource {
    private int SpecialAvatarID;
    private int WorldLevel;
    private int AvatarID;
    private int PlayerID;
    private SpecialAvatarType Type;
    private int Level;
    private int Promotion;
    private int Rank;
    private int EquipmentID;
    private int EquipmentLevel;
    private int EquipmentPromotion;
    private int EquipmentRank;
    private int RelicPropertyType;
    private int RelicPropertyTypeExtra;
    private int RelicMainValue;
    private int RelicSubValue;

    @Override
    public int getId() {
        return (SpecialAvatarID << 8) + WorldLevel;
    }
    
    public BattleAvatar toBattleAvatarProto(int index) {
        var proto = BattleAvatar
            .newInstance()
            // TODO: still hardcoded
            .setAvatarType(AvatarTypeOuterClass.AvatarType.AVATAR_TRIAL_TYPE)
            .setId(getSpecialAvatarID())
            .setLevel(getLevel())
            .setPromotion(getPromotion())
            .setRank(getRank())
            .setIndex(index)
            .setHp(10_000)
            .setSpBar(SpBarInfoOuterClass.SpBarInfo.newInstance().setCurSp(10_000).setMaxSp(10_000))
            .setWorldLevel(getWorldLevel());
        
        proto.addEquipmentList(
            BattleEquipment
                .newInstance()
                .setId(getEquipmentID())
                .setLevel(getEquipmentLevel())
                .setRank(getEquipmentRank())
                .setPromotion(getEquipmentPromotion())
        );
        
        /*
        if (getRelicPropertyType() > 0) {
            var relics = GameData.getSpecialAvatarRelicExcelMap().get(getRelicPropertyType());
            for (var relic:  relics.toBattleRelicList(this)) {
                proto.addRelicList(relic);
            }
        }
        
        if (getRelicPropertyTypeExtra() > 0) {
           var planars = GameData.getSpecialAvatarRelicExcelMap().get(getRelicPropertyTypeExtra());
            for (var relic:  planars.toBattleRelicList(this)) {
                proto.addRelicList(relic);
            }
        }
        */

        return proto;
    }
}
