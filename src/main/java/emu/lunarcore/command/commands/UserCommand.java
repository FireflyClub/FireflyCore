package emu.lunarcore.command.commands;

import emu.lunarcore.command.Command;
import emu.lunarcore.command.CommandArgs;
import emu.lunarcore.command.CommandHandler;
import emu.lunarcore.config.ConfigManager;
import emu.lunarcore.game.login.PasswordHandler;

@Command(label = "user", permission = {"admin"}, desc = "/user { reg || del } [user] (pwd). Resolve a user.")
public class UserCommand implements CommandHandler {

    @Override
    public void execute(CommandArgs args) {
        String type = args.get(0);
        String user = args.get(1);
        if (type.equals("reg")) {
            if (ConfigManager.getLoginData().isUserExist(user)) {
                args.sendMessage(user + " already exists.");
                return;
            }

            String pwd = "";
            if (args.size() == 2) {
                pwd = PasswordHandler.hashWithMD5(args.get(1));
            }
            
            ConfigManager.getLoginData().update(user, pwd);
            args.sendMessage(user + " has been registered.");
        } else if (type.equals("del")) {
            if (!ConfigManager.getLoginData().isUserExist(user)) {
                args.sendMessage(user + " does not exists.");
                return;
            }

            ConfigManager.getLoginData().delete(user);
            args.sendMessage(user + " has been deleted.");
        } else {
            args.sendMessage("Invalid command syntax.");
        }

    }
}
