package emu.lunarcore.server.packet.send;

import emu.lunarcore.server.packet.CmdId;
import emu.lunarcore.data.GameData;
import emu.lunarcore.proto.MusicRhythmLevelOuterClass.MusicRhythmLevel;
import emu.lunarcore.proto.MusicRhythmGroupOuterClass.MusicRhythmGroup;
import emu.lunarcore.proto.MusicRhythmDataScRspOuterClass.MusicRhythmDataScRsp;
import emu.lunarcore.server.packet.BasePacket;

public class PacketMusicRhythmDataScRsp extends BasePacket {

    public PacketMusicRhythmDataScRsp() {
        super(CmdId.MusicRhythmDataScRsp);

        var data = MusicRhythmDataScRsp.newInstance()
            .setShowHint(true);
        
        var levels = data.getMutableMusicLevel();
        for (var level: GameData.getMusicRhythmLevelExcelMap().values()) {
            levels.add(
                MusicRhythmLevel
                    .newInstance()
                    .setLevelId(level.getId())
                    .setIsFullCombo(true)
                    .setUnlockLevel(3)
            );
        }
        
        var groups = data.getMutableMusicGroup();
        for (var group: GameData.getMusicRhythmGroupExcelMap().values()) {
            groups.add(
                MusicRhythmGroup.newInstance()
                    .setMusicGroupId(group.getId())
                    .setMusicGroupPhase(group.getPhase())
            );
        }

        for (var songs: GameData.getMusicRhythmSongExcelMap().values()) {
            data.addUnlockSongList(songs.getId());
        }

        for (var tracks: GameData.getMusicRhythmTrackExcelMap().values()) {
            data.addUnlockTrackList(tracks.getId());
        }

        for (var phases: GameData.getMusicRhythmPhaseExcelMap().values()) {
            data.addUnlockPhaseList(phases.getId());
        }

        this.setData(data);
    }
}
