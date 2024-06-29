package emu.lunarcore.server.packet.send;

import emu.lunarcore.proto.AcceptMainMissionScRspOuterClass.AcceptMainMissionScRsp;
import emu.lunarcore.server.packet.BasePacket;
import emu.lunarcore.server.packet.CmdId;

public class PacketAcceptMainMissionScRsp extends BasePacket {

    public PacketAcceptMainMissionScRsp(int mainMissionId) {
        super(CmdId.AcceptMainMissionScRsp);

        var data = AcceptMainMissionScRsp.newInstance().setMainMissionId(mainMissionId);
        
        this.setData(data);
    }
}
