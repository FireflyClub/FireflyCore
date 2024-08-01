package emu.lunarcore.server.packet.send;

import java.util.Collection;
import emu.lunarcore.game.avatar.GameAvatar;
import emu.lunarcore.game.avatar.IAvatar;
import emu.lunarcore.game.avatar.AvatarMultiPath;
import emu.lunarcore.game.inventory.GameItem;
import emu.lunarcore.game.player.Player;
import emu.lunarcore.proto.BoardDataSyncOuterClass.BoardDataSync;
import emu.lunarcore.proto.MissionSyncOuterClass.MissionSync;
import emu.lunarcore.proto.MissionOuterClass.Mission;
import emu.lunarcore.proto.MissionStatusOuterClass.MissionStatus;
import emu.lunarcore.proto.PlayerSyncScNotifyOuterClass.PlayerSyncScNotify;
import emu.lunarcore.server.packet.BasePacket;
import emu.lunarcore.server.packet.CmdId;

public class PacketPlayerSyncScNotify extends BasePacket {

    @Deprecated // This constructor does not create a proto
    private PacketPlayerSyncScNotify() {
        super(CmdId.PlayerSyncScNotify);
    }

    public PacketPlayerSyncScNotify(Player player) {
        this();

        var data = PlayerSyncScNotify.newInstance()
                .setBasicInfo(player.toProto());

        this.setData(data);
    }
    
    public PacketPlayerSyncScNotify(BoardDataSync boardData) {
        this();

        var data = PlayerSyncScNotify.newInstance()
                .setBoardDataSync(boardData);

        this.setData(data);
    }
    
    public PacketPlayerSyncScNotify(IAvatar baseAvatar) {
        this();
        
        var data = PlayerSyncScNotify.newInstance();
        
        if (baseAvatar instanceof GameAvatar avatar) {
            data.getMutableAvatarSync().addAvatarList(avatar.toProto());
            
            // Also update multipath info
            if (avatar.getMultiPath() != null) {
                data.addMultiAvatarTypeInfoList(avatar.getMultiPath().toProto());
            }
        } else if (baseAvatar instanceof AvatarMultiPath multiPath) {
            data.addMultiAvatarTypeInfoList(multiPath.toProto());
        }
        
        this.setData(data);
    }
    
    public PacketPlayerSyncScNotify(IAvatar baseAvatar, GameItem item) {
        this();
        
        var data = PlayerSyncScNotify.newInstance();
        
        if (baseAvatar instanceof GameAvatar avatar) {
            data.getMutableAvatarSync().addAvatarList(avatar.toProto());
            
            // Also update multipath info
            if (avatar.getMultiPath() != null) {
                data.addMultiAvatarTypeInfoList(avatar.getMultiPath().toProto());
            }
        } else if (baseAvatar instanceof AvatarMultiPath multiPath) {
            data.addMultiAvatarTypeInfoList(multiPath.toProto());
        }
        
        this.addItemToProto(data, item);
        
        this.setData(data);
    }

    public PacketPlayerSyncScNotify(GameAvatar avatar) {
        this();

        var data = PlayerSyncScNotify.newInstance();
        
        // Update avatar
        data.getMutableAvatarSync().addAvatarList(avatar.toProto());
        
        // Also update multipath info
        if (avatar.getMultiPath() != null) {
            data.addMultiAvatarTypeInfoList(avatar.getMultiPath().toProto());
        }

        this.setData(data);
    }

    public PacketPlayerSyncScNotify(GameAvatar avatar, GameItem item) {
        this();

        var data = PlayerSyncScNotify.newInstance();
        
        // Update avatar
        data.getMutableAvatarSync().addAvatarList(avatar.toProto());

        // Also update multipath info
        if (avatar.getMultiPath() != null) {
            data.addMultiAvatarTypeInfoList(avatar.getMultiPath().toProto());
        }
        
        // Update item
        this.addItemToProto(data, item);

        this.setData(data);
    }

    public PacketPlayerSyncScNotify(GameItem item) {
        this();

        var data = PlayerSyncScNotify.newInstance();

        this.addItemToProto(data, item);

        this.setData(data);
    }
    
    public PacketPlayerSyncScNotify(GameAvatar... avatars) { // Ugly workaround
        this();

        var data = PlayerSyncScNotify.newInstance();
        
        for (var avatar : avatars) {
            // Sync avatar
            data.getMutableAvatarSync().addAvatarList(avatar.toProto());
            
            // Also update hero basic type info if were updating the main character
            if (avatar.getMultiPath() != null) {
                data.addMultiAvatarTypeInfoList(avatar.getMultiPath().toProto());
            }
        }
        
        this.setData(data);
    }

    public PacketPlayerSyncScNotify(Collection<GameItem> items) {
        this();

        var data = PlayerSyncScNotify.newInstance();

        for (GameItem item : items) {
            this.addItemToProto(data, item);
        }

        this.setData(data);
    }

    private void addItemToProto(PlayerSyncScNotify data, GameItem item) {
        switch (item.getExcel().getItemMainType().getTabType()) {
            case MATERIAL -> {
                data.addMaterialList(item.toMaterialProto());
            }
            case RELIC -> {
                if (item.getCount() > 0) {
                    data.addRelicList(item.toRelicProto());
                } else {
                    data.addDelRelicList(item.getInternalUid());
                }
            }
            case EQUIPMENT -> {
                if (item.getCount() > 0) {
                    data.addEquipmentList(item.toEquipmentProto());
                } else {
                    data.addDelEquipmentList(item.getInternalUid());
                }
            }
            default -> {
                // Skip
            }
        }
    }
    
    public PacketPlayerSyncScNotify(AvatarMultiPath... multiPaths) {
        this();

        var data = PlayerSyncScNotify.newInstance();
        
        for (var path : multiPaths) {
            if (path != null) {
                data.addMultiAvatarTypeInfoList(path.toProto());
            }
        }
        
        this.setData(data);
    }


    public PacketPlayerSyncScNotify(int mainMissionId, int[] subMissionIds, MissionStatus missionStatus) {
        this();

        var missionSync = MissionSync.newInstance();

        for (int subMissionId : subMissionIds) {
            missionSync.addMissionList(
                Mission.newInstance()
                    .setId(subMissionId)
                    .setStatus(missionStatus)
            );
        }

        var data = PlayerSyncScNotify.newInstance()
            .setMissionSync(missionSync);

        this.setData(data);
    }
}
