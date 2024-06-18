package emu.lunarcore.server.packet.send;

import emu.lunarcore.game.player.Player;
import emu.lunarcore.proto.ClientDownloadDataOuterClass.ClientDownloadData;
import emu.lunarcore.proto.ClientDownloadDataScNotifyOuterClass.ClientDownloadDataScNotify;
import emu.lunarcore.server.packet.BasePacket;
import emu.lunarcore.server.packet.CmdId;

public class PacketClientDownloadDataScNotify extends BasePacket {

    public PacketClientDownloadDataScNotify(byte[] data, Player player) {
        super(CmdId.ClientDownloadDataScNotify);

        var proto = ClientDownloadDataScNotify.newInstance()
            .setDownloadData(ClientDownloadData.newInstance().setData(data)
                .setVersion(81).setTime(System.currentTimeMillis() / 1000));

        this.setData(proto);
    }
}
