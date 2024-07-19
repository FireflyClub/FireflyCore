package emu.lunarcore.config;

import java.util.Map;

import java.util.LinkedHashMap;

public class LoginData {
    private Map<String, String> pwds = new LinkedHashMap<>();

    public String getLoginPwdByAccount(String account) {
        return pwds.getOrDefault(account, null);
    }

    public void update(String account, String pwd) {
        pwds.put(account, pwd);
        ConfigManager.saveLoginData();
    }
}