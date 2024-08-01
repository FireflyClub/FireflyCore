package emu.lunarcore.data.excel;

import emu.lunarcore.data.GameResource;
import emu.lunarcore.data.ResourceType;
import lombok.Getter;

@Getter
@ResourceType(name = {"TutorialGuideGroup.json"})
public class TutorialGuideGroupExcel extends GameResource {
    private int GroupID;

    @Override
    public int getId() {
        return GroupID;
    }
}
