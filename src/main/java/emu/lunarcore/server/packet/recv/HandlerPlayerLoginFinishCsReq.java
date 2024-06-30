package emu.lunarcore.server.packet.recv;

import emu.lunarcore.server.game.GameSession;
import emu.lunarcore.server.packet.CmdId;
import emu.lunarcore.server.packet.Opcodes;
import emu.lunarcore.server.packet.PacketHandler;
import emu.lunarcore.server.packet.send.PacketBattlePassInfoNotify;
import emu.lunarcore.server.packet.send.PacketContentPackageSyncDataScNotify;
import emu.lunarcore.server.packet.send.PacketServerAnnounceNotify;
import emu.lunarcore.server.packet.send.PacketStaminaInfoScNotify;

@Opcodes(CmdId.PlayerLoginFinishCsReq)
public class HandlerPlayerLoginFinishCsReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] data) throws Exception {
        session.send(CmdId.PlayerLoginFinishScRsp);
        session.send(CmdId.GetArchiveDataScRsp);
        session.send(new PacketBattlePassInfoNotify());
        session.send(new PacketContentPackageSyncDataScNotify());
        session.send(new PacketStaminaInfoScNotify(session.getPlayer()));

        if (session.getAccount().hasPermission("admin")) {
            session.send(new PacketServerAnnounceNotify(true));
        } else {
            session.send(new PacketServerAnnounceNotify(false));
        }
    }
}