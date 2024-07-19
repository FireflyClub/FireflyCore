package emu.lunarcore.config;

import java.util.LinkedHashMap;
import java.util.Map;

public class RemoteData {
    private Map<Integer, String> pwds = new LinkedHashMap<>();

    public String getRemotePwdByUid(int uid) {
        return pwds.getOrDefault(uid, null);
    }

    public void update(int uid, String pwd) {
        pwds.put(uid, pwd);
        ConfigManager.saveRemoteData();
    }
}
