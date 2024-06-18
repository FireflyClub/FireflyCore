package emu.lunarcore.data.excel;

import emu.lunarcore.data.GameResource;
import emu.lunarcore.data.ResourceType;
import lombok.Getter;

@Getter
@ResourceType(name = {"AdventurePlayer.json"})
public class AdventurePlayerExcel extends GameResource {
    private int AvatarID;
    private String PlayerJsonPath;

    @Override
    public int getId() {
        return getAvatarID();
    }
}