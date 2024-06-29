package emu.lunarcore.server.packet.send;

import emu.lunarcore.proto.RefreshTriggerByClientScNotifyOuterClass.RefreshTriggerByClientScNotify;
import emu.lunarcore.server.packet.BasePacket;
import emu.lunarcore.server.packet.CmdId;
import it.unimi.dsi.fastutil.ints.IntSet;

public class PacketRefreshTriggerByClientScNotify extends BasePacket {

    public PacketRefreshTriggerByClientScNotify(int triggerEntityId, String name, IntSet targetIds) {
        super(CmdId.RefreshTriggerByClientScNotify);
        
        var data = RefreshTriggerByClientScNotify.newInstance()
                .setTriggerName(name)
                .setTriggerEntityId(triggerEntityId);
        
        for (int id : targetIds) {
            data.addTriggerTargetIdList(id);
        }
        
        this.setData(data);
    }
}
