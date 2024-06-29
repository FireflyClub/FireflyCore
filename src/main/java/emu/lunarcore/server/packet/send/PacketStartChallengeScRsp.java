package emu.lunarcore.server.packet.send;

import emu.lunarcore.game.player.Player;
import emu.lunarcore.proto.ExtraLineupTypeOuterClass.ExtraLineupType;
import emu.lunarcore.proto.StartChallengeScRspOuterClass.StartChallengeScRsp;
import emu.lunarcore.server.packet.BasePacket;
import emu.lunarcore.server.packet.CmdId;
import emu.lunarcore.server.packet.Retcode;

public class PacketStartChallengeScRsp extends BasePacket {
    
    public PacketStartChallengeScRsp(Retcode retcode) {
        super(CmdId.StartChallengeScRsp);
        
        var data = StartChallengeScRsp.newInstance()
                .setRetcode(retcode.getVal());
        
        this.setData(data);
    }

    public PacketStartChallengeScRsp(Player player, int challengeId) {
        super(CmdId.StartChallengeScRsp);
        
        var data = StartChallengeScRsp.newInstance();
        
        if (player.getChallengeInstance() != null) {
            var lineup1 = player.getLineupManager().getExtraLineupByType(ExtraLineupType.LINEUP_CHALLENGE_VALUE);
            var lineup2 = player.getLineupManager().getExtraLineupByType(ExtraLineupType.LINEUP_CHALLENGE_2_VALUE);
            data.addAllLineupList(lineup1.toProto(), lineup2.toProto());
            data.setScene(player.getScene().toProto());
            data.setChallengeInfo(player.getChallengeInstance().toProto());
            
            if (player.getChallengeInstance().isBoss()) {
                var info = data.getMutableStartInfo().getMutableBossInfo();
                info.getMutableFirstNode();
                info.getMutableSecondNode();
            }
        } else {
            data.setRetcode(1);
        }
        
        this.setData(data);
    }
}