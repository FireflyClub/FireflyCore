package emu.lunarcore.server.packet.send;

import emu.lunarcore.data.GameData;
import emu.lunarcore.game.enums.ActivityStarFightDifficultyLevel;
import emu.lunarcore.proto.GetFightActivityDataScRspOuterClass.GetFightActivityDataScRsp;
import emu.lunarcore.proto.FightActivityGroupOuterClass.FightActivityGroup;
import emu.lunarcore.server.packet.BasePacket;
import emu.lunarcore.server.packet.CmdId;

public class PacketGetFightActivityDataScRsp extends BasePacket {

    public PacketGetFightActivityDataScRsp() {
        super(CmdId.GetFightActivityDataScRsp);

        var data = GetFightActivityDataScRsp
            .newInstance()
            .setWorldLevel(6)
            .setMgfbopciien(true);
        
        for (var config: GameData.getActivityStarFightGroupExcelMap().values()) {
            data.getMutableAnepmceolnc().add(
                FightActivityGroup
                    .newInstance()
                    .setGroupId(config.getGroupID())
                    .setEndlessMaxWave(config.getPerfectWave())
                    .setPassedMaxDifficultyLevel(ActivityStarFightDifficultyLevel.Hard.getVal())
                    .setEndlessMaxWave(0)
            );
        }
        
        this.setData(data);
    }
}
