package emu.lunarcore.server.packet.recv;

import java.util.ArrayList;
import java.util.List;

import emu.lunarcore.data.common.ItemParam;
import emu.lunarcore.proto.AvatarExpUpCsReqOuterClass.AvatarExpUpCsReq;
import emu.lunarcore.proto.ItemCostOuterClass.ItemCost;
import emu.lunarcore.server.game.GameSession;
import emu.lunarcore.server.packet.CmdId;
import emu.lunarcore.server.packet.Opcodes;
import emu.lunarcore.server.packet.PacketHandler;
import emu.lunarcore.server.packet.send.PacketAvatarExpUpScRsp;

@Opcodes(CmdId.AvatarExpUpCsReq)
public class HandlerAvatarExpUpCsReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] data) throws Exception {
        var req = AvatarExpUpCsReq.parseFrom(data);

        List<ItemParam> items = new ArrayList<>(req.getUseItemList().getItemList().length());
        for (ItemCost cost : req.getUseItemList().getItemList()) {
            items.add(new ItemParam(cost));
        }

        var returnItems = session.getServer().getInventoryService().levelUpAvatar(session.getPlayer(), req.getSceneAvatarId(), items);
        session.send(new PacketAvatarExpUpScRsp(returnItems));
    }

}
