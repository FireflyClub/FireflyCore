package emu.lunarcore.server.packet.send;

import emu.lunarcore.server.packet.CmdId;
import emu.lunarcore.server.packet.BasePacket;
import emu.lunarcore.proto.MusicRhythmStartLevelScRspOuterClass.MusicRhythmStartLevelScRsp;

public class PacketMusicRhythmStartLevelScRsp extends BasePacket {

    public PacketMusicRhythmStartLevelScRsp(int startLevel) {
        super(CmdId.MusicRhythmStartLevelScRsp);

        var proto = MusicRhythmStartLevelScRsp.newInstance()
            .setLevelId(startLevel);
        
        this.setData(proto);
    }
}
