package emu.lunarcore.server.packet.send;

import emu.lunarcore.proto.FirstNpcTalkInfoOuterClass.FirstNpcTalkInfo;
import emu.lunarcore.proto.GetFirstTalkNpcCsReqOuterClass.GetFirstTalkNpcCsReq;
import emu.lunarcore.proto.GetFirstTalkNpcScRspOuterClass.GetFirstTalkNpcScRsp;
import emu.lunarcore.server.packet.BasePacket;
import emu.lunarcore.server.packet.CmdId;

public class PacketGetFirstTalkNpcScRsp extends BasePacket {

    public PacketGetFirstTalkNpcScRsp(GetFirstTalkNpcCsReq req) {
        super(CmdId.GetFirstTalkNpcScRsp);

        var data = GetFirstTalkNpcScRsp
            .newInstance();
         
        for (var npcId: req.getNpcIdList()) {
            data.addNpcTalkInfoList(
                FirstNpcTalkInfo
                    .newInstance()
                    .setFirstNpcId(npcId)
                    .setFinishDialogue(true)
            );
        }
        
        this.setData(data);
    }
}
