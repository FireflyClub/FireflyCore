package emu.lunarcore.server.packet.send;

import emu.lunarcore.proto.SetNicknameScRspOuterClass.SetNicknameScRsp;
import emu.lunarcore.server.packet.BasePacket;
import emu.lunarcore.server.packet.CmdId;

public class PacketSetNicknameScRsp extends BasePacket {

    public PacketSetNicknameScRsp() {
        super(CmdId.SetNicknameScRsp);

        var data = SetNicknameScRsp
            .newInstance()
            .setIsModify(true);
        
        this.setData(data);
    }
}

