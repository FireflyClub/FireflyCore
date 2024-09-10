package emu.lunarcore.server.packet.send;

import emu.lunarcore.config.ConfigManager;
import emu.lunarcore.data.GameData;
import emu.lunarcore.game.enums.ChallengeType;
import emu.lunarcore.game.player.Player;
import emu.lunarcore.proto.ChallengeHistoryMaxLevelOuterClass.ChallengeHistoryMaxLevel;
import emu.lunarcore.proto.ChallengeOuterClass.Challenge;
import emu.lunarcore.proto.GetChallengeScRspOuterClass.GetChallengeScRsp;
import emu.lunarcore.server.packet.BasePacket;
import emu.lunarcore.server.packet.CmdId;

public class PacketGetChallengeScRsp extends BasePacket {

    public PacketGetChallengeScRsp(Player player) {
        super(CmdId.GetChallengeScRsp);

        var data = GetChallengeScRsp.newInstance();
        
        if (ConfigManager.getConfig().getServerOptions().unlockAllChallenges) {
            // Add all challenge excels to our challenge list
            // TODO find out which challenge groups are active so we don't have to send old challenge ids to the client
            for (var challengeExcel : GameData.getChallengeExcelMap().values()) {
                var history = player.getChallengeManager().getHistory().get(challengeExcel.getId());
                
                if (history != null) {
                    data.addChallengeList(history.toProto(player));
                } else {
                    var challenge = Challenge.newInstance().setChallengeId(challengeExcel.getId());
                    
                    // add extra infos for bosses to trigger challenge unlock
                    if (challengeExcel.getType() == ChallengeType.Boss) {
                        var boss = challenge.getMutableExtInfo().getMutableBossInfo();
                        boss.getMutableSecondNode();
                        boss.getMutableFirstNode();
                    }
                    
                    data.addAllChallengeList(challenge);
                }
            }
        
        } else {
            for (var history : player.getChallengeManager().getHistory().values()) {
                data.addChallengeList(history.toProto(player));
            }
        }
        
        for (var reward : player.getChallengeManager().getTakenRewards().values()) {
            data.addChallengeRewardList(reward.toProto());
        }
        
        for (var type: ChallengeType.values()) {
            if(type.getVal() == 0) continue;;
            data
                .addMaxLevelList(
                    ChallengeHistoryMaxLevel
                        .newInstance()
                        .setLevel(type.getVal() > 1 ? 4 : 12)
                        .setOrderingIndex(type.getVal())
                );
        }
        
        this.setData(data);
    }
}