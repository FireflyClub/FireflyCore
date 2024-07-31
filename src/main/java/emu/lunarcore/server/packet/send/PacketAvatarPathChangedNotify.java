package emu.lunarcore.server.packet.send;

import emu.lunarcore.proto.AvatarPathChangedNotifyOuterClass;
import emu.lunarcore.proto.MultiPathAvatarTypeOuterClass;
import emu.lunarcore.server.packet.BasePacket;
import emu.lunarcore.server.packet.CmdId;

public class PacketAvatarPathChangedNotify extends BasePacket {

    public PacketAvatarPathChangedNotify(int baseAvatarId, MultiPathAvatarTypeOuterClass.MultiPathAvatarType type) {
        super(CmdId.AvatarPathChangedNotify);

        var data = AvatarPathChangedNotifyOuterClass.AvatarPathChangedNotify
            .newInstance()
            .setBaseAvatarId(baseAvatarId)
            .setMultiPathAvatarType(type);
        
        this.setData(data);
    }
}
