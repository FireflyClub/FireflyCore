package emu.lunarcore.game.battle.skills;

import java.util.List;

import emu.lunarcore.game.avatar.GameAvatar;
import emu.lunarcore.game.scene.entity.GameEntity;
import emu.lunarcore.proto.MotionInfoOuterClass.MotionInfo;
import it.unimi.dsi.fastutil.ints.IntSet;

public abstract class MazeSkillAction {
    
    
    public void onCast(GameAvatar caster, MotionInfo castPosition, IntSet hitMonsters) {
        
    }
    
    public void onCastHit(GameAvatar caster, List<? extends GameEntity> entities) {
        
    }
    
    public void onAttack(GameAvatar caster, List<? extends GameEntity> targets) {
        
    }
    
}