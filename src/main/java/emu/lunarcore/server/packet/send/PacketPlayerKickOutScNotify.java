package emu.lunarcore.server.packet.send;

import emu.lunarcore.server.packet.BasePacket;
import emu.lunarcore.server.packet.CmdId;

public class PacketPlayerKickOutScNotify extends BasePacket {

    public PacketPlayerKickOutScNotify() {
        super(CmdId.PlayerKickOutScNotify);
    }
}
