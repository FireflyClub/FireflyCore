package emu.lunarcore.data.excel;
import emu.lunarcore.data.GameResource;
import emu.lunarcore.data.ResourceType;
import lombok.Getter;

@Getter
@ResourceType(name = {"MusicRhythmPhase.json"})
public class MusicRhythmPhaseExcel extends GameResource {
    private int Phase;
    private int SongID;
    
    @Override
    public int getId() {
        return Phase;
    }
}