package emu.lunarcore.game.player.lineup;

import java.util.List;
import java.util.ArrayList;
import java.util.function.Consumer;

import org.bson.types.ObjectId;

import dev.morphia.annotations.Entity;
import dev.morphia.annotations.Id;
import dev.morphia.annotations.Indexed;
import emu.lunarcore.GameConstants;
import emu.lunarcore.LunarCore;
import emu.lunarcore.data.GameData;
import emu.lunarcore.data.excel.SpecialAvatarExcel;
import emu.lunarcore.game.avatar.AvatarData;
import emu.lunarcore.game.avatar.GameAvatar;
import emu.lunarcore.game.player.Player;
import emu.lunarcore.proto.AvatarTypeOuterClass.AvatarType;
import emu.lunarcore.proto.ExtraLineupTypeOuterClass.ExtraLineupType;
import emu.lunarcore.proto.LineupInfoOuterClass.LineupInfo;
import emu.lunarcore.server.packet.send.PacketSyncLineupNotify;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import lombok.Getter;
import lombok.Setter;

@Entity(value = "lineups", useDiscriminator = false) @Getter
public class PlayerLineup {
    @Id private ObjectId id;
    
    @Indexed private int ownerUid;
    private transient Player owner;
    
    @Setter private String name;
    @Setter private int lineupType;

    @Setter private List<LineupAvatarInfo> baseAvatars;
    
    @Setter private int leader;
    @Setter private int mp = 5;
    
    public PlayerLineup(Player player) {
        this.owner = player;
        this.ownerUid = player.getUid();
        this.name = "";
        this.lineupType = 0;
        this.baseAvatars = new ArrayList<>();
    }

    protected void setOwner(Player player) {
        this.owner = player;
    }
    
    public boolean isExtraLineup() {
        return lineupType != 0;
    }

    public int getSlot(int avatarId) {
        if (baseAvatars == null) return -1;
        for (int i = 0; i < baseAvatars.size(); i++) {
            if (baseAvatars.get(i).baseAvatarId == avatarId) {
                return i;
            }
        }
        return -1;
    }

    public boolean heal(int count, boolean allowRevive) {
        boolean result = false;
        if (baseAvatars != null && getOwner().getAvatars() != null) {
            for (LineupAvatarInfo avatarInfo : baseAvatars) {
                GameAvatar avatar = getOwner().getAvatarById(avatarInfo.getBaseAvatarId());
                if (avatar == null) continue;
                
                if (avatar.getCurrentHp(this) <= 0 && !allowRevive) continue;
                if (avatar.getCurrentHp(this) >= 10000 && count > 0) continue; // full hp
                if (avatar.getCurrentHp(this) <= 0 && count < 0) continue; // dead
                avatar.setCurrentHp(this, Math.max(Math.min(avatar.getCurrentHp(this) + count, 10000), 0));
                result = true;
            }
        }

        return result;
    }

    public boolean costNowPercentHp(double count) {
        boolean result = false;
        if (baseAvatars != null && getOwner().getAvatars() != null) {
            for (LineupAvatarInfo avatarInfo : baseAvatars) {
                GameAvatar avatar = getOwner().getAvatarById(avatarInfo.getBaseAvatarId());
                if (avatar == null) continue;
                if (avatar.getCurrentHp(this) <= 0) continue;

                avatar.setCurrentHp(this, (int) Math.max(avatar.getCurrentHp(this) * (1 - count), 100));
                result = true;
            }
        }
        return result;
    }

    public boolean addPercentSp(int count) {
        boolean result = false;
        if (baseAvatars != null && getOwner().getAvatars() != null) {
            for (LineupAvatarInfo avatarInfo : baseAvatars) {
                GameAvatar avatar = getOwner().getAvatarById(avatarInfo.getBaseAvatarId());
                if (avatar == null) continue;
                if (avatar.getCurrentHp(this) <= 0) continue;

                avatar.setCurrentSp(this, Math.min(avatar.getCurrentSp(this) + count, 10000));
                result = true;
            }
        }
    
        return result;
    }

    // Database
    public void save() {
        LunarCore.getGameDatabase().save(this);
    }
    
    public void delete() {
        LunarCore.getGameDatabase().delete(this);
    }
    
    // Serialization
    public LineupInfo toProto() {
        LineupInfo proto = LineupInfo.newInstance()
                .setName(this.getName())
                .setMaxMp(5)
                .setMp(this.getMp())
                .setExtraLineupTypeValue(this.getLineupType() == 13 ? 0 : this.getLineupType())
                .setIndex(this.getOwner().getLineupManager().getCurrentLineupIndex());

        if (this.getLineupType() != 0) {
            proto.setIndex(this.getLineupType() + 10);
        }

        if (this.getBaseAvatars().stream().anyMatch(item -> item.getBaseAvatarId() == this.getLeader())) {
            proto.setLeaderSlot(this.getBaseAvatars().indexOf(this.getBaseAvatars().stream()
                .filter(item -> item.getBaseAvatarId() == this.getLeader())
                .findFirst().orElse(null)));
        } else {
            proto.setLeaderSlot(0);
        }

        for (LineupAvatarInfo avatar : this.getBaseAvatars()) {
            if (avatar.getAssistUid() != 0) { // assist avatar
                GameAvatar assistPlayer = LunarCore.getGameDatabase()
                    .getObjectByField(GameAvatar.class, "ownerUid", avatar.getAssistUid());
                if (assistPlayer != null) {
                    proto.addAvatarList(assistPlayer.get().stream()
                        .filter(item -> item.getAvatarId() == avatar.getBaseAvatarId())
                        .findFirst()
                        .map(item -> item.toLineupInfo(this.getBaseAvatars().indexOf(avatar), this, 4))
                        .orElse(null));
                }
            } else if (avatar.getSpecialAvatarId() != 0) { // special avatar
                SpecialAvatarExcel specialAvatar = GameData.getSpecialAvatarExcelMap().get(avatar.getSpecialAvatarId());
                if (specialAvatar != null) {
                    proto.addAvatarList(specialAvatar.toGameavatar(this.getOwnerUid())
                        .toLineupInfo(this.getBaseAvatars().indexOf(avatar), this, 1));
                }
            } else { // normal avatar
                proto.addAvatarList(this.getBaseAvatars());
            }
        }

        Integer storyId = DatabaseHelper.getInstance().getInstance(StoryLineData.class, this.getAvatarData().getUid()).getCurStoryLineId();
        if (storyId != null && storyId != 0) {
            proto.setGameStoryLineId(storyId);
            this.getBaseAvatars().forEach(item -> {
                if (item.getSpecialAvatarId() != 0) {
                    proto.addStoryLineAvatarIdList(item.getSpecialAvatarId() / 10);
                }
            });
        }

        return proto;
    }
}