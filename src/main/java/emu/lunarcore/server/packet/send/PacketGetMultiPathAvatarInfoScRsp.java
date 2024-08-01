package emu.lunarcore.server.packet.send;

import emu.lunarcore.game.avatar.AvatarMultiPath;
import emu.lunarcore.game.player.Player;
import emu.lunarcore.proto.GetMultiPathAvatarInfoScRspOuterClass.GetMultiPathAvatarInfoScRsp;
import emu.lunarcore.proto.GetMultiPathAvatarInfoScRspOuterClass.GetMultiPathAvatarInfoScRsp.CurrentMultiAvatarIdEntry;
import emu.lunarcore.server.packet.BasePacket;
import emu.lunarcore.server.packet.CmdId;

public class PacketGetMultiPathAvatarInfoScRsp extends BasePacket {

    public PacketGetMultiPathAvatarInfoScRsp(Player player) {
        super(CmdId.GetMultiPathAvatarInfoScRsp);

        var data = GetMultiPathAvatarInfoScRsp.newInstance();
        
        for (AvatarMultiPath path : player.getAvatars().getMultiPaths().values()) {
            data.addMultiAvatarTypeInfoList(path.toProto());
        }
        
        for (var entry : player.getCurAvatarPaths().entrySet()) {
            var info = CurrentMultiAvatarIdEntry.newInstance()
                    .setKey(entry.getKey())
                    .setValueValue(entry.getValue());
            
            data.addCurrentMultiAvatarId(info);
            data.addMultiAvatarTypeIdList(entry.getValue());
        }

        this.setData(data);
    }
}
