package emu.lunarcore.server.packet.send;

import emu.lunarcore.proto.EnterChallengeNextPhaseScRspOuterClass;
import emu.lunarcore.proto.SceneInfoOuterClass;
import emu.lunarcore.server.packet.BasePacket;
import emu.lunarcore.server.packet.CmdId;

public class PacketRestartChallengePhaseScRsp extends BasePacket {

    public PacketRestartChallengePhaseScRsp(SceneInfoOuterClass.SceneInfo scene) {
        super(CmdId.RestartChallengePhaseScRsp);

        this.setData(
            EnterChallengeNextPhaseScRspOuterClass.EnterChallengeNextPhaseScRsp
                .newInstance()
                .setScene(scene)
        );
    }
}
