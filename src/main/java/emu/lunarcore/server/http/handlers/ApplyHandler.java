package emu.lunarcore.server.http.handlers;

import emu.lunarcore.LunarCore;
import emu.lunarcore.game.player.Player;
import emu.lunarcore.server.http.objects.RemoteResponse;
import emu.lunarcore.util.Utils;
import io.javalin.http.Context;
import io.javalin.http.Handler;

import org.jetbrains.annotations.NotNull;

import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

public final class ApplyHandler implements Handler {
    private static ConcurrentHashMap<Integer, String> tempCodeCache = new ConcurrentHashMap<>();

    public static String getCodeByUid(int uid) {
        return tempCodeCache.get(uid);
    }

    @Override
    public void handle(@NotNull Context ctx) throws Exception {
        String ip_address = Utils.getClientIpAddress(ctx);

        var set_uid = ctx.queryParam("uid");
        if (set_uid == null || set_uid.isEmpty()) {
            ctx.json(new RemoteResponse(404, "The player UID was not entered"));
            return;
        }

        int tmp_uid = 0;
        try {
            tmp_uid = Integer.parseInt(set_uid);
        } catch (Exception e) {
            ctx.json(new RemoteResponse(403, "The UID format is incorrect"));
            return;
        }

        LunarCore.getLogger().info(ip_address + " is applying a tempcode for " + tmp_uid);

        try {
            Player sender = LunarCore.getGameServer().getOnlinePlayerByUid(tmp_uid);

            if (sender != null) {
                sender.sendMessage(ip_address + " is applying a tempcode for you!");

                Random random = new Random();
                String code = String.valueOf(100000 + random.nextInt(900000));
                
                tempCodeCache.put(tmp_uid, code);

                sender.sendMessage("Your tempCode is: " + code + " , please quickly verify it!");

            } else {
                ctx.json(new RemoteResponse(201, "The player is not online"));
                return;

            }

        } catch (Exception e) {
            LunarCore.getLogger().info("error", e);
            ctx.json(new RemoteResponse(403, "error"));
            return;
        }

        ctx.json(new RemoteResponse());
    }
}