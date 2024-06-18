package emu.lunarcore.data.excel;

import com.google.gson.annotations.SerializedName;
import emu.lunarcore.data.GameResource;
import emu.lunarcore.data.ResourceType;
import emu.lunarcore.game.enums.AvatarPropertyType;
import lombok.Getter;

@Getter
@ResourceType(name = {"SpecialAvatarRelicMainValue.json"})
public class SpecialAvatarRelicMainValueExcel extends GameResource {
    private int RelicMainValueType;
    private RelicMainValue[] MainValue;

    public static class RelicMainValue {
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
        return RelicMainValueType;
    }
}
