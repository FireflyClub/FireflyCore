package emu.lunarcore.server.packet.send;

import emu.lunarcore.proto.GetVideoVersionKeyScRspOuterClass.GetVideoVersionKeyScRsp;
import emu.lunarcore.server.packet.BasePacket;
import emu.lunarcore.server.packet.CmdId;

public class PacketGetVideoVersionKeyScRsp extends BasePacket {

    public PacketGetVideoVersionKeyScRsp() {
        super(CmdId.GetVideoVersionKeyScRsp);

        var data = GetVideoVersionKeyScRsp.newInstance();

        this.setData(data);
    }
}
