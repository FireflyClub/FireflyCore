package emu.lunarcore.server.packet.send;

import emu.lunarcore.LunarCore;
import emu.lunarcore.proto.AnnounceDataOuterClass.AnnounceData;
import emu.lunarcore.proto.ServerAnnounceNotifyOuterClass.ServerAnnounceNotify;
import emu.lunarcore.server.packet.BasePacket;
import emu.lunarcore.server.packet.CmdId;

public class PacketServerAnnounceNotify extends BasePacket {

    boolean isAdmin = false;

    // For Player banner
    private PacketServerAnnounceNotify() {
        super(CmdId.ServerAnnounceNotify);

        if (LunarCore.getConfig().getAnnounceData().useBanner) {
            // Set banner text for player or admin
            String bannerText = LunarCore.getConfig().getAnnounceData().getBannerText();
            if (this.isAdmin) {
                bannerText = LunarCore.getConfig().getAnnounceData().getAdminBannerText();
            }

            var announce = ServerAnnounceNotify.newInstance()
                .addAnnounceDataList(AnnounceData.newInstance()
                    .setConfigId(0)
                    .setBannerText(bannerText)
                    .setBannerFrequency(LunarCore.getConfig().getAnnounceData().getBannerFrequency())
                    .setBeginTime(0)
                    .setEndTime(Integer.MAX_VALUE)
                    .setIsCenterSystemLast5EveryMinutes(false)
                );
 
            this.setData(announce);
        }
    }

    // For Admin banner
    public PacketServerAnnounceNotify(boolean isAdmin) {
        super(CmdId.ServerAnnounceNotify);

        this.isAdmin = isAdmin;
        new PacketServerAnnounceNotify();
    }

    // For center system announcement (Announce Command)
    public PacketServerAnnounceNotify(String centerText) {
        super(CmdId.ServerAnnounceNotify);

        var announce = ServerAnnounceNotify.newInstance()
                .addAnnounceDataList(AnnounceData.newInstance()
                    .setConfigId(0)
                    .setEmergencyText(centerText)
                    .setBeginTime(0)
                    .setEndTime((int)(System.currentTimeMillis() / 1000 + 1))
                    .setIsCenterSystemLast5EveryMinutes(false)
                );

        this.setData(announce);
    }
    
}
