package emu.lunarcore.server.http.remote;

import emu.lunarcore.LunarCore;
import emu.lunarcore.game.player.Player;
import emu.lunarcore.server.http.module.IpAddressHandler;
import emu.lunarcore.server.http.module.TokenHandler;
import emu.lunarcore.server.http.objects.RemoteReqJson;
import emu.lunarcore.server.http.objects.RemoteRspJson;
import emu.lunarcore.util.JsonUtils;
import io.javalin.http.Context;
import io.javalin.http.Handler;

import org.jetbrains.annotations.NotNull;

public final class VerifyHandler implements Handler {
    @Override
    public void handle(@NotNull Context ctx) throws Exception {
        RemoteReqJson req = JsonUtils.decode(ctx.body(), RemoteReqJson.class);

        int uid = req.uid;
        int reqCode = req.code;
        String ipAddress = IpAddressHandler.getClientIpAddress(ctx);

        // Check req formats
        if (uid == 0) {
            ctx.json(new RemoteRspJson(403, "The player UID was not entered."));
            return;
        }
        if (reqCode == 0) {
            ctx.json(new RemoteRspJson(403, "The verification code was not entered."));
            return;
        }

        // Check if player is online
        Player sender = LunarCore.getGameServer().getOnlinePlayerByUid(uid);
        if (sender == null) {
            ctx.json(new RemoteRspJson(404, "The player is not found or is not online."));
            return;
        }

        // Check if account set code before
        int setCode = ApplyHandler.getCodeByUid(uid);
        if (setCode == 0) {
            ctx.json(new RemoteRspJson(500, "The player has not set a code yet."));
            return;
        }

        // Check if code is correct
        if (reqCode != setCode) {
            ctx.json(new RemoteRspJson(500, "The verification code is incorrect."));
            return;
        }

        // Generate a 16-character random token
        String randomToken = TokenHandler.generateRandomToken(16);

        // Store the token in the map
        TokenHandler.getInstance().addToken(uid, randomToken);

        // Logs
        LunarCore.getLogger().info(ipAddress + " access remote control for " + uid);
        sender.sendMessage(ipAddress + " apply a token for remote control: " + randomToken);

        // Response
        ctx.json(new RemoteRspJson(200, randomToken));
    }
}