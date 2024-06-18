package emu.lunarcore.data.excel;

import emu.lunarcore.data.GameResource;
import emu.lunarcore.data.ResourceType;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import lombok.Getter;

@Getter
@ResourceType(name = {"ContentPackageConfig.json"})
public class ContentPackageExcel extends GameResource {
    private IntArrayList MainMissionIDList;
    private String EarlyAccessCondition;
    private String EarlyFinishCondition;
    private String ReleaseCondition;
    private String GuideConditions;
    private int ContentID;
    private int ActivityModuleID;
    private int InitEntranceID;
    private int AfterGuideEntranceID;

    @Override
    public int getId() {
        return getContentID();
    }
}