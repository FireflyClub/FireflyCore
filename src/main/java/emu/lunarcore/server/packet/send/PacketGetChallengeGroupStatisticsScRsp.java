package emu.lunarcore.server.packet.send;

import emu.lunarcore.data.GameData;
import emu.lunarcore.game.player.Player;
import emu.lunarcore.proto.AvatarTypeOuterClass;
import emu.lunarcore.proto.ChallengeBossClearInfoOuterClass.ChallengeBossClearInfo;
import emu.lunarcore.proto.ChallengeBossStatsOuterClass.ChallengeBossStats;
import emu.lunarcore.proto.ChallengeLineupMemberOuterClass;
import emu.lunarcore.proto.ChallengeLineupOuterClass;
import emu.lunarcore.proto.ChallengeMemoryClearInfoOuterClass.ChallengeMemoryClearInfo;
import emu.lunarcore.proto.ChallengeMemoryStatsOuterClass.ChallengeMemoryStats;
import emu.lunarcore.proto.ChallengeStoryClearInfoOuterClass.ChallengeStoryClearInfo;
import emu.lunarcore.proto.ChallengeStoryStatsOuterClass.ChallengeStoryStats;
import emu.lunarcore.proto.GetChallengeGroupStatisticsScRspOuterClass.GetChallengeGroupStatisticsScRsp;
import emu.lunarcore.server.packet.BasePacket;
import emu.lunarcore.server.packet.CmdId;
import emu.lunarcore.server.packet.Retcode;

public class PacketGetChallengeGroupStatisticsScRsp extends BasePacket {
    public PacketGetChallengeGroupStatisticsScRsp(Player player, int groupId) {
        super(CmdId.GetChallengeGroupStatisticsScRsp);
        
        var history = player.getChallengeManager().getHistory().values().stream().filter(p -> p.getGroupId() == groupId).findFirst().orElse(null);
        var data = GetChallengeGroupStatisticsScRsp.newInstance();
        
        if(history == null) {
            data.setRetcode(Retcode.CHALLENGE_NOT_UNLOCK.getVal());
            this.setData(data);
            return;
        }
        
        var excel = GameData.getChallengeExcelMap().get(history.getChallengeId());
        
        data.setGroupId(groupId);
        
        switch (excel.getType()) {
            case Memory -> {
                var stat = ChallengeMemoryStats
                    .newInstance()
                    .setAttempts(1);
                
                var clearInfo = ChallengeMemoryClearInfo.newInstance()
                    .setHighestDifficulty(1)
                    .setRoundCount(2)
                    .setLevel(1);
                
                var lineupList = clearInfo.getMutableLineupList();
                
                var index = 0;
                var firstNodeLineup = ChallengeLineupOuterClass.ChallengeLineup.newInstance();
                for (var avatarId: history.getFirstNodeData().getAvatarIds()) {
                    firstNodeLineup
                        .addAvatarList(
                            ChallengeLineupMemberOuterClass.ChallengeLineupMember
                                .newInstance()
                                .setId(avatarId)
                                .setAvatarType(AvatarTypeOuterClass.AvatarType.AVATAR_FORMAL_TYPE)
                                .setIndex(index)
                                .setLevel(80) // TODO
                        );
                    index++;
                }
                
                index = 0;
                var secondNodeLineup = ChallengeLineupOuterClass.ChallengeLineup.newInstance();
                for (var avatarId: history.getSecondNodeData().getAvatarIds()) {
                    secondNodeLineup
                        .addAvatarList(
                            ChallengeLineupMemberOuterClass.ChallengeLineupMember
                                .newInstance()
                                .setId(avatarId)
                                .setAvatarType(AvatarTypeOuterClass.AvatarType.AVATAR_FORMAL_TYPE)
                                .setIndex(index)
                                .setLevel(80) // TODO
                        );
                    index++;
                }

                lineupList.add(firstNodeLineup);
                lineupList.add(secondNodeLineup);
                stat.setClearInfo(clearInfo);
                data.setMemoryStats(stat);
            }
            case Story -> {
                var stat = ChallengeStoryStats
                    .newInstance()
                    .setAttempts(1)
                    .setClearInfo(ChallengeStoryClearInfo.newInstance());
                data.setStoryStats(stat);
            } 
            case Boss -> {
                var stat = ChallengeBossStats
                    .newInstance()
                    .setAttempts(1)
                    .setClearInfo(ChallengeBossClearInfo.newInstance());
                data.setBossStats(stat);
            }
        }
        
        this.setData(data);
    }
}
