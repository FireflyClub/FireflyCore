package emu.lunarcore.data.excel;

import emu.lunarcore.data.GameResource;
import emu.lunarcore.data.ResourceType;
import lombok.Getter;

@Getter
@ResourceType(name = {"MainMission.json"})
public class MainMissionExcel extends GameResource {
    private int MainMissionID;
    private String Type;
    private int ChapterID;
    private int RewardID;

    @Override
    public int getId() {
        return MainMissionID;
    }
}