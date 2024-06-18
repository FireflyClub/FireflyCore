package emu.lunarcore.server.packet.recv;

import emu.lunarcore.LunarCore;
import emu.lunarcore.game.multi.MultiService;
import emu.lunarcore.game.player.Player;
import emu.lunarcore.proto.SceneEntityMoveCsReqOuterClass.SceneEntityMoveCsReq;
import emu.lunarcore.server.game.GameSession;
import emu.lunarcore.server.packet.CmdId;
import emu.lunarcore.server.packet.Opcodes;
import emu.lunarcore.server.packet.PacketHandler;

@Opcodes(CmdId.SceneEntityMoveCsReq)
public class HandlerSceneEntityMoveCsReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] data) throws Exception {
        var req = SceneEntityMoveCsReq.parseFrom(data);

        for (var entityMotion : req.getEntityMotionList()) {
            // Update player position
            if (session.getPlayer().getScene().getAvatarEntityIds().contains(entityMotion.getEntityId())) {
                var vec = entityMotion.getMotion().getPos();
                session.getPlayer().getPos().set(vec.getX(), vec.getY(), vec.getZ());
                session.getPlayer().onMove();

                // Check if player in multi
                int multiId = session.getPlayer().getScene().getMultiPlayerId();
                Player multiPlayer = LunarCore.getGameServer().getOnlinePlayerByUid(multiId);

                if (multiId != 0 && multiPlayer != null) {
                    MultiService multiService = new MultiService();
                    multiService.handleMultiCheck(session, multiPlayer);
                }
            }
        }

        session.send(CmdId.SceneEntityMoveScRsp);
    }

}
