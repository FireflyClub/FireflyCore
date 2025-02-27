package emu.lunarcore.data.config;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import emu.lunarcore.game.enums.PropState;
import emu.lunarcore.game.scene.triggers.TriggerOpenTreasureWhenMonsterDie;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import lombok.Getter;

/**
 *  Original name: LevelFloorInfo
 */
@Getter
public class FloorInfo {
    private int FloorID;
    private int StartGroupIndex;
    private int StartAnchorID;

    @SerializedName(value = "SavedValues")
    private List<ExtraDataInfo> savedValues;
    
    @SerializedName(value = "GroupInstanceList")
    private List<FloorGroupSimpleInfo> GroupInstanceList;
    
    private List<RtLevelDimensionInfo> DimensionList;

    // Cached data
    private transient boolean loaded;
    private transient List<GroupInfo> groupList;
    private transient Int2ObjectMap<GroupInfo> groups;
    private transient Int2ObjectMap<PropInfo> cachedTeleports;
    private transient List<PropInfo> unlockedCheckpoints; // DEBUG
    
    public FloorInfo() {
        this.groupList = new ArrayList<>();
        this.groups = new Int2ObjectOpenHashMap<>();
        this.cachedTeleports = new Int2ObjectOpenHashMap<>();
        this.unlockedCheckpoints = new ArrayList<>();
        this.savedValues = new ArrayList<>();
    }
    
    public GroupInfo getGroupInfoByIndex(int groupIndex) {
        return groupList.get(groupIndex);
    }
    
    public AnchorInfo getStartAnchorInfo() {
        GroupInfo group = this.getGroupInfoByIndex(StartGroupIndex);
        if (group == null) return null;
        
        return getAnchorInfo(group, StartAnchorID);
    }

    public List<ExtraDataInfo> getExtraDatas() {
        if (this.savedValues == null) {
            this.savedValues = new ArrayList<>();
        }
        
        return this.savedValues;
    }
    
    public AnchorInfo getAnchorInfo(int groupId, int anchorId) {
        GroupInfo group = this.getGroups().get(groupId);
        if (group == null) return null;
        
        return getAnchorInfo(group, anchorId);
    }
    
    public AnchorInfo getAnchorInfo(GroupInfo group, int anchorId) {
        return group.getAnchorList().stream().filter(a -> a.getID() == anchorId).findFirst().orElse(null);
    }
    
    public void onLoad() {
        if (this.loaded) return;

        this.savedValues = getExtraDatas();
        
        // Cache anchors
        for (GroupInfo group : groups.values()) {
            if (group.getPropList() == null) {
                continue;
            }
            
            for (PropInfo prop : group.getPropList()) {
                // Check if prop can be teleported to
                if (prop.getAnchorID() > 0) {
                    // Put inside cached teleport list to send to client when they request map info
                    this.cachedTeleports.put(prop.getMappingInfoID(), prop);
                    this.unlockedCheckpoints.add(prop);
                    
                    // Force prop to be in the unlocked state
                    prop.setState(PropState.CheckPointEnable);
                } else if (prop.getInitLevelGraph() != null) {
                    String json = prop.getInitLevelGraph();
                    
                    // Hacky way to setup prop triggers
                    if (json.contains("Maze_GroupProp_OpenTreasure_WhenMonsterDie")) {
                        prop.setTrigger(new TriggerOpenTreasureWhenMonsterDie(group.getId()));
                    } else if (json.contains("Common_Console")) {
                        prop.setCommonConsole(true);
                    } else if (prop.getInitLevelGraph().contains("DeployPuzzle_Board")) {
                        prop.setIsClientOnly(true);
                    }
                    
                    // Clear for garbage collection
                    prop.setValueSource(null);
                    prop.setInitLevelGraph(null);
                }
            }
        }
        
        if (DimensionList != null) {
            for (var dimension: DimensionList) {
                dimension.onLoad(this);
            }
        }

        this.loaded = true;
    }

    public IntList getLoadedGroups() {
        IntList ret = new IntArrayList();
        
        for (var dim: DimensionList) {
            if(dim.ID == 0) {
                ret.addAll(dim.groupIdList);
            }
        }
        
        return ret;
    }

    @Getter
    public static class ExtraDataInfo {
        private int ID;
        private String Name;
        private int DefaultValue;
        private List<Integer> AllowedValues;
        private int MaxValue;
        private Integer MinValue;
    }
    
    @Getter
    public static class FloorGroupSimpleInfo {
        private String GroupPath;
        private boolean IsDelete;
        private int ID;
    }

    @Getter
    public static class RtLevelDimensionInfo {
        private int ID;
        private int[] GroupIndexList;
        
        private IntSet groupIdList;
        
        public RtLevelDimensionInfo() {
            this.groupIdList = new IntOpenHashSet();
        }
        
        public void onLoad(FloorInfo floor) {
            for (var id: GroupIndexList) {
                var groupId = floor.getGroupInstanceList().get(id).getID();
                getGroupIdList().add(groupId);
            }
        }
    }
}
