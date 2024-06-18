package emu.lunarcore.server.packet.send;

import emu.lunarcore.proto.GetMultiPathAvatarInfoScRspOuterClass;
import emu.lunarcore.proto.GetMultiPathAvatarInfoScRspOuterClass.GetMultiPathAvatarInfoScRsp;
import emu.lunarcore.proto.MultiPathAvatarTypeOuterClass;
import emu.lunarcore.server.packet.BasePacket;
import emu.lunarcore.server.packet.CmdId;

public class PacketGetMultiPathAvatarInfoScRsp extends BasePacket {

    public PacketGetMultiPathAvatarInfoScRsp() {
        super(CmdId.GetMissionStatusScRsp);

        var data = GetMultiPathAvatarInfoScRsp.newInstance();

        data.addNNKAKMNAMFC(GetMultiPathAvatarInfoScRsp.NNKAKMNAMFCEntry.newInstance()
            .setKey(1001)
            .setValue(MultiPathAvatarTypeOuterClass.MultiPathAvatarType.Mar_7thKnightType));

        this.setData(data);
    }

}