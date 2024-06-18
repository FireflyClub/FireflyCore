package emu.lunarcore.server.packet.send;

import emu.lunarcore.proto.FightActivityGroupOuterClass;
import emu.lunarcore.proto.GetFightActivityDataScRspOuterClass;
import emu.lunarcore.server.packet.BasePacket;
import emu.lunarcore.server.packet.CmdId;

public class PacketGetFightActivityDataScRsp extends BasePacket {

    public PacketGetFightActivityDataScRsp() {
        super(CmdId.GetFightActivityDataScRsp);

        FightActivityGroupOuterClass.FightActivityGroup fightActivityGroup = FightActivityGroupOuterClass.FightActivityGroup.newInstance();
        fightActivityGroup.setGroupId(10006);
        fightActivityGroup.setEndlessMaxWave(2);
        fightActivityGroup.setPassedMaxDifficultyLevel(1);

        var data = GetFightActivityDataScRspOuterClass
            .GetFightActivityDataScRsp
            .newInstance()
            .setWorldLevel(6)
            .setMgfbopciien(true)
            .addAllAnepmceolnc(fightActivityGroup)
            .addKfkfjdekmnl(GetFightActivityDataScRspOuterClass.GetFightActivityDataScRsp.KfkfjdekmnlEntry.newInstance());
        
        this.setData(data);
    }
}
