package emu.lunarcore.data.excel;

import emu.lunarcore.data.GameResource;
import emu.lunarcore.data.ResourceType;
import lombok.Getter;

import java.text.SimpleDateFormat;
import java.util.TimeZone;

@Getter
@ResourceType(name = {"ScheduleDataChallengeMaze.json"}, loadPriority = ResourceType.LoadPriority.LOW)
public class ChallengeScheduleExcel extends GameResource {
    private String BeginTime;
    private String EndTime;
    private long BeginTimeMS;
    private long EndTimeMS;
    private int ID;
    
    @Override
    public int getId() {
        return ID;
    }

    @Override
    public void onLoad() {
        var pattern = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        pattern.setTimeZone(TimeZone.getDefault());
        try {
            this.BeginTimeMS = pattern.parse(this.BeginTime).getTime();
            this.EndTimeMS = pattern.parse(this.EndTime).getTime();
        } catch (Exception ex) {
            this.BeginTimeMS = 0;
            this.EndTimeMS = 0;
        }
        
        this.BeginTime = null;
        this.EndTime = null;
    }
}
