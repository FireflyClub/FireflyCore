package emu.lunarcore.config;

import java.util.Map;
import java.util.LinkedHashMap;

public class TagData {
    private Map<Integer, String> tags = new LinkedHashMap<>();

    public String getTagByUid(int uid) {
        return tags.getOrDefault(uid, "Player");
    }

    public void add(int uid, String tag) {
        tags.put(uid, tag);
        ConfigManager.saveTagData();
    }

    public void remove(int uid) {
        tags.remove(uid);
        ConfigManager.saveTagData();
    }

}