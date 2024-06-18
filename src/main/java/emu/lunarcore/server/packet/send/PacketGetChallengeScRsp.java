package emu.lunarcore.server.packet.send;

import emu.lunarcore.LunarCore;
import emu.lunarcore.data.GameData;
import emu.lunarcore.game.player.Player;
import emu.lunarcore.proto.ChallengeBossExtraInfoOuterClass;
import emu.lunarcore.proto.ChallengeBossInfoOuterClass;
import emu.lunarcore.proto.ChallengeBossStageInfoOuterClass;
import emu.lunarcore.proto.ChallengeOuterClass.Challenge;
import emu.lunarcore.proto.GetChallengeScRspOuterClass.GetChallengeScRsp;
import emu.lunarcore.server.packet.BasePacket;
import emu.lunarcore.server.packet.CmdId;

public class PacketGetChallengeScRsp extends BasePacket {

    public PacketGetChallengeScRsp(Player player) {
        super(CmdId.GetChallengeScRsp);

        var data = GetChallengeScRsp.newInstance();
        
//        var time = LunarCore.currentServerTime();
        
        if (LunarCore.getConfig().getServerOptions().unlockAllChallenges) {
            // Add all challenge excels to our challenge list
            // TODO find out which challenge groups are active so we dont have to send old challenge ids to the client
            for (var challengeExcel : GameData.getChallengeExcelMap().values()) {
                var history = player.getChallengeManager().getHistory().get(challengeExcel.getId());
                
                if (challengeExcel.isBoss()) {
                    // TODO: need to implement how challenge history is stored (now need lineup info and stuff). 
                    history = null;
                }
                
                if (history != null) { 
                    data.addChallengeList(history.toProto());
                } else {
                    var challenge = Challenge.newInstance().setChallengeId(challengeExcel.getId());
                    
                    // add extra infos for bosses to trigger challenge unlock
                    if (challengeExcel.isBoss()) {
                        challenge
                            .setStoryInfo(
                                ChallengeBossExtraInfoOuterClass
                                    .ChallengeBossExtraInfo
                                    .newInstance()
                                    .setBossBuffInfo(
                                        ChallengeBossInfoOuterClass
                                            .ChallengeBossInfo
                                            .newInstance()
                                            .setPJJOCDBJOFO(ChallengeBossStageInfoOuterClass.ChallengeBossStageInfo.newInstance())
                                            .setCKIOKLMJCBG(ChallengeBossStageInfoOuterClass.ChallengeBossStageInfo.newInstance())
                                    )
                        );
                    }
                    
                    data.addAllChallengeList(challenge);
                }
            }
        } else {
            for (var history : player.getChallengeManager().getHistory().values()) {
                data.addChallengeList(history.toProto());
            }
        }
        
        for (var reward : player.getChallengeManager().getTakenRewards().values()) {
            data.addChallengeRewardList(reward.toProto());
        }
        
        this.setData(data);
    }
}
