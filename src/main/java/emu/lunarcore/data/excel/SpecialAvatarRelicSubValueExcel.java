package emu.lunarcore.data.excel;

import com.google.gson.annotations.SerializedName;
import emu.lunarcore.data.GameData;
import emu.lunarcore.data.GameResource;
import emu.lunarcore.data.ResourceType;
import emu.lunarcore.game.enums.AvatarPropertyType;
import emu.lunarcore.game.inventory.GameItemSubAffix;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@ResourceType(name = {"SpecialAvatarRelicSubValue.json"})
public class SpecialAvatarRelicSubValueExcel extends GameResource {
    private int RelicSubValueType;
    private RelicSubValue[] SubValue;
    
    public static class RelicSubValue {
        // 2.2.55
        @SerializedName("EPBOOFFCKPJ")
        @Getter
        private double Value;
        
        // 2.2.55
        @SerializedName("MBNHLGAKCLM")
        @Getter
        private AvatarPropertyType Type; 
    }
    
    
    @Override
    public int getId() {
        return RelicSubValueType;
    }
    
    public List<GameItemSubAffix> toGameItemSubAffixList(int rarity) {
        var list = new ArrayList<GameItemSubAffix>();
        for (var subValue: getSubValue()) {
            var excel = GameData.getRelicSubAffixExcel(rarity, subValue.getType());
            if(excel == null) continue;
            var affix = new GameItemSubAffix(excel, subValue.getValue());
            list.add(affix);
        }
        
        return list;
    }
}
