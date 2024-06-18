package emu.lunarcore.game.enums;

import lombok.Getter;

@Getter
public enum ActivityStarFightDifficultyLevel {
    Easy (1),
    Hard (2);

    private final int val;

    private ActivityStarFightDifficultyLevel(int value) {
        this.val = value;
    }
}
