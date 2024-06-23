package emu.lunarcore.server.packet.send;

import emu.lunarcore.LunarCore;
import emu.lunarcore.game.player.Player;
import emu.lunarcore.proto.AnnounceDataOuterClass.AnnounceData;
import emu.lunarcore.proto.ServerAnnounceNotifyOuterClass.ServerAnnounceNotify;
import emu.lunarcore.server.packet.BasePacket;
import emu.lunarcore.server.packet.CmdId;

public class PacketServerAnnounceNotify extends BasePacket {

    public PacketServerAnnounceNotify(Player player) {
        super(CmdId.ServerAnnounceNotify);

        if (LunarCore.getConfig().getAnnounceData().useBanner) {
            var announce = ServerAnnounceNotify.newInstance()
                .addAnnounceDataList(AnnounceData.newInstance()
                    .setConfigId(0)
                    .setBannerText(LunarCore.getConfig().getAnnounceData().getBannerText())
                    .setBannerFrequency(LunarCore.getConfig().getAnnounceData().getBannerFrequency())
                    .setBeginTime(0)
                    .setEndTime(Integer.MAX_VALUE)
                    .setUnkbool(false)
                );
 
            this.setData(announce);
        }
    }
    
}
