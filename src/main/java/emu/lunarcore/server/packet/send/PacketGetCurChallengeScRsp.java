package emu.lunarcore.server.packet.send;

import emu.lunarcore.game.player.Player;
import emu.lunarcore.proto.ExtraLineupTypeOuterClass.ExtraLineupType;
import emu.lunarcore.proto.GetCurChallengeScRspOuterClass.GetCurChallengeScRsp;
import emu.lunarcore.server.packet.BasePacket;
import emu.lunarcore.server.packet.CmdId;

public class PacketGetCurChallengeScRsp extends BasePacket {

    public PacketGetCurChallengeScRsp(Player player) {
        super(CmdId.GetCurChallengeScRsp);
        
        var data = GetCurChallengeScRsp.newInstance();
        
        if (player.getChallengeInstance() != null) {
            data.setChallengeInfo(player.getChallengeInstance().toProto());
            data.addLineupList(player.getLineupManager().getExtraLineupByType(ExtraLineupType.LINEUP_CHALLENGE_VALUE).toProto());
            data.addLineupList(player.getLineupManager().getExtraLineupByType(ExtraLineupType.LINEUP_CHALLENGE_2_VALUE).toProto());
        } else {
            data.setRetcode(0);
        }
        
        this.setData(data);
    }
}
