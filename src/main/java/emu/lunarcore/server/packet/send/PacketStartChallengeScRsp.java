package emu.lunarcore.server.packet.send;

import emu.lunarcore.game.player.Player;
import emu.lunarcore.proto.ChallengeExtInfoOuterClass.ChallengeExtInfo;
import emu.lunarcore.proto.ChallengeBossInfoOuterClass.ChallengeBossInfo;
import emu.lunarcore.proto.ChallengeBossStageInfoOuterClass.ChallengeBossStageInfo;
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
            var lineup1 = player.getLineupManager().getLineupByIndex(0, ExtraLineupType.LINEUP_CHALLENGE_VALUE);
            var lineup2 = player.getLineupManager().getLineupByIndex(0, ExtraLineupType.LINEUP_CHALLENGE_2_VALUE);
            data.addLineupList(lineup1.toProto());
            data.addLineupList(lineup2.toProto());
            data.setChallengeInfo(player.getChallengeInstance().toProto());
            
            if (player.getChallengeInstance().isBoss()) {
                var info =  ChallengeBossInfo
                    .newInstance()
                    .setNILMFPFBCNJ(false)
                    .setFirstNode(
                        ChallengeBossStageInfo
                            .newInstance()
                            .setIsWin(false)
                            .setCKNGEMPPIGE(0)
                            .setKJCEEICMKEE(false)
                            .setJGDMLOFCNCH(0)
                    )
                    .setSecondNode(
                        ChallengeBossStageInfo
                            .newInstance()
                            .setIsWin(false)
                            .setCKNGEMPPIGE(0)
                            .setKJCEEICMKEE(false)
                            .setJGDMLOFCNCH(0)
                    );
                
                for (var avatarId: lineup1.getAvatars()) {
                    info.addTeamOne(avatarId);
                }
                
                for (var avatarId: lineup2.getAvatars()) {
                    info.addTeamTwo(avatarId);
                }
                
                var extraInfo = ChallengeExtInfo
                    .newInstance()
                    .setBossInfo(info);
                
                data.setStartInfo(extraInfo);
            }

            player.sendPacket(new PacketEnterSceneByServerScNotify(player));
        } else {
            data.setRetcode(1);
        }
        
        this.setData(data);
    }
}
