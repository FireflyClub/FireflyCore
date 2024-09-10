package emu.lunarcore.server.packet.send;

import emu.lunarcore.server.packet.CmdId;
import emu.lunarcore.server.packet.BasePacket;
import emu.lunarcore.proto.MusicRhythmStartLevelScRspOuterClass.MusicRhythmStartLevelScRsp;

public class PacketMusicRhythmStartLevelScRsp extends BasePacket {

    public PacketMusicRhythmStartLevelScRsp(int musicId) {
        super(CmdId.MusicRhythmStartLevelScRsp);

        var proto = MusicRhythmStartLevelScRsp.newInstance()
            .setMusicId(musicId);
        
        this.setData(proto);
    }
}
