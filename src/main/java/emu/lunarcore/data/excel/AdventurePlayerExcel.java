package emu.lunarcore.data.excel;

import emu.lunarcore.data.GameResource;
import emu.lunarcore.data.ResourceType;
import lombok.Getter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Getter
@ResourceType(name = {"AdventurePlayer.json"})
public class AdventurePlayerExcel extends GameResource {
    private int AvatarID;
    private String PlayerJsonPath;
    private String name;
    
    private static Pattern namePattern = Pattern.compile("LocalPlayer_(.*?)_Config");

    @Override
    public int getId() {
        return AvatarID;
    }

    @Override
    public void onLoad() {
        Matcher matcher = namePattern.matcher(this.PlayerJsonPath);

        if (matcher.find()) {
            this.name = matcher.group(1);
        }
        
        this.PlayerJsonPath = null;
    }
}
