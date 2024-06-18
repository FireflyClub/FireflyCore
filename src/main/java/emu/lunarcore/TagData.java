package emu.lunarcore;

import java.util.Map;
import java.util.LinkedHashMap;

public class TagData {
    private Map<Integer, String> tags = new LinkedHashMap<>(); // 使用 LinkedHashMap 保证插入顺序

    // add tag
    public void loadTags(Map<Integer, String> tags) {
        this.tags.putAll(tags);
    }

    // get tag by uid
    public String getTagByUid(int uid) {
        return tags.getOrDefault(uid, "Player");
    }

    // get all tags
    public Map<Integer, String> getTags() {
        return tags;
    }

    public void addTag(int uid, String tag) {
        tags.put(uid, tag);
        LunarCore.saveTagData();
    }

    public void removeTag(int uid) {
        tags.remove(uid);
        LunarCore.saveTagData();
    }
}