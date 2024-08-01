package emu.lunarcore.game.challenge;

import emu.lunarcore.GameConstants;
import emu.lunarcore.data.GameData;
import emu.lunarcore.data.config.GroupInfo;
import emu.lunarcore.data.config.MonsterInfo;
import emu.lunarcore.data.config.NpcInfo;
import emu.lunarcore.data.config.GroupInfo.GroupLoadSide;
import emu.lunarcore.data.excel.NpcMonsterExcel;
import emu.lunarcore.data.excel.ChallengeExcel.ChallengeMonsterInfo;
import emu.lunarcore.game.enums.ChallengeType;
import emu.lunarcore.game.scene.Scene;
import emu.lunarcore.game.scene.SceneEntityLoader;
import emu.lunarcore.game.scene.entity.EntityMonster;
import emu.lunarcore.game.scene.entity.EntityNpc;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;

public class ChallengeEntityLoader extends SceneEntityLoader {
    
    @Override
    public void onSceneLoad(Scene scene) {
        // Get challenge instance
        ChallengeInstance instance = scene.getPlayer().getChallengeInstance();
        if (instance == null) return;
        
        // Setup first stage
        scene.loadGroup(instance.getExcel().getMazeGroupID1());
        
        // Set leave entry
        scene.setLeaveEntryId(
            instance.getExcel().getType() == ChallengeType.Story ? 
                GameConstants.CHALLENGE_STORY_ENTRANCE : instance.getExcel().getType() == ChallengeType.Boss ? 
                    GameConstants.CHALLENGE_BOSS_ENTRANCE : GameConstants.CHALLENGE_ENTRANCE
        );
        
        // Load all groups with props
        for (var group : scene.getFloorInfo().getGroups().values()) {
            // Skip non-server groups
            if (group.getLoadSide() != GroupLoadSide.Server) {
                continue;
            }
            
            // Dont load the groups that have monsters in them
            if (group.getPropList().size() > 0 && group.getMonsterList().size() == 0) {
                scene.loadGroup(group);
            }
        }
    }
    
    @Override
    public EntityMonster loadMonster(Scene scene, GroupInfo group, MonsterInfo monsterInfo) {
        // Get challenge instance
        ChallengeInstance instance = scene.getPlayer().getChallengeInstance();
        if (instance == null) return null;
        
        // Get current stage monster infos
        Int2ObjectMap<ChallengeMonsterInfo> challengeMonsters = null;
        if (instance.getCurrentStage() == 1) {
            challengeMonsters = instance.getExcel().getChallengeMonsters1();
        } else if (instance.getCurrentStage() == 2) {
            challengeMonsters = instance.getExcel().getChallengeMonsters2();
        } else {
            return null;
        }
        
        // Get challenge monster info
        var challengeMonsterInfo = challengeMonsters.get(monsterInfo.getID());
        if (challengeMonsterInfo == null) return null;
        
        // Get excels from game data
        NpcMonsterExcel npcMonsterExcel = GameData.getNpcMonsterExcelMap().get(challengeMonsterInfo.getNpcMonsterId());
        if (npcMonsterExcel == null) return null;
        
        // Create monster from group monster info
        EntityMonster monster = new EntityMonster(scene, npcMonsterExcel, group, monsterInfo);
        monster.setEventId(challengeMonsterInfo.getEventId());
        monster.setCustomStage(challengeMonsterInfo.getEventId());
        monster.setWorldLevel(scene.getPlayer().getWorldLevel());
        
        return monster;
    }
    
    @Override
    public EntityNpc loadNpc(Scene scene, GroupInfo group, NpcInfo npcInfo) {
        return null;
    }
}
