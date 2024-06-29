package emu.lunarcore.game.battle.skills;

import java.util.List;

import emu.lunarcore.game.avatar.GameAvatar;
import emu.lunarcore.game.scene.entity.GameEntity;
import emu.lunarcore.proto.MotionInfoOuterClass.MotionInfo;
import it.unimi.dsi.fastutil.ints.IntSet;

public class MazeSkillModifySP extends MazeSkillAction {
    private int amount;
    
    public MazeSkillModifySP(int sp) {
        this.amount = sp * 100;
    }

    @Override
    public void onCast(GameAvatar caster, MotionInfo castPosition, IntSet hitTargets) {
        caster.setCurrentSp(
                caster.getOwner().getCurrentLineup(), 
                amount + caster.getCurrentSp(caster.getOwner().getCurrentLineup())
        );
    }

    @Override
    public void onCastHit(GameAvatar caster, List<? extends GameEntity> entities) {
        
    }

}