package emu.lunarcore.server.packet.recv;

import emu.lunarcore.game.enums.ActivityStarFightDifficultyLevel;
import emu.lunarcore.proto.StartStarFightLevelCsReqOuterClass.StartStarFightLevelCsReq;
import emu.lunarcore.server.game.GameSession;
import emu.lunarcore.server.packet.CmdId;
import emu.lunarcore.server.packet.Opcodes;
import emu.lunarcore.server.packet.PacketHandler;

import java.util.Arrays;
import java.util.ArrayList;

@Opcodes(CmdId.StartStarFightLevelCsReq)
public class HandlerStartStarFightLevelCsReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] data) throws Exception {
        var req = StartStarFightLevelCsReq.parseFrom(data);
        var avatars = new ArrayList<Integer>();
        
        for (var avatar: req.getAvatarList()) {
            avatars.add(avatar.getAvatarId());
        }
        
        session
            .getServer()
            .getBattleService()
            .startStarFightBattle(
                session.getPlayer(),
                req.getGroupId(),
                Arrays.stream(ActivityStarFightDifficultyLevel.values()).filter(p -> p.getVal() == req.getDifficulty()).findFirst().orElse(ActivityStarFightDifficultyLevel.Hard),
                avatars
            );
    }

}
