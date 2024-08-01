package emu.lunarcore.data.excel;

import emu.lunarcore.data.GameResource;
import emu.lunarcore.data.ResourceType;
import lombok.Getter;

@Getter
@ResourceType(name = {"TutorialData.json"})
public class TutorialExcel extends GameResource {
    private int TutorialID;

    @Override
    public int getId() {
        return TutorialID;
    }
}
