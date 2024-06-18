package emu.lunarcore.data.excel;

import emu.lunarcore.data.GameResource;
import emu.lunarcore.data.ResourceType;
import lombok.Getter;

@Getter
@ResourceType(name = {"ActivityStarFightGroup.json"})
public class ActivityStarFightGroupExcel extends GameResource {
    private int[] EvaluateWave;
    private int[] TrialAvatar;
    private int GroupID;
    private int MazeBuffID;
    private int PerfectQuest;
    private int PerfectWave;
    private int ActivityModuleID;
    private int TutorialGuideID;

    @Override
    public int getId() {
        return GroupID;
    }
}
