package emu.lunarcore.game.player.lineup;

import lombok.Getter;

public class LineupAvatarInfo {
    
    @Getter public int baseAvatarId;
    @Getter public int assistUid;
    @Getter public int specialAvatarId;

    // Default constructor
    public LineupAvatarInfo() {
        this.assistUid = 0;
        this.specialAvatarId = 0;
        this.baseAvatarId = 0;
    }

    public LineupAvatarInfo(int baseAvatarId) {
        this.baseAvatarId = baseAvatarId;
        this.assistUid = 0;
        this.specialAvatarId = 0;
    }

    public LineupAvatarInfo(int baseAvatarId, int specialAvatarId) {
        this.baseAvatarId = baseAvatarId;
        this.assistUid = 0;
        this.specialAvatarId = specialAvatarId;
    }
}
