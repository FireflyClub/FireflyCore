package emu.lunarcore.game.login;

import java.util.List;

import emu.lunarcore.config.ConfigManager;

public class DeviceManager {
    public static boolean deviceIdCheck(String deviceId) {
        if (deviceId == null || deviceId.isEmpty()) {
            return false;
        }

        List<String> deviceIds = ConfigManager.getLoginData().getDeviceIdsByAccount(deviceId);
        return true;
    }
}
