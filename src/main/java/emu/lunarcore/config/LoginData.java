package emu.lunarcore.config;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class LoginData {
    private Map<String, UserData> userDataMap = new LinkedHashMap<>();

    public String getLoginPwdByAccount(String account) {
        UserData userData = userDataMap.get(account);
        return userData != null ? userData.getPwds() : null;
    }

    public List<String> getDeviceIdsByAccount(String account) {
        UserData userData = userDataMap.get(account);
        return userData != null ? userData.getDeviceIds() : new ArrayList<>();
    }

    public void update(String account, String pwd, List<String> deviceIds) {
        UserData userData = new UserData(pwd, deviceIds);
        userDataMap.put(account, userData);
        ConfigManager.saveLoginData();
    }

    public static class UserData {
        private String pwds;
        private List<String> deviceIds;

        public UserData(String pwds, List<String> deviceIds) {
            this.pwds = pwds;
            this.deviceIds = deviceIds;
        }

        public String getPwds() {
            return pwds;
        }

        public List<String> getDeviceIds() {
            return deviceIds;
        }
    }
}
