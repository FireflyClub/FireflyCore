package emu.lunarcore.server.packet.send;

import emu.lunarcore.LunarCore;
import emu.lunarcore.game.account.Account;
import emu.lunarcore.proto.AnnounceDataOuterClass.AnnounceData;
import emu.lunarcore.proto.ServerAnnounceNotifyOuterClass.ServerAnnounceNotify;
import emu.lunarcore.server.packet.BasePacket;
import emu.lunarcore.server.packet.CmdId;

public class PacketServerAnnounceNotify extends BasePacket {

    private static int configId = 0;

    // For Player banner
    public PacketServerAnnounceNotify(Account account) {
        super(CmdId.ServerAnnounceNotify);

        if (LunarCore.getConfig().getAnnounceData().useBanner) {
            // Set banner text for player or admin
            String bannerText = LunarCore.getConfig().getAnnounceData().getBannerText();
            int bannerFrequency = LunarCore.getConfig().getAnnounceData().getBannerFrequency();
            if (account.hasPermission("admin")) {
                bannerText = LunarCore.getConfig().getAnnounceData().getAdminBannerText();
                bannerFrequency = Integer.MAX_VALUE;
            }

            var announce = ServerAnnounceNotify.newInstance()
                .addAnnounceDataList(AnnounceData.newInstance()
                    .setConfigId(0)
                    .setBannerText(bannerText)
                    .setBannerFrequency(bannerFrequency)
                    .setBeginTime(0)
                    .setEndTime(Integer.MAX_VALUE)
                );
 
            this.setData(announce);
        }
    }

    // For center system announcement
    public PacketServerAnnounceNotify(String centerText, String color, int delay) {
        super(CmdId.ServerAnnounceNotify);

        // Set configId for each announcement, or this window will not display, it calculate by receive player session
        configId++;

        var announce = ServerAnnounceNotify.newInstance()
                .addAnnounceDataList(AnnounceData.newInstance()
                    .setConfigId(configId)
                    .setEmergencyText("<color=" + color + ">" + centerText + "</color>")
                    .setBeginTime((int) (System.currentTimeMillis() / 1000) + delay)
                    .setEndTime(Integer.MAX_VALUE)
                    .setBannerFrequency(Integer.MAX_VALUE)
                );

        this.setData(announce);
    }

    public PacketServerAnnounceNotify(String centerText, String color) {
        super(CmdId.ServerAnnounceNotify);
        PacketServerAnnounceNotify packet = new PacketServerAnnounceNotify(centerText, color, 0);
        this.setData(packet.getData());
    }
    
    public PacketServerAnnounceNotify(String centerText) {
        super(CmdId.ServerAnnounceNotify);
        PacketServerAnnounceNotify packet = new PacketServerAnnounceNotify(centerText, "black", 0);
        this.setData(packet.getData());
    }
    
}
