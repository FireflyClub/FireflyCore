package emu.lunarcore.game.enums;

import lombok.Getter;

@Getter
public enum ChallengeType 
{
    None    (0),
    Memory  (1),
    Story   (2),
    Boss    (3);
    
    private final int val;

    private ChallengeType(int value) {
        this.val = value;
    }
}
