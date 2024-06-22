package emu.lunarcore.server.packet.send;

import emu.lunarcore.proto.GetMultiPathAvatarInfoScRspOuterClass.GetMultiPathAvatarInfoScRsp;
import emu.lunarcore.game.player.Player;
import emu.lunarcore.server.packet.BasePacket;
import emu.lunarcore.server.packet.CmdId;

public class PacketGetMultiPathAvatarInfoScRsp extends BasePacket {

    public PacketGetMultiPathAvatarInfoScRsp(Player player) {
        super(CmdId.GetMissionStatusScRsp);

        var data = GetMultiPathAvatarInfoScRsp.newInstance();
        
        for  (var path : player.getCurrentMultiPathAvatarType().int2IntEntrySet()) {
            data.addCurrentMultiAvatarId(
                GetMultiPathAvatarInfoScRsp
                    .CurrentMultiAvatarIdEntry
                    .newInstance()
                    .setKey(path.getIntKey())
                    .setValueValue(path.getIntValue())
            );
        }
        
        for (var path : player.getAvatars().getMultiplePathAvatars()) {
            data.addAllMultiAvatarTypeInfoList(path.toMultiPathAvatarProto());
        }
        
        this.setData(data);
    }

}