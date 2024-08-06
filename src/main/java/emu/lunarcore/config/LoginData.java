package emu.lunarcore.config;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class LoginData {
    private Map<String, UserData> userDataMap = new LinkedHashMap<>();

    public boolean isUserExist(String user) {
        return userDataMap.containsKey(user);
    }

    public String getLoginPwdByUser(String user) {
        UserData userData = userDataMap.get(user);
        return userData != null ? userData.getPwds() : null;
    }

    public List<String> getDeviceIdsByUser(String user) {
        UserData userData = userDataMap.get(user);
        return userData != null ? userData.getDeviceIds() : new ArrayList<>();
    }

    public void update(String user, String pwd) {
        UserData userData = new UserData(pwd, getDeviceIdsByUser(user));
        userDataMap.put(user, userData);
        ConfigManager.saveLoginData();
    }
    
    public void update(String user, List<String> deviceIds) {
        UserData userData = new UserData(getLoginPwdByUser(user), deviceIds);
        userDataMap.put(user, userData);
        ConfigManager.saveLoginData();
    }
    
    public void delete(String user) {
        userDataMap.remove(user);
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
