package emu.lunarcore.data.excel;

import emu.lunarcore.data.GameResource;
import emu.lunarcore.data.ResourceType;
import emu.lunarcore.data.common.ItemParam;
import lombok.Getter;

@Getter
@ResourceType(name = {"PlaneEvent.json"})
public class PlaneEventExcel extends GameResource {
    private int[] DropList;
    ItemParam[] DisplayItemList;
    private int EventID;
    private int WorldLevel;
    private int StageID;
    private int Reward;
    private int AvatarExpReward;
    private boolean IsUseMonsterDrop;

    @Override
    public int getId() {
        return (EventID << 8) + WorldLevel;
    }
}
