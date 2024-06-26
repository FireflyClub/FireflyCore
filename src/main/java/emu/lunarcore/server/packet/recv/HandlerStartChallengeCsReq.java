package emu.lunarcore.server.packet.recv;

import emu.lunarcore.proto.StartChallengeCsReqOuterClass.StartChallengeCsReq;
import emu.lunarcore.server.game.GameSession;
import emu.lunarcore.server.packet.CmdId;
import emu.lunarcore.server.packet.Opcodes;
import emu.lunarcore.server.packet.PacketHandler;

import java.util.Arrays;

@Opcodes(CmdId.StartChallengeCsReq)
public class HandlerStartChallengeCsReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] data) throws Exception {
        var req = StartChallengeCsReq.parseFrom(data);
        var storyBuffs = req.getStartInfo().getStoryBuffInfo();
        var bossBuffs = req.getStartInfo().getBossInfo();
        if (bossBuffs != null && bossBuffs.getBuffOne() == 0) {
            bossBuffs = null;
        }
        
        session
            .getPlayer()
            .getChallengeManager()
            .startChallenge(
                req.getChallengeId(), 
                storyBuffs, 
                bossBuffs, 
                Arrays.stream(req.getLineup1().toArray()).boxed().toList(),
                Arrays.stream(req.getLineup2().toArray()).boxed().toList()
            );
    }

}
