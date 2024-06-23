package emu.lunarcore.server.packet.send;

import emu.lunarcore.game.challenge.ChallengeInstance;
import emu.lunarcore.proto.ChallengeBossPhaseSettleNotifyOuterClass.ChallengeBossPhaseSettleNotify;
import emu.lunarcore.server.packet.BasePacket;
import emu.lunarcore.server.packet.CmdId;

public class PacketChallengeBossPhaseSettleNotify extends BasePacket {
    public PacketChallengeBossPhaseSettleNotify(ChallengeInstance challenge) {
        super(CmdId.ChallengeBossPhaseSettleNotify);

        var data = ChallengeBossPhaseSettleNotify
            .newInstance()
            .setChallengeId(challenge.getExcel().getId())
            .setPhase(challenge.getCurrentStage())
            .setChallengeScore(challenge.getScoreStage1())
            .setScoreTwo(challenge.getScoreStage2())
            .setIsWin(challenge.isWin()) // if is win == false, the AV battle target not shown
            .setStars(challenge.getStars())
            .setGIPCBILIPIP(false) // show completion reward
            .setKJFDFGLCJPB(true) // if false, the AV battle target not shown
            .setCPJOLGJDICK(1); // if the value is not 1, will show stars
        
        if (challenge.getBossTarget1() != null && challenge.getCurrentStage() == 1) {
            for (var target: challenge.getBossTarget1()) {
                data.addBattleTargetList(target);
            }
        }
        
        if (challenge.getBossTarget2() != null) {
            for (var target: challenge.getBossTarget2()) {
                data.addBattleTargetList(target);
            }
        }
        
        this.setData(data);
    }
}
