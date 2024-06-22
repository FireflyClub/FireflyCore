package emu.lunarcore.data.excel;

import emu.lunarcore.data.GameResource;
import emu.lunarcore.data.ResourceType;
import lombok.Getter;

@Getter
@ResourceType(name = {"MultiplePathAvatarConfig.json"})
public class MultiplePathAvatarConfigExcel extends GameResource {
    private int AvatarID;
    private int BaseAvatarID;
    
    public MultiplePathAvatarConfigExcel() {}
    
    @Override
    public int getId() {
        return AvatarID;
    }
}
