package emu.lunarcore.server.packet.send;

import emu.lunarcore.data.GameData;
import emu.lunarcore.proto.TutorialStatusOuterClass.TutorialStatus;
import emu.lunarcore.proto.TutorialGuideOuterClass.TutorialGuide;
import emu.lunarcore.proto.GetTutorialGuideScRspOuterClass.GetTutorialGuideScRsp;
import emu.lunarcore.server.packet.BasePacket;
import emu.lunarcore.server.packet.CmdId;

public class PacketGetTutorialGuideScRsp extends BasePacket {

    public PacketGetTutorialGuideScRsp() {
        super(CmdId.GetTutorialGuideScRsp);

        var data = GetTutorialGuideScRsp.newInstance();

        for (var id: GameData.getTutorialGuideGroupExcelMap().values()) {
            data.addTutorialGuideList(
                TutorialGuide
                    .newInstance()
                    .setStatus(TutorialStatus.TUTORIAL_FINISH)
                    .setId(id.getGroupID())
            );
        }

        this.setData(data);
    }
}
