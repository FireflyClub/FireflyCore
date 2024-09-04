package emu.lunarcore.server.packet.send;

import java.util.List;

import emu.lunarcore.proto.PlayerSyncScNotifyOuterClass.PlayerSyncScNotify;
import emu.lunarcore.server.game.Syncable;
import emu.lunarcore.server.packet.BasePacket;
import emu.lunarcore.server.packet.CmdId;

public class PacketPlayerSyncScNotify extends BasePacket {

    @Deprecated // This constructor does not create a proto
    private PacketPlayerSyncScNotify() {
        super(CmdId.PlayerSyncScNotify);
    }
    
    public PacketPlayerSyncScNotify(Syncable object) {
        this();
        
        var data = PlayerSyncScNotify.newInstance();
        
        object.onSync(data);
        
        this.setData(data);
    }
    
    public PacketPlayerSyncScNotify(Syncable... objects) {
        this();
        
        var data = PlayerSyncScNotify.newInstance();
        
        for (var object : objects) {
            object.onSync(data);
        }
        
        this.setData(data);
    }
    
    public PacketPlayerSyncScNotify(List<? extends Syncable> objects) {
        this();
        
        var data = PlayerSyncScNotify.newInstance();
        
        for (var object : objects) {
            object.onSync(data);
        }
        
        this.setData(data);
    }
}
