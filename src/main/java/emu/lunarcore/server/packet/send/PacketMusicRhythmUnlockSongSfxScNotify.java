package emu.lunarcore.server.packet.send;

import emu.lunarcore.server.packet.CmdId;

import emu.lunarcore.data.GameData;
import emu.lunarcore.proto.MusicRhythmUnlockSongSfxScNotifyOuterClass.MusicRhythmUnlockSongSfxScNotify;
import emu.lunarcore.server.packet.BasePacket;

public class PacketMusicRhythmUnlockSongSfxScNotify extends BasePacket {

    public PacketMusicRhythmUnlockSongSfxScNotify() {
        super(CmdId.MusicRhythmUnlockSongSfxScNotify);

        var data = MusicRhythmUnlockSongSfxScNotify.newInstance();

        for (var excel : GameData.getMusicRhythmSoundEffectExcelMap().values()) {
            data.addMusicUnlockList(excel.getId());
        }
        
        this.setData(data);
    }
}
