package emu.lunarcore.server.packet.send;

import emu.lunarcore.game.challenge.ChallengeInstance;
import emu.lunarcore.game.player.lineup.PlayerLineup;
import emu.lunarcore.game.scene.Scene;
import emu.lunarcore.proto.StartPartialChallengeScRspOuterClass;
import emu.lunarcore.server.packet.BasePacket;
import emu.lunarcore.server.packet.CmdId;
import emu.lunarcore.server.packet.Retcode;

public class PacketStartPartialChallengeScRsp extends BasePacket {
    public PacketStartPartialChallengeScRsp() {
        super(CmdId.StartPartialChallengeScRsp);
        this.setData(StartPartialChallengeScRspOuterClass.StartPartialChallengeScRsp.newInstance().setRetcode(Retcode.CHALLENGE_NOT_EXIST.getVal()));
    }
    
    public PacketStartPartialChallengeScRsp(ChallengeInstance challenge, PlayerLineup lineup, Scene scene) {
        super(CmdId.StartPartialChallengeScRsp);
        var data = StartPartialChallengeScRspOuterClass.StartPartialChallengeScRsp
            .newInstance()
            .setChallengeInfo(challenge.toProto())
            .setLineup(lineup.toProto())
            .setScene(scene.toProto());
        this.setData(data);
    }
    

}
