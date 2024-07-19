package emu.lunarcore.server.packet.recv;

import emu.lunarcore.config.ConfigManager;
import emu.lunarcore.game.login.LoginManager;
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

        // Banner announcement
        session.send(new PacketServerAnnounceNotify(session.getAccount()));

        // Login moudle
        if (ConfigManager.getConfig().getAccountOptions().useLogin) {
            if (session.getAccount().hasPermission("login")) {
                session.getAccount().removePermission("login");
            }
            session.loginManager = new LoginManager();
            session.loginManager.startLogin(session);
        }
    }

}