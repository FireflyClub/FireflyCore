package emu.lunarcore.server.packet.send;

import emu.lunarcore.proto.ContentPackageStatusOuterClass.ContentPackageStatus;
import emu.lunarcore.data.GameData;
import emu.lunarcore.proto.ContentPackageInfoOuterClass.ContentPackageInfo;
import emu.lunarcore.proto.ContentPackageDataOuterClass.ContentPackageData;
import emu.lunarcore.proto.ContentPackageSyncDataScNotifyOuterClass.ContentPackageSyncDataScNotify;
import emu.lunarcore.server.packet.BasePacket;
import emu.lunarcore.server.packet.CmdId;

public class PacketContentPackageSyncDataScNotify extends BasePacket {

    public PacketContentPackageSyncDataScNotify() {
        super(CmdId.ContentPackageSyncDataScNotify);

        var contentPackageData = ContentPackageData.newInstance().setCurContentId(0);
        for (var content : GameData.getContentPackageExcelMap().values()) {
            var contentInfo = ContentPackageInfo.newInstance()
                    .setMapEntryId(content.getContentID())
                    .setStatus(ContentPackageStatus.ContentPackageStatus_Finished);

            contentPackageData.addContentPackageList(contentInfo);
        }

        var data = ContentPackageSyncDataScNotify.newInstance().setData(contentPackageData);

        this.setData(data);
    }
}