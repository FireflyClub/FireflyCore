package emu.lunarcore.data.excel;
import emu.lunarcore.data.GameResource;
import emu.lunarcore.data.ResourceType;
import lombok.Getter;

@Getter
@ResourceType(name = {"MusicRhythmGroup.json"})
public class MusicRhythmGroupExcel extends GameResource {
    private int ID;
    private int Index;
    private int Phase;
    
    @Override
    public int getId() {
        return ID;
    }
}