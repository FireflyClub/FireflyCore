/*package emu.lunarcore.server.packet.send;

import emu.lunarcore.data.GameData;
import emu.lunarcore.proto.ContentInfoOuterClass.ContentInfo;
import emu.lunarcore.proto.ContentPackageStatusOuterClass.ContentPackageStatus;
import emu.lunarcore.proto.ContentPackageSyncDataScNotifyOuterClass.ContentPackageSyncDataScNotify;
import emu.lunarcore.server.packet.BasePacket;
import emu.lunarcore.server.packet.CmdId;

public class PacketContentPackageSyncDataScNotify extends BasePacket {

    public PacketContentPackageSyncDataScNotify() {
        super(CmdId.ContentPackageSyncDataScNotify);

        var data = ContentPackageSyncDataScNotify.newInstance();

        for (var content : GameData.getContentPackageExcelMap().values()) {
            var contentInfo = ContentInfo.newInstance()
                    .setMapEntryId(content.getContentID())
                    .setStatus(ContentPackageStatus.ContentPackageStatus_Finished);
            data.getMutableData().addContentInfoList(contentInfo);
        }

        this.setData(data);
    }
}*/

package emu.lunarcore.server.packet.send;

import emu.lunarcore.proto.ContentPackageStatusOuterClass.ContentPackageStatus;
import emu.lunarcore.proto.ContentInfoOuterClass.ContentInfo;
import emu.lunarcore.proto.ContentPackageDataOuterClass.ContentPackageData;
import emu.lunarcore.server.packet.BasePacket;
import emu.lunarcore.server.packet.CmdId;

public class PacketContentPackageSyncDataScNotify extends BasePacket {

    public PacketContentPackageSyncDataScNotify() {
        super(CmdId.ContentPackageSyncDataScNotify);
            var data = ContentPackageData
                .newInstance()
                .setBDIKNBLIEJF(0) // moduleId?
                .addContentInfoList(
                    ContentInfo
                        .newInstance()
                        .setMapEntryId(200001)
                        .setStatus(ContentPackageStatus.ContentPackageStatus_Finished)
                )
                .addContentInfoList(
                    ContentInfo
                        .newInstance()
                        .setMapEntryId(200002)
                        .setStatus(ContentPackageStatus.ContentPackageStatus_Finished)
                )
                .addContentInfoList(
                    ContentInfo
                        .newInstance()
                        .setMapEntryId(200003)
                        .setStatus(ContentPackageStatus.ContentPackageStatus_Finished)
                )
                .addContentInfoList(
                    ContentInfo
                        .newInstance()
                        .setMapEntryId(150017)
                        .setStatus(ContentPackageStatus.ContentPackageStatus_Finished)
                )
                .addContentInfoList(
                    ContentInfo
                        .newInstance()
                        .setMapEntryId(150015)
                        .setStatus(ContentPackageStatus.ContentPackageStatus_Finished)
                );
            
        this.setData(data);
    }
}