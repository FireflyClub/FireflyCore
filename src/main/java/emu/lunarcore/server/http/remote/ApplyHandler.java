package emu.lunarcore.server.http.remote;

import emu.lunarcore.LunarCore;
import emu.lunarcore.game.player.Player;
import emu.lunarcore.server.http.module.IpAddressHandler;
import emu.lunarcore.server.http.objects.RemoteReqJson;
import emu.lunarcore.server.http.objects.RemoteRspJson;
import emu.lunarcore.util.JsonUtils;
import io.javalin.http.Context;
import io.javalin.http.Handler;

import org.jetbrains.annotations.NotNull;

import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

public final class ApplyHandler implements Handler {

    // temp code cache
    private static ConcurrentHashMap<Integer, Integer> tempCodeCache = new ConcurrentHashMap<>();
    public static int getCodeByUid(int uid) {
        Integer code = tempCodeCache.get(uid);
        return code != null ? code : 0;
    }

    @Override
    public void handle(@NotNull Context ctx) throws Exception {
        RemoteReqJson req = JsonUtils.decode(ctx.body(), RemoteReqJson.class);

        int uid = req.uid;
        String ipAddress = IpAddressHandler.getClientIpAddress(ctx);

        if (uid == 0) {
            ctx.json(new RemoteRspJson(403, "The player UID was not entered."));
            return;
        }

        Player sender = LunarCore.getGameServer().getOnlinePlayerByUid(uid);
        if (sender == null) {
            ctx.json(new RemoteRspJson(404, "The player is not found or is not online."));
            return;
        }

        // Get random code and store it in cache
        Random random = new Random();
        int code = 100000 + random.nextInt(900000);
        tempCodeCache.put(uid, code);

        // Logs
        LunarCore.getLogger().info(ipAddress + " applied a temp code for " + uid);
        sender.sendMessage(ipAddress + " applied a temp code for you, yuor code is: " + code);

        ctx.json(new RemoteRspJson());
    }
}