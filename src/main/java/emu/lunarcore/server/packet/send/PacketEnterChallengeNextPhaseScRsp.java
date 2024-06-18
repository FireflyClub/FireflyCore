package emu.lunarcore.server.packet.send;

import emu.lunarcore.proto.EnterChallengeNextPhaseScRspOuterClass.EnterChallengeNextPhaseScRsp;
import emu.lunarcore.proto.SceneInfoOuterClass.SceneInfo;
import emu.lunarcore.server.packet.BasePacket;
import emu.lunarcore.server.packet.CmdId;

public class PacketEnterChallengeNextPhaseScRsp extends BasePacket {

    public PacketEnterChallengeNextPhaseScRsp(SceneInfo scene) {
        super(CmdId.EnterChallengeNextPhaseScRsp);

        this.setData(
            EnterChallengeNextPhaseScRsp
                .newInstance()
                .setScene(scene)
        );
    }
}
