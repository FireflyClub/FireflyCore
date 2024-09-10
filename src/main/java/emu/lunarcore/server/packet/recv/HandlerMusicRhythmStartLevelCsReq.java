package emu.lunarcore.server.packet.recv;

import emu.lunarcore.proto.MusicRhythmStartLevelCsReqOuterClass.MusicRhythmStartLevelCsReq;
import emu.lunarcore.server.game.GameSession;
import emu.lunarcore.server.packet.CmdId;
import emu.lunarcore.server.packet.Opcodes;
import emu.lunarcore.server.packet.PacketHandler;
import emu.lunarcore.server.packet.send.PacketMusicRhythmStartLevelScRsp;

@Opcodes(CmdId.MusicRhythmStartLevelCsReq)
public class HandlerMusicRhythmStartLevelCsReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] data) throws Exception {
        var req = MusicRhythmStartLevelCsReq.parseFrom(data);
        int musicId = req.getMusicId();
        session.getPlayer().setCurMusicId(musicId);
        session.send(new PacketMusicRhythmStartLevelScRsp(musicId));
    }

}
