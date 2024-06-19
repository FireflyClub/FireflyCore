package emu.lunarcore.server.http.handlers;

import emu.lunarcore.HotfixData;
import org.jetbrains.annotations.NotNull;

import emu.lunarcore.LunarCore;
import emu.lunarcore.proto.GateserverOuterClass.Gateserver;
import emu.lunarcore.util.Utils;
import io.javalin.http.Context;
import io.javalin.http.Handler;

public class QueryGatewayHandler implements Handler {

    public QueryGatewayHandler() {

    }

    @Override
    public void handle(@NotNull Context ctx) throws Exception {
        // Build gateserver proto
        Gateserver gateserver = Gateserver.newInstance()
            .setRegionName(LunarCore.getConfig().getGameServer().getId())
            .setIp(LunarCore.getConfig().getGameServer().getPublicAddress())
            .setPort(LunarCore.getConfig().getGameServer().getPublicPort())
            .setMsg("Access verification failed. Please check if you have logged in to the correct account and server.") // in case there is some error idk
            .setUnk1(true)
            .setUnk2(true)
            .setUnk3(true)
            .setUnk4(true)
            .setUnk5(true)
            .setUnk6(true)
            .setUnk7(true)
            .setUnk8(true)
            .setUnk9(true);

        // Check if hotfix data is available and update gateserver proto accordingly
        String versionQuery = ctx.queryParam("version");
        if (versionQuery != null) {
            String version = versionQuery.replaceAll("CN|OS|BETA|PROD|Android|Win|iOS", "");
            String region = versionQuery.contains("CN") ?
                    LunarCore.getHotfixData().getBaseUrl().getCNWin() :
                    LunarCore.getHotfixData().getBaseUrl().getOSWin();
            HotfixData.DownloadData hotfixData = LunarCore.getHotfixData().getDownloadData().get(version);

            if (hotfixData == null) {
                hotfixData = new HotfixData.DownloadData();
                LunarCore.getHotfixData().getDownloadData().put(version, hotfixData);
                LunarCore.loadHotfixData();
            }

            if (hotfixData.assetBundleUrl != null) {
                gateserver.setAssetBundleUrl(hotfixData.assetBundleUrl.replace("{BASEURL}", region));
            }
            if (hotfixData.exResourceUrl != null) {
                gateserver.setExResourceUrl(hotfixData.exResourceUrl.replace("{BASEURL}", region));
            }
            if (hotfixData.luaUrl != null) {
                gateserver.setLuaUrl(hotfixData.luaUrl.replace("{BASEURL}", region));
            }
            if (hotfixData.ifixUrl != null) {
                gateserver.setIfixUrl(hotfixData.ifixUrl.replace("{BASEURL}", region));
            }
        }

        // Log
        if (LunarCore.getConfig().getLogOptions().connections) {
            LunarCore.getLogger().info("Client request: query_gateway");
        }

        // Encode to base64 and send to client
        ctx.result(Utils.base64Encode(gateserver.toByteArray()));
    }
}
