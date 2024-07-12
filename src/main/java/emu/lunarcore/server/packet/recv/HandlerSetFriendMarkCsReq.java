package emu.lunarcore.server.packet.recv;

import emu.lunarcore.proto.SetFriendMarkCsReqOuterClass.SetFriendMarkCsReq;
import emu.lunarcore.server.game.GameSession;
import emu.lunarcore.server.packet.CmdId;
import emu.lunarcore.server.packet.Opcodes;
import emu.lunarcore.server.packet.PacketHandler;
import emu.lunarcore.server.packet.send.PacketSetFriendMarkScRsp;

@Opcodes(CmdId.SetFriendMarkCsReq)
public class HandlerSetFriendMarkCsReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] data) throws Exception {
        var req = SetFriendMarkCsReq.parseFrom(data);
        
        session.getPlayer().getFriendList().markFriendship(req.getUid(), req.getIsSetMark());
        session.send(new PacketSetFriendMarkScRsp(req.getUid(), req.getIsSetMark()));
    }

}
