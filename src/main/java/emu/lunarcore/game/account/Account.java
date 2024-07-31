package emu.lunarcore.game.account;

import java.util.*;

import dev.morphia.annotations.*;

import emu.lunarcore.LunarCore;
import emu.lunarcore.config.ConfigManager;
import emu.lunarcore.database.AccountDatabaseOnly;
import emu.lunarcore.util.Crypto;
import emu.lunarcore.util.Snowflake32;

import lombok.Getter;
import lombok.Setter;

@Getter
@AccountDatabaseOnly
@Entity(value = "accounts", useDiscriminator = false)
public class Account {
    @Id private String uid;

    @Indexed(options = @IndexOptions(unique = true))
    @Collation(locale = "simple", caseLevel = true)
    private String username;
    private String password; // Unused for now

    private int reservedPlayerUid;

    private String comboToken; // Combo token
    private String dispatchToken; // Session token for dispatch server

    private Set<String> permissions;

    //@Setter public String deviceId;
    @Setter public boolean isBanned;

    @Deprecated
    public Account() {

    }

    public Account(String username) {
        this.uid = Long.toString(Snowflake32.newUid());
        this.username = username;
        this.permissions = new HashSet<>(ConfigManager.getConfig().getServerOptions().getDefaultPermissions());
        //this.deviceId = "";
        this.isBanned = false;
    }

    public String getEmail() {
        return username;
    }
    
    public void setReservedPlayerUid(int uid) {
        this.reservedPlayerUid = uid;
    }

    // Permissions

    public Set<String> getPermissions() {
        if (this.permissions == null) {
            this.permissions = new HashSet<>();
            this.save();
        }
        return this.permissions;
    }

    public boolean addPermission(String permission) {
        if (this.getPermissions().contains(permission)) {
            return false;
        }
        this.getPermissions().add(permission);
        this.save();
        return true;
    }

    public boolean hasPermission(String permission) {
        // Skip if permission is empty
        if (permission.isEmpty()) {
            return true;
        }

        // Check if the combined list contains the specific permission
        List<String> permissions = this.getPermissions().stream().distinct().toList();
        if (permissions.contains(permission)) {
            return true;
        }
    
        // Loop through each permission to handle any negating permissions
        for (String p : permissions) {
            if (p.startsWith("-") && p.substring(1).equals(permission)) {
                return false;
            }
        }
    
        return false;
    }

    public boolean removePermission(String permission) {
        boolean res = this.getPermissions().remove(permission);
        if (res) this.save();
        return res;
    }

    public void clearPermission() {
        this.getPermissions().clear();
        this.save();
    }

    // Tokens

    public String generateComboToken() {
        this.comboToken = Crypto.createSessionKey(this.getUid());
        this.save();
        return this.comboToken;
    }

    public String generateDispatchToken() {
        this.dispatchToken = Crypto.createSessionKey(this.getUid());
        this.save();
        return this.dispatchToken;
    }

    // Database

    public void save() {
        LunarCore.getAccountDatabase().save(this);
    }

}
