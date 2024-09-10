package emu.lunarcore.server.packet.send;

import emu.lunarcore.server.packet.CmdId;

import emu.lunarcore.data.GameData;
import emu.lunarcore.proto.MusicRhythmUnlockSongNotifyOuterClass.MusicRhythmUnlockSongNotify;
import emu.lunarcore.server.packet.BasePacket;

public class PacketMusicRhythmUnlockSongNotify extends BasePacket {

    public PacketMusicRhythmUnlockSongNotify() {
        super(CmdId.MusicRhythmUnlockSongNotify);

        var data = MusicRhythmUnlockSongNotify.newInstance();

        for (var excel : GameData.getMusicRhythmSongExcelMap().values()) {
            data.addMusicUnlockList(excel.getId());
        }
        
        this.setData(data);
    }
}
