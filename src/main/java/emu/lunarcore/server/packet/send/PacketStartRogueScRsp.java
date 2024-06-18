package emu.lunarcore.server.packet.send;

import emu.lunarcore.game.player.Player;
import emu.lunarcore.proto.StartRogueScRspOuterClass.StartRogueScRsp;
import emu.lunarcore.server.packet.BasePacket;
import emu.lunarcore.server.packet.CmdId;

public class PacketStartRogueScRsp extends BasePacket {

    public PacketStartRogueScRsp() {
        this(1);
    }

    public PacketStartRogueScRsp(int retcode) {
        super(CmdId.StartRogueScRsp);
        
        var data = StartRogueScRsp.newInstance()
                .setRetcode(retcode);
        
        this.setData(data);
    }
    
    public PacketStartRogueScRsp(Player player) {
        super(CmdId.StartRogueScRsp);

        var data = StartRogueScRsp.newInstance()
                .setRogueInfo(player.getRogueManager().toProto())
                .setLineup(player.getCurrentLineup().toProto())
                .setScene(player.getScene().toProto());
        
        this.setData(data);
    }
}
