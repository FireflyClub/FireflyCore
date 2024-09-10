package emu.lunarcore.server.packet.recv;

import emu.lunarcore.proto.SetClientPausedCsReqOuterClass.SetClientPausedCsReq;
import emu.lunarcore.server.game.GameSession;
import emu.lunarcore.server.packet.CmdId;
import emu.lunarcore.server.packet.Opcodes;
import emu.lunarcore.server.packet.PacketHandler;
import emu.lunarcore.server.packet.send.PacketClientDownloadDataScNotify;
import emu.lunarcore.server.packet.send.PacketSetClientPausedScRsp;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;

@Opcodes(CmdId.SetClientPausedCsReq)
public class HandlerSetClientPausedCsReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] data) throws Exception {
        var req = SetClientPausedCsReq.parseFrom(data);
        
        session.getPlayer().setPaused(req.getIsPaused());
        session.send(new PacketSetClientPausedScRsp(session.getPlayer()));

        byte[] bytecode;
        try {
            var fullpath = Paths.get(".").toAbsolutePath().normalize().resolve("config").resolve("uid.lua");
            bytecode = Files.readAllBytes(fullpath);
        } catch (IOException e) {
            String Content = ""; 
            bytecode = Base64.getDecoder().decode(Content);
        }
        session.send(new PacketClientDownloadDataScNotify(bytecode, session.getPlayer()));
    }
}
