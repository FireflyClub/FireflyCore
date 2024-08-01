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
                .setScoreOne(challenge.getScoreStage1())
                .setScoreTwo(challenge.getScoreStage2())
                .setIsWin(challenge.isWin()) // if is win == false, the AV battle target not shown
                .setStars(challenge.getStars())
                .setKHLCHIFGCPD(challenge.getCurrentStage() == 2) // show completion reward
                .setOCNGBEDMEGJ(true) // if false, the AV battle target not shown
                .setLMHBPGCPMNH(1); // if the value is not 1, will show stars
        
        if (challenge.getBattleTarget1() != null && challenge.getCurrentStage() == 1) {
            for (var target: challenge.getBattleTarget1().values()) {
                data.addBattleTargetList(target);
            }
        }

        if (challenge.getBattleTarget2() != null) {
            for (var target: challenge.getBattleTarget2().values()) {
                data.addBattleTargetList(target);
            }
        }
        
        this.setData(data);
    }
}
