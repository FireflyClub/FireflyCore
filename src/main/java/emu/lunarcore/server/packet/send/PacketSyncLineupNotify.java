package emu.lunarcore.server.packet.send;

import emu.lunarcore.game.player.lineup.PlayerLineup;
import emu.lunarcore.proto.SyncLineupNotifyOuterClass.SyncLineupNotify;
import emu.lunarcore.proto.SyncReasonOuterClass.SyncReason;
import emu.lunarcore.server.packet.BasePacket;
import emu.lunarcore.server.packet.CmdId;

public class PacketSyncLineupNotify extends BasePacket {

    public PacketSyncLineupNotify(PlayerLineup lineup) {
        this(lineup, 0);
    }
    
    public PacketSyncLineupNotify(PlayerLineup lineup, int reason) {
        super(CmdId.SyncLineupNotify);

        var data = SyncLineupNotify.newInstance()
                .setLineup(lineup.toProto());
        
        if (reason != SyncReason.SYNC_REASON_NONE_VALUE) {
            data.addReasonList(SyncReason.forNumber(reason));
        }

        this.setData(data);
    }
}
