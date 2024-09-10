package emu.lunarcore.server.packet.send;

import emu.lunarcore.server.packet.CmdId;

import emu.lunarcore.data.GameData;
import emu.lunarcore.proto.MusicRhythmUnlockTrackScNotifyOuterClass.MusicRhythmUnlockTrackScNotify;
import emu.lunarcore.server.packet.BasePacket;

public class PacketMusicRhythmUnlockTrackScNotify extends BasePacket {

    public PacketMusicRhythmUnlockTrackScNotify() {
        super(CmdId.MusicRhythmUnlockTrackScNotify);

        var data = MusicRhythmUnlockTrackScNotify.newInstance();

        for (var excel : GameData.getMusicRhythmTrackExcelMap().values()) {
            data.addTrackUnlockList(excel.getId());
        }
        
        this.setData(data);
    }
}
