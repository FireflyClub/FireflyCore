package emu.lunarcore.server.packet.recv;

import emu.lunarcore.server.game.GameSession;
import emu.lunarcore.server.packet.CmdId;
import emu.lunarcore.server.packet.Opcodes;
import emu.lunarcore.server.packet.PacketHandler;
import emu.lunarcore.server.packet.send.PacketMusicRhythmFinishLevelScRsp;

@Opcodes(CmdId.MusicRhythmFinishLevelCsReq)
public class HandlerMusicRhythmFinishLevelCsReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] data) throws Exception {
        session.send(new PacketMusicRhythmFinishLevelScRsp(session.getPlayer().getCurMusicId()));
    }

}
