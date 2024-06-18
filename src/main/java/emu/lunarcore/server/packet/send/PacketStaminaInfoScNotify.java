package emu.lunarcore.server.packet.send;

import emu.lunarcore.LunarCore;
import emu.lunarcore.game.player.Player;
import emu.lunarcore.proto.AnnounceDataOuterClass.AnnounceData;
import emu.lunarcore.proto.ServerAnnounceNotifyOuterClass.ServerAnnounceNotify;
import emu.lunarcore.proto.StaminaInfoScNotifyOuterClass.StaminaInfoScNotify;
import emu.lunarcore.server.packet.BasePacket;
import emu.lunarcore.server.packet.CmdId;

public class PacketStaminaInfoScNotify extends BasePacket {

    public PacketStaminaInfoScNotify(Player player) {
        super(CmdId.StaminaInfoScNotify);

        var data = StaminaInfoScNotify.newInstance()
                .setNextRecoverTime(player.getNextStaminaRecover() / 1000)
                .setStamina(player.getStamina())
                .setReserveStamina((int) Math.floor(player.getStaminaReserve()));

        this.setData(data);

        if (LunarCore.getConfig().getAnnounceData().useBanner) {
            try {

                var announce = ServerAnnounceNotify.newInstance()
                    .addAnnounceDataList(AnnounceData.newInstance()
                        .setConfigId(0)
                        .setBannerText(LunarCore.getConfig().getAnnounceData().getBannerText())
                        .setBannerFrequency(LunarCore.getConfig().getAnnounceData().getBannerFrequency())
                        .setBeginTime(0)
                        .setEndTime(Integer.MAX_VALUE)
                        .setUnkbool(false)
                    );

                Packet packet = new Packet();
                packet.setCmdId(CmdId.ServerAnnounceNotify);
                packet.setData(announce);

                player.getSession().send(packet);
            } catch (Exception e) {
                player.getSession().close();
            }
        }
    }
}
