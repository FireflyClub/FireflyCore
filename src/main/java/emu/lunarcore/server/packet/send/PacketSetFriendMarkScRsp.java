package emu.lunarcore.server.packet.send;

import emu.lunarcore.proto.SetFriendMarkScRspOuterClass.SetFriendMarkScRsp;
import emu.lunarcore.server.packet.BasePacket;
import emu.lunarcore.server.packet.CmdId;

public class PacketSetFriendMarkScRsp extends BasePacket {

    public PacketSetFriendMarkScRsp(int friendUid, boolean isSetMark) {
        super(CmdId.SetFriendMarkScRsp);
        
        var data = SetFriendMarkScRsp.newInstance()
                .setUid(friendUid)
                .setIsSetMark(isSetMark);
        
        this.setData(data);
    }
}
