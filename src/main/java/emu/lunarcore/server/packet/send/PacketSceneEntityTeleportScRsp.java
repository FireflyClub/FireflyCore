package emu.lunarcore.server.packet.send;

import emu.lunarcore.proto.SceneEntityTeleportCsReqOuterClass.SceneEntityTeleportCsReq;
import emu.lunarcore.proto.SceneEntityTeleportScRspOuterClass.SceneEntityTeleportScRsp;
import emu.lunarcore.server.packet.BasePacket;
import emu.lunarcore.server.packet.CmdId;

public class PacketSceneEntityTeleportScRsp extends BasePacket {

    public PacketSceneEntityTeleportScRsp(SceneEntityTeleportCsReq req) {
        super(CmdId.SceneEntityTeleportScRsp);

        var data = SceneEntityTeleportScRsp.newInstance().setEntityMotion(req.getMutableEntityMotion());

        this.setData(data);
    }
}
