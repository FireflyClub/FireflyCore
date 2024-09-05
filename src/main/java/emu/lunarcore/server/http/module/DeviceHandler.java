package emu.lunarcore.server.http.module;

import emu.lunarcore.game.account.Account;
import emu.lunarcore.server.http.objects.LoginResJson;
import io.javalin.http.Context;

public class DeviceHandler {
    public static void handleDeviceLimit(Account account, Context ctx, LoginResJson res) throws Exception {
        String deviceId = ctx.header("x-rpc-device_id");
        if (deviceId == null) {
            res.retcode = -404;
            res.message = "Device ID not found.";
            return;
        }

        account.setDeviceId(deviceId);
        account.save();
    }
}
