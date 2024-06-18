package emu.lunarcore.game.enums;

import lombok.Getter;

@Getter
public enum SpecialAvatarType {
	TYPE_NONE ( 0),
	TYPE_TRIAL ( 1),
	TYPE_MISSION ( 2),
	TYPE_FAKE ( 3),
	TYPE_PLOT ( 4);

    private final int val;

    private SpecialAvatarType(int value) {
        this.val = value;
    }
}
