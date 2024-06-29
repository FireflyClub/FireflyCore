package emu.lunarcore.server.packet.recv;


import emu.lunarcore.proto.AcceptMainMissionCsReqOuterClass.AcceptMainMissionCsReq;
import emu.lunarcore.server.game.GameSession;
import emu.lunarcore.server.packet.CmdId;
import emu.lunarcore.server.packet.Opcodes;
import emu.lunarcore.server.packet.PacketHandler;
import emu.lunarcore.server.packet.send.PacketAcceptMainMissionScRsp;

@Opcodes(CmdId.AcceptMainMissionCsReq)
public class HandlerAcceptMainMissionCsReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] data) throws Exception {
        var req = AcceptMainMissionCsReq.parseFrom(data);
        session.send(new PacketAcceptMainMissionScRsp(req.getMainMissionId()));
    }

}
