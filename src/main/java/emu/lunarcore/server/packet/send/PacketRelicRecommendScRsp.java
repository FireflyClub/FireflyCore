package emu.lunarcore.server.packet.send;

import emu.lunarcore.proto.RelicRecommendScRspOuterClass.RelicRecommendScRsp;
import emu.lunarcore.server.packet.BasePacket;
import emu.lunarcore.server.packet.CmdId;

public class PacketRelicRecommendScRsp extends BasePacket {

    public PacketRelicRecommendScRsp(int avatarId) {
        super(CmdId.RelicRecommendScRsp);

        var data = RelicRecommendScRsp.newInstance()
            .setAvatarId(avatarId);

        this.setData(data);
    }
}
