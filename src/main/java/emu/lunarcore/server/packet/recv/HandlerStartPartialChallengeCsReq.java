package emu.lunarcore.server.packet.recv;

import emu.lunarcore.proto.StartPartialChallengeCsReqOuterClass.StartPartialChallengeCsReq;
import emu.lunarcore.server.game.GameSession;
import emu.lunarcore.server.packet.CmdId;
import emu.lunarcore.server.packet.Opcodes;
import emu.lunarcore.server.packet.PacketHandler;
import emu.lunarcore.server.packet.send.PacketStartPartialChallengeScRsp;

@Opcodes(CmdId.StartPartialChallengeCsReq)
public class HandlerStartPartialChallengeCsReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] data) throws Exception {
        var req = StartPartialChallengeCsReq.parseFrom(data);
        var history = session.getPlayer().getChallengeManager().getHistory().get(req.getChallengeId());
        if (history == null) {
            session.send(new PacketStartPartialChallengeScRsp());
            return;
        }
        session.getPlayer().getChallengeManager().startPartialChallenge(req.getChallengeId(), req.getBuffId(), req.getIsFirstHalf());
    }
}
