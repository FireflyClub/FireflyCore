package emu.lunarcore.data.excel;

import emu.lunarcore.data.GameResource;
import emu.lunarcore.data.ResourceType;
import lombok.Getter;

@Getter
@ResourceType(name = {"MusicRhythmSong.json"})
public class MusicRhythmSongExcel extends GameResource {
    private int ID;

    @Override
    public int getId() {
        return ID;
    }

}
