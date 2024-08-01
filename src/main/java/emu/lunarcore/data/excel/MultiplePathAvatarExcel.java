package emu.lunarcore.data.excel;

import emu.lunarcore.data.GameResource;
import emu.lunarcore.data.ResourceType;
import emu.lunarcore.game.player.PlayerGender;
import lombok.Getter;

@Getter
@ResourceType(name = {"MultiplePathAvatarConfig.json"})
public class MultiplePathAvatarExcel extends GameResource {
    private int AvatarID;
    private int BaseAvatarID;
    private PlayerGender Gender;

    @Override
    public int getId() {
        return AvatarID;
    }

    public boolean isDefault() {
        return this.AvatarID == this.BaseAvatarID;
    }

}
