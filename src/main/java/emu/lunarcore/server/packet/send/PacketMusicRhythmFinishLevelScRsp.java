package emu.lunarcore.server.packet.send;

import emu.lunarcore.server.packet.CmdId;
import emu.lunarcore.server.packet.BasePacket;
import emu.lunarcore.proto.MusicRhythmFinishLevelScRspOuterClass.MusicRhythmFinishLevelScRsp;

public class PacketMusicRhythmFinishLevelScRsp extends BasePacket {

    public PacketMusicRhythmFinishLevelScRsp(int finishLevel) {
        super(CmdId.MusicRhythmFinishLevelScRsp);

        var proto = MusicRhythmFinishLevelScRsp.newInstance()
            .setLevelId(finishLevel);
        
        this.setData(proto);
    }
}
