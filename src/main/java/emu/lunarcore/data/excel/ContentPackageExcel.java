package emu.lunarcore.data.excel;

import emu.lunarcore.data.GameResource;
import emu.lunarcore.data.ResourceType;
import lombok.Getter;

@Getter
@ResourceType(name = {"ContentPackageConfig.json"})
public class ContentPackageExcel extends GameResource {
    private int ContentID;

    @Override
    public int getId() {
        return ContentID;
    }
}