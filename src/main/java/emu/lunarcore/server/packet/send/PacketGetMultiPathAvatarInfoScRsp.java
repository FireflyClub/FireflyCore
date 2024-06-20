package emu.lunarcore.server.packet.send;

import emu.lunarcore.proto.GetMultiPathAvatarInfoScRspOuterClass.GetMultiPathAvatarInfoScRsp;
import emu.lunarcore.proto.MultiPathAvatarTypeOuterClass;
import emu.lunarcore.server.packet.BasePacket;
import emu.lunarcore.server.packet.CmdId;

public class PacketGetMultiPathAvatarInfoScRsp extends BasePacket {

    public PacketGetMultiPathAvatarInfoScRsp() {
        super(CmdId.GetMissionStatusScRsp);

        var data = GetMultiPathAvatarInfoScRsp.newInstance();

        data.addDEKPBIGFNBE(GetMultiPathAvatarInfoScRsp.DEKPBIGFNBEEntry.newInstance()
            .setKey(1224)
            .setValue(MultiPathAvatarTypeOuterClass.MultiPathAvatarType.Mar_7thRogueType));

        this.setData(data);
    }

}