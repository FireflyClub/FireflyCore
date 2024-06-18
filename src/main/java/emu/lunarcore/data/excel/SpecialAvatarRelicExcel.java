package emu.lunarcore.data.excel;

import com.google.gson.annotations.SerializedName;
import emu.lunarcore.data.GameData;
import emu.lunarcore.data.GameResource;
import emu.lunarcore.data.ResourceType;
import emu.lunarcore.proto.BattleRelicOuterClass.BattleRelic;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;


@Getter
@ResourceType(name = {"SpecialAvatarRelic.json"})
public class SpecialAvatarRelicExcel extends GameResource {
    private int RelicPropertyType;
    private RelicMainValue[] RelicIDList;

    public static class RelicMainValue {
        // 2.2.55
        @SerializedName("ABIFNKLGDHJ")
        @Getter
        private int RelicID;

        // 2.2.55
        @SerializedName("ALMJPFGBLMJ")
        @Getter
        private int Level;
    }


    @Override
    public int getId() {
        return RelicPropertyType;
    }
    
    public List<BattleRelic> toBattleRelicList(SpecialAvatarExcel specialAvatarExcel) {
        var list = new ArrayList<BattleRelic>();
        
        for (var relic: getRelicIDList()) {
            var excel = GameData.getRelicExcelMap().get(relic.getRelicID());
            var specialAvatarRelicMainValue = GameData.getSpecialAvatarRelicMainValueExcelMap().get(specialAvatarExcel.getRelicMainValue());
            var item = specialAvatarRelicMainValue.getMainValue()[excel.getType().getVal() - 1];
            var mainAffix = GameData.getRelicMainAffixExcel(excel.getMainAffixGroup(), item.getType());
            var proto = BattleRelic
                .newInstance()
                .setId(relic.getRelicID())
                .setLevel(relic.getLevel())
                .setUniqueId(0)
                .setMainAffixId(mainAffix.getAffixID());
            
            for (var subAffix: GameData.getSpecialAvatarRelicSubValueExcelMap().get(specialAvatarExcel.getRelicSubValue()).toGameItemSubAffixList(5)) {
                proto.addSubAffixList(subAffix.toProto());
            };
        }
        
        return list;
    }
}
