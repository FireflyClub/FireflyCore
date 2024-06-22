package emu.lunarcore.server.packet.recv;

import emu.lunarcore.proto.RelicRecommendCsReqOuterClass.RelicRecommendCsReq;
import emu.lunarcore.server.game.GameSession;
import emu.lunarcore.server.packet.CmdId;
import emu.lunarcore.server.packet.Opcodes;
import emu.lunarcore.server.packet.PacketHandler;
import emu.lunarcore.server.packet.send.PacketRelicRecommendScRsp;

@Opcodes(CmdId.RelicRecommendCsReq)
public class HandlerRelicRecommendCsReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] data) throws Exception {
        var req = RelicRecommendCsReq.parseFrom(data);

        session.send(new PacketRelicRecommendScRsp(req.getAvatarId()));
    }

}
