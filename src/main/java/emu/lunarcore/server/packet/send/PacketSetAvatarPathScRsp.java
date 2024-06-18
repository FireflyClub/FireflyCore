package emu.lunarcore.server.packet.send;

import emu.lunarcore.game.player.Player;
import emu.lunarcore.proto.SetAvatarPathScRspOuterClass.SetAvatarPathScRsp;
import emu.lunarcore.server.packet.BasePacket;
import emu.lunarcore.server.packet.CmdId;

public class PacketSetAvatarPathScRsp extends BasePacket {

    public PacketSetAvatarPathScRsp(Player player) {
        super(CmdId.SetAvatarPathScRsp);
        
        var data = SetAvatarPathScRsp.newInstance()
                .setAvatarIdValue(player.getCurBasicType());
        
        this.setData(data);
    }
}
