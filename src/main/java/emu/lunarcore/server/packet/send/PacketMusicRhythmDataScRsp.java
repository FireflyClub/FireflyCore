package emu.lunarcore.server.packet.send;

import emu.lunarcore.server.packet.CmdId;

// import emu.lunarcore.data.GameData;
// import emu.lunarcore.proto.HEKPICHLMENOuterClass.HEKPICHLMEN;
import emu.lunarcore.proto.MusicRhythmDataScRspOuterClass.MusicRhythmDataScRsp;
import emu.lunarcore.server.packet.BasePacket;

public class PacketMusicRhythmDataScRsp extends BasePacket {

    public PacketMusicRhythmDataScRsp() {
        super(CmdId.MusicRhythmDataScRsp);

        var data = MusicRhythmDataScRsp.newInstance()
            .setFCLINCKMILK(true) // Main music archive tag
            .setPEFCBMODPOI(1)
            .setBMJGCIILHCA(1);

        // for (var excel : GameData.getMusicRhythmSongExcelMap().values()) {
        //     var unlockLevelData = HEKPICHLMEN.newInstance();
        //     for (var level : GameData.getMusicRhythmLevelExcelMap().values()) {
        //         unlockLevelData.setMusicId(level.getId())
        //             .setAEEMPPOFGBN(1);
        //     }

        //     data.addAllMFIFEBCDIMM(unlockLevelData)
        //         .addGBMLNHOCJMO(excel.getId())
        //         .addOPFOILFDBKG(excel.getId())
        //         .addFEAHHAMLDFB(excel.getId());
        // }
        
        this.setData(data);
    }
}
