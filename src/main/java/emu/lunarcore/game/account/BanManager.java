package emu.lunarcore.game.account;

import emu.lunarcore.game.player.Player;

/**
 * BanManager handles player banning operations in the game.
 */
public class BanManager {
    
    public static boolean checkBanPerm(Player player) {
        return player.getAccount().hasPermission("admin");
    }

    public static boolean ban(int playerUid) {
        Account account = Player.getAccountByDatabase(playerUid);

        if (account == null) {
            return false;
        }
        
        account.setBanned(true);
        account.save();
        return true;
    }

    public static boolean unban(int playerUid) {
        Account account = Player.getAccountByDatabase(playerUid);

        if (account == null) {
            return false;
        }
        
        account.setBanned(false);
        account.save();
        return true;
    }

}
