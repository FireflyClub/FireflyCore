package emu.lunarcore.game.battle.skills;

import emu.lunarcore.game.avatar.GameAvatar;
import emu.lunarcore.proto.MotionInfoOuterClass.MotionInfo;
import it.unimi.dsi.fastutil.ints.IntSet;

public class MazeSkillModifyHP extends MazeSkillAction {
    private int amount;
    
    public MazeSkillModifyHP(int hp) {
        this.amount = hp * 100;
    }

    @Override
    public void onCast(GameAvatar caster, MotionInfo castPosition, IntSet hitTargets) {
        caster.getOwner().getCurrentLineup().heal(this.amount, false);
    }

}