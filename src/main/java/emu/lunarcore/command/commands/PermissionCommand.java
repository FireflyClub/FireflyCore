package emu.lunarcore.command.commands;

import java.util.Set;

import emu.lunarcore.command.Command;
import emu.lunarcore.command.CommandArgs;
import emu.lunarcore.command.CommandHandler;
import emu.lunarcore.game.account.Account;
import emu.lunarcore.game.player.Player;

@Command(label = "permission", aliases = {"perm"}, permission = {"admin"}, requireTarget = true, desc = "/permission {add ( player | vip | admin ) | remove | clear} [permission]. Gives/removes a permission from the targeted player.")
public class PermissionCommand implements CommandHandler {

    @Override
    public void execute(CommandArgs args) {
        String type = args.get(0).toLowerCase();
        String permission = args.get(1).toLowerCase();

        // Transform input permission except for 'clear' command
        Set<String> allowedPermissions = Set.of("player", "vip", "admin");
        if (!type.equals("clear") && !allowedPermissions.contains(permission)) {
            args.sendMessage("Error: Invalid permission. Only 'player', 'vip', or 'admin' are allowed.");
            return;
        }
        
        // Call the simplified handlePermission method
        handlePermission(type, args, permission);
    }

    public void handlePermission(String type, CommandArgs args, String permission) {
        int playerUid = args.getTargetUid();
        String playerName = args.getTarget().getName();
        Account account = (args.getOnlineTarget() != null) ? args.getOnlineTarget().getAccount() : Player.getAccountByDatabase(playerUid);

        if (account != null) {
            switch (type) {
                case "add":
                    if (!permission.isEmpty()) {
                        account.addPermission(permission);
                        args.sendMessage("Added permission for " + playerName);
                    }
                    break;
                case "remove":
                    if (!permission.isEmpty()) {
                        account.removePermission(permission);
                        args.sendMessage("Removed permission for " + playerName);
                    }
                    break;
                case "clear":
                    account.clearPermission();
                    args.sendMessage("Cleared permissions for " + playerName);
                    break;
                default:
                    args.sendMessage("Error: Invalid arguments");
                    break;
            }
        }
    }

}
