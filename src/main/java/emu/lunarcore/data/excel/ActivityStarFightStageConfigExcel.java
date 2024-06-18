package emu.lunarcore.data.excel;

import emu.lunarcore.data.GameResource;
import emu.lunarcore.data.ResourceType;
import emu.lunarcore.game.enums.ActivityStarFightDifficultyLevel;
import lombok.Getter;

@Getter
@ResourceType(name = {"ActivityStarFightStageConfig.json"})
public class ActivityStarFightStageConfigExcel extends GameResource {
    private int[] QuestList;
    private int GroupID;
    private ActivityStarFightDifficultyLevel DifficultyLevel;
    private int EventID;
    private int UnlockQuest;
    private int BattleAreaID;

    @Override
    public int getId() {
        return (GroupID << 8) + DifficultyLevel.getVal();
    }
}
