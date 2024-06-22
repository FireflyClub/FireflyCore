package emu.lunarcore.game.avatar;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.bson.types.ObjectId;

import emu.lunarcore.LunarCore;
import emu.lunarcore.data.GameData;
import emu.lunarcore.data.excel.AvatarExcel;
import emu.lunarcore.game.inventory.GameItem;
import emu.lunarcore.game.player.BasePlayerManager;
import emu.lunarcore.game.player.Player;
import emu.lunarcore.server.packet.send.PacketPlayerSyncScNotify;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import lombok.Getter;

@Getter
public class AvatarStorage extends BasePlayerManager implements Iterable<GameAvatar> {
    private final Int2ObjectMap<GameAvatar> avatars;
    private final Object2ObjectMap<ObjectId, GameAvatar> avatarObjectIdMap;
    
    public AvatarStorage(Player player) {
        super(player);
        this.avatars = new Int2ObjectOpenHashMap<>();
        this.avatarObjectIdMap = new Object2ObjectOpenHashMap<>();
    }

    public int getAvatarCount() {
        return this.avatars.size();
    }

    public GameAvatar getAvatarById(int id) {
        return getAvatars().get(id);
    }
    
    public GameAvatar getAvatarById(ObjectId id) {
        if (id == null) {
            return null;
        }
        
        return getAvatarObjectIdMap().get(id);
    }

    public boolean hasAvatar(int id) {
        return getAvatars().containsKey(id);
    }
    
    public List<GameAvatar> getMultiplePathAvatars() {
        return getAvatars().values().stream().filter(p -> p.isMultiplePath() && (!p.isHero() || p.getGender() == getPlayer().getGender())).collect(Collectors.toList());
    }

    public boolean addAvatar(GameAvatar avatar) {
        // Sanity - Dont add avatars we already have OR avatars that dont have excel data
        if (avatar.getExcel() == null || this.hasAvatar(avatar.getAvatarId())) {
            return false;
        }

        // Add avatar that has multiple type into player.
        if(avatar.isMultiplePath()) {
            getPlayer().getCurrentMultiPathAvatarType().put(avatar.getMultiPathExcel().getBaseAvatarID(), avatar.getAvatarId());
        }

        // Set owner first
        avatar.setOwner(getPlayer());
        
        // Save avatar
        avatar.save();

        // Put into avatar map
        this.avatars.put(avatar.getAvatarId(), avatar);
        this.avatarObjectIdMap.put(avatar.getId(), avatar);

        // Send packet
        getPlayer().sendPacket(new PacketPlayerSyncScNotify(avatar));
        
        // Add head icon
        getPlayer().getUnlocks().addHeadIcon(avatar.getHeadIconId());

        // Done
        return true;
    }
    

    @Override
    public Iterator<GameAvatar> iterator() {
        return getAvatars().values().iterator();
    }

    // Database

    public void loadFromDatabase() {
        // Load avatars
        Stream<GameAvatar> stream = LunarCore.getGameDatabase().getObjects(GameAvatar.class, "ownerUid", this.getPlayer().getUid());
        stream.forEach(this::loadAvatar);
    }

    public boolean loadAvatar(GameAvatar avatar) {
        // Should never happen
        if (avatar.getId() == null) {
            return false;
        }
        
        // Check avatar owner
        if (avatar.getOwnerUid() != this.getPlayer().getUid()) {
            return false;
        }
        
        // Load avatar excel data
        AvatarExcel excel = GameData.getAvatarExcelMap().get(avatar.getAvatarId());
        if (excel == null) {
            return false;
        }

        // Set excel
        avatar.setExcel(excel);
        
        // Set ownership
        avatar.setOwner(getPlayer());

        // Add to avatar storage
        this.avatars.put(avatar.getAvatarId(), avatar);
        this.avatarObjectIdMap.put(avatar.getId(), avatar);
        
        // Done
        return true;
    }
    
    public GameAvatar loadAvatarByObjectId(ObjectId id) {
        // Load avatar
        GameAvatar avatar = LunarCore.getGameDatabase().getObjectByField(GameAvatar.class, "_id", id);
        
        if (this.loadAvatar(avatar)) {
            // Load items
            var stream = LunarCore.getGameDatabase().getObjects(GameItem.class, "equipAvatarId", id);
            stream.forEach(this.getPlayer().getInventory()::loadItem);
        }
        
        return avatar;
    }
}
