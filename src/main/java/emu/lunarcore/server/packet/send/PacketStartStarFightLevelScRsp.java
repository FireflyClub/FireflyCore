package emu.lunarcore.server.packet.send;

import emu.lunarcore.game.battle.Battle;
import emu.lunarcore.game.enums.ActivityStarFightDifficultyLevel;
import emu.lunarcore.proto.StartStarFightLevelScRspOuterClass.StartStarFightLevelScRsp;
import emu.lunarcore.server.packet.BasePacket;
import emu.lunarcore.server.packet.CmdId;

public class PacketStartStarFightLevelScRsp extends BasePacket {
    public PacketStartStarFightLevelScRsp() {
        super(CmdId.StartStarFightLevelScRsp);
        
        this.setData(StartStarFightLevelScRsp.newInstance().setRetcode(1));
    }
    
    public PacketStartStarFightLevelScRsp(int groupId, ActivityStarFightDifficultyLevel difficultyLevel, Battle battle) {
        super(CmdId.StartStarFightLevelScRsp);

        var data = StartStarFightLevelScRsp.newInstance()
            .setDifficulty(difficultyLevel.getVal())
            .setGroupId(groupId)
            .setBattleInfo(battle.toProto());
        
        this.setData(data);
    }
}
