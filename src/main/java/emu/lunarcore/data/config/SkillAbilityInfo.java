package emu.lunarcore.data.config;

import java.util.List;

import emu.lunarcore.data.GameData;
import emu.lunarcore.data.excel.AvatarExcel;
import emu.lunarcore.game.battle.skills.*;
import lombok.Getter;

/**
 *  Original name: SkillAbilityConfig
 */
public class SkillAbilityInfo {
    private List<AbilityInfo> AbilityList;

    public boolean parse(AvatarExcel avatarExcel) {
        // Init variable
        MazeSkill skill = null;
        
        // Look for MazeSkill
        for (AbilityInfo ability : AbilityList) {
            //
            List<MazeSkillAction> actionList = null;
            
            // Skip if not a maze skill
            if (ability.getName().endsWith("MazeSkill")) {
                skill = new MazeSkill(avatarExcel, 2);
                avatarExcel.setMazeSkill(skill);
                
                actionList = skill.getCastActions();
                
                // Hacky way to check if an avatar can summon with their skill
                var excel = GameData.getSummonUnitExcelMap().get((skill.getId() * 10) + 1);
                if (excel != null && !excel.isIsClient() && excel.getInfo() != null) {
                    // TODO duration is hardcoded
                    skill.getCastActions().add(new MazeSkillSummonUnit(excel, 20));
                }
            } else if (ability.getName().contains("NormalAtk")) {
                skill = new MazeSkill(avatarExcel, 1);
                avatarExcel.setMazeAttack(skill);
                
                actionList = skill.getAttackActions();
            } else {
                continue;
            }
            
            // Parse tasks
            for (TaskInfo task : ability.getOnStart()) {
                parseTask(skill, actionList, task);
            }
        }
        
        return true;
    }
    
    // "Simple" way to parse maze attacks/skills
    // TODO parse tasks better
    private void parseTask(MazeSkill skill, List<MazeSkillAction> actionList, TaskInfo task) {
        if (task.getType().contains("AddMazeBuff")) {
            // TODO get duration from params if buff duration is dynamic
            actionList.add(new MazeSkillAddBuff(task.getID(), 20, skill.getIndex()));
        } else if (task.getType().contains("RemoveMazeBuff")) {
            actionList.removeIf(action -> action instanceof MazeSkillAddBuff actionAdd && actionAdd.getBuffId() == task.getID());
        } else if (task.getType().contains("AdventureModifyTeamPlayerHP")) {
            // TODO get hp increase value from params
            actionList.add(new MazeSkillModifyHP(15));
        } else if (task.getType().contains("AdventureModifyTeamPlayerSP")) {
            // TODO get sp increase value from params, also handle target alias
            actionList.add(new MazeSkillModifySP(50));
        } else if (task.getType().contains("CreateSummonUnit")) {
            skill.setTriggerBattle(false);
        } else if (task.getType().contains("AdventureSetAttackTargetMonsterDie")) {
            actionList.add(new MazeSkillSetAttackTargetMonsterDie());
            skill.setTriggerBattle(true);
        } else if (task.getSuccessTaskList() != null) {
            for (TaskInfo t : task.getSuccessTaskList()) {
                parseTask(skill, actionList, t);
            }
        } else if (task.getType().contains("AdventureTriggerAttack")) {
            if (skill.getIndex() == 2) {
                var isSummonUnit = skill.getCastActions().stream().anyMatch(p -> p instanceof MazeSkillSummonUnit);
                skill.setTriggerBattle(!isSummonUnit && task.isTriggerBattle());
            }
            if (task.getOnAttack() != null) {
                for (TaskInfo t : task.getOnAttack()) {
                    parseTask(skill, skill.getAttackActions(), t);
                }
            }
            if (task.getOnBattle() != null) {
                for (TaskInfo t : task.getOnBattle()) {
                    parseTask(skill, skill.getAttackActions(), t);
                }
            }
        } else if (task.getType().contains("AdventureFireProjectile")) {
            if (task.getOnProjectileHit() != null) {
                for (TaskInfo t : task.getOnProjectileHit()) {
                    parseTask(skill, skill.getAttackActions(), t);
                }
            }
            if (task.getOnProjectileLifetimeFinish() != null) {
                for (TaskInfo t : task.getOnProjectileLifetimeFinish()) {
                    parseTask(skill, skill.getAttackActions(), t);
                }
            }
        } 
        // TODO: Hardcoded toughness reduce on skill cast (Acheron & SilverWolf)
        else if (
            task.getType().contains("AddAdventureModifier") &&
            "ADV_StageAbility_Maze_IgnoreWeakness_MazeSkillMark".equals(task.getModifierName())
        ) {
            // Modifier Name: ADV_StageAbility_MazeCommon_EnterBattle_IgnoreWeakness
            skill.getAttackActions().add(new MazeSkillAddBuff(1000119, 20, skill.getIndex()));
        }
    }
    
    /**
     * The equivalent of the AbilityConfig class in anime game.
     */
    @Getter
    public class AbilityInfo {
        private String Name;
        private List<TaskInfo> OnStart;
    }
}
