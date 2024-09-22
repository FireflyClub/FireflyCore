package emu.lunarcore.server.packet.recv;

import emu.lunarcore.server.game.GameSession;
import emu.lunarcore.server.packet.CmdId;
import emu.lunarcore.server.packet.Opcodes;
import emu.lunarcore.server.packet.PacketHandler;
import emu.lunarcore.server.packet.send.PacketMusicRhythmDataScRsp;
import emu.lunarcore.server.packet.send.PacketMusicRhythmUnlockSongNotify;
import emu.lunarcore.server.packet.send.PacketMusicRhythmUnlockSongSfxScNotify;
import emu.lunarcore.server.packet.send.PacketMusicRhythmUnlockTrackScNotify;

@Opcodes(CmdId.MusicRhythmDataCsReq)
public class HandlerMusicRhythmDataCsReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] data) throws Exception {
        session.send(new PacketMusicRhythmDataScRsp());

        // Unknown fields
        session.send(new PacketMusicRhythmUnlockSongNotify());
        session.send(new PacketMusicRhythmUnlockSongSfxScNotify());
        session.send(new PacketMusicRhythmUnlockTrackScNotify());

        // Unlock max difficulty level
        session.send(CmdId.MusicRhythmMaxDifficultyLevelsUnlockNotify);
    }
}
