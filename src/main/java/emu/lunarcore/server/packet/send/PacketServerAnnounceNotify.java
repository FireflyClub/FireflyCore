package emu.lunarcore.server.packet.send;

import emu.lunarcore.LunarCore;
import emu.lunarcore.game.account.Account;
import emu.lunarcore.proto.AnnounceDataOuterClass.AnnounceData;
import emu.lunarcore.proto.ServerAnnounceNotifyOuterClass.ServerAnnounceNotify;
import emu.lunarcore.server.packet.BasePacket;
import emu.lunarcore.server.packet.CmdId;

public class PacketServerAnnounceNotify extends BasePacket {

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
                    .setIsCenterSystemLast5EveryMinutes(false)
                );
 
            this.setData(announce);
        }
    }

    // For center system announcement (Announce Command)
    public PacketServerAnnounceNotify(String centerText) {
        super(CmdId.ServerAnnounceNotify);

        var announce = ServerAnnounceNotify.newInstance()
                .addAnnounceDataList(AnnounceData.newInstance()
                    .setConfigId(0)
                    .setEmergencyText(centerText)
                    .setBeginTime(0)
                    .setEndTime((int)(System.currentTimeMillis() / 1000 + 2))
                    .setIsCenterSystemLast5EveryMinutes(false)
                );

        this.setData(announce);
    }
    
}
