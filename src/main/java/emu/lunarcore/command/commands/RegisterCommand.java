package emu.lunarcore.command.commands;

import java.util.Arrays;

import emu.lunarcore.command.Command;
import emu.lunarcore.command.CommandArgs;
import emu.lunarcore.command.CommandHandler;
import emu.lunarcore.config.ConfigManager;
import emu.lunarcore.game.login.PasswordHandler;

@Command(label = "register", aliases = {"reg"}, permission = {"admin"}, desc = "/register [account]. Register a new account.")
public class RegisterCommand implements CommandHandler {

    @Override
    public void execute(CommandArgs args) {
        String account = args.get(0);
        String pwd = "";
        if (args.size() == 2) {
            pwd = PasswordHandler.hashWithMD5(args.get(1));
        }
        
        ConfigManager.getLoginData().update(account, pwd, Arrays.asList());
        args.sendMessage(account + " has been registered.");
    }
}
