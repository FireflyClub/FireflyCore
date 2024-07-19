package emu.lunarcore.server.http.remote;

import emu.lunarcore.config.ConfigManager;
import emu.lunarcore.game.login.PasswordHandler;

public class PasswordManager {
    public static String getRemotePwdByUid(int uid) {
        return ConfigManager.remoteData.getRemotePwdByUid(uid);
    }
    
    public static void saveRemotePwd(Integer uid, String key) {
        String pwd = PasswordHandler.hashWithMD5(key);
        ConfigManager.getRemoteData().update(uid, pwd);
    }
}
