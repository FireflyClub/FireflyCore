package emu.lunarcore.server.packet.send;

import emu.lunarcore.proto.FinishTalkMissionCsReqOuterClass.FinishTalkMissionCsReq;
import emu.lunarcore.proto.FinishTalkMissionScRspOuterClass.FinishTalkMissionScRsp;
import emu.lunarcore.game.player.Player;
import emu.lunarcore.server.packet.BasePacket;
import emu.lunarcore.server.packet.CmdId;

public class PacketFinishTalkMissionScRsp extends BasePacket {

    public PacketFinishTalkMissionScRsp(FinishTalkMissionCsReq req, Player target) {
        super(CmdId.FinishTalkMissionScRsp);

        int submissionid = req.getSubMissionId();

        var data = FinishTalkMissionScRsp.newInstance()
            .setSubMissionId(submissionid)
            .setTalkStr(req.getTalkStr());
        
        for (var item : req.getCustomValueList()) {
            data.addCustomValueList(item);
        }

        this.setData(data);
    }
}