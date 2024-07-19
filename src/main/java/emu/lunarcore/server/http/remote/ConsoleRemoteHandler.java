package emu.lunarcore.server.http.remote;

import emu.lunarcore.LunarCore;
import emu.lunarcore.config.ConfigManager;
import emu.lunarcore.server.http.objects.RemoteReqJson;
import emu.lunarcore.server.http.objects.RemoteRspJson;
import emu.lunarcore.util.JsonUtils;
import io.javalin.http.Context;
import io.javalin.http.Handler;

import java.util.Objects;

import org.jetbrains.annotations.NotNull;

public final class ConsoleRemoteHandler implements Handler {
    @Override
    public void handle(@NotNull Context ctx) throws Exception {
        RemoteReqJson req = JsonUtils.decode(ctx.body(), RemoteReqJson.class);

        String reqKey = req.key;
        String cmd = req.cmd;
        String ipAddress = IpAddressManager.getClientIpAddress(ctx);

        // Check if key is correct (allow null)
        String consoleRemoteKey = ConfigManager.getConfig().getAccountOptions().getConsoleRemoteKey();
        if (!Objects.equals(reqKey, consoleRemoteKey)) {
            ctx.json(new RemoteRspJson(201, "The console remote password is incorrect."));
            return;
        }

        // Invoke command
        LunarCore.getCommandManager().invoke(null, cmd, ctx);

        // Logs
        LunarCore.getLogger().info(ipAddress + " invoke '" + cmd + "' as console.");
    }
}
