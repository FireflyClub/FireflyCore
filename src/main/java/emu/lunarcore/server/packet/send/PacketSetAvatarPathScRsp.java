package emu.lunarcore.server.packet.send;

import emu.lunarcore.proto.MultiPathAvatarTypeOuterClass.MultiPathAvatarType;
import emu.lunarcore.proto.SetAvatarPathScRspOuterClass;
import emu.lunarcore.server.packet.BasePacket;
import emu.lunarcore.server.packet.CmdId;

public class PacketSetAvatarPathScRsp extends BasePacket {

    public PacketSetAvatarPathScRsp(MultiPathAvatarType type) {
        super(CmdId.SetAvatarPathScRsp);

        var data = SetAvatarPathScRspOuterClass.SetAvatarPathScRsp.newInstance()
                .setAvatarId(type);

        this.setData(data);
    }
}