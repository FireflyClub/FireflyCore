package emu.lunarcore.server.packet.send;

import emu.lunarcore.proto.GetMissionDataScRspOuterClass.GetMissionDataScRsp;
import emu.lunarcore.server.packet.BasePacket;
import emu.lunarcore.server.packet.CmdId;

public class PacketGetMissionDataScRsp extends BasePacket {
    public PacketGetMissionDataScRsp() {
        super(CmdId.GetMissionDataScRsp);
        
        var data = GetMissionDataScRsp.newInstance();
        
        this.setData(data);
    }
}
