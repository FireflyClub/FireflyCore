package emu.lunarcore.server.packet.send;

import emu.lunarcore.game.avatar.GameAvatar;
import emu.lunarcore.game.player.Player;
import emu.lunarcore.proto.GetAvatarDataScRspOuterClass.GetAvatarDataScRsp;
import emu.lunarcore.server.packet.BasePacket;
import emu.lunarcore.server.packet.CmdId;
import it.unimi.dsi.fastutil.ints.Int2IntMap;
import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;

public class PacketGetAvatarDataScRsp extends BasePacket {
    
    public PacketGetAvatarDataScRsp(Player player) {
        super(CmdId.GetAvatarDataScRsp);

        var data = GetAvatarDataScRsp.newInstance()
                .setIsGetAll(true);

        Int2IntMap loadedBaseAvatarId = new Int2IntOpenHashMap();
        for (GameAvatar avatar : player.getAvatars()) {
            if(avatar.getMultiPathExcel() != null) {
                var baseAvatarId = avatar.getMultiPathExcel().getBaseAvatarID();
                
                if(loadedBaseAvatarId.containsKey(baseAvatarId)) continue; 
                
                if(avatar.getAvatarId() == player.getCurrentMultiPathAvatarType().get(baseAvatarId)) {
                    data.addAvatarList(avatar.toProto(baseAvatarId));
                    loadedBaseAvatarId.put(baseAvatarId, 1);
                }
                
                continue;
            }
            
            data.addAvatarList(avatar.toProto());
        }

        this.setData(data);
    }
    
}