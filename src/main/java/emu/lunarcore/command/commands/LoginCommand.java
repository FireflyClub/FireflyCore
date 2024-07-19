package emu.lunarcore.command.commands;

import emu.lunarcore.command.Command;
import emu.lunarcore.command.CommandArgs;
import emu.lunarcore.command.CommandHandler;
import emu.lunarcore.config.ConfigManager;
import emu.lunarcore.game.login.LoginManager;
import emu.lunarcore.game.login.PasswordHandler;
import emu.lunarcore.server.game.GameSession;

@Command(label = "login", permission = {"player"}, requireTargetOnline = true, desc = "/login [account] [pwd]. Login to your account.")
public class LoginCommand implements CommandHandler {

    @Override
    public void execute(CommandArgs args) {
        if (args.size() != 2) {
            args.sendMessage("Invalid command format.");
            return;
        }
        if (args.getSender() == null) {
            args.sendMessage("You must be in game to use this command.");
            return;
        }
        if (args.getTarget() != args.getSender()) {
            args.sendMessage("You can only login for your own account.");
            return;
        }

        // Login task
        String account = args.get(0);
        String sendPwd = PasswordHandler.hashWithMD5(args.get(1));
        GameSession session = args.getSender().getSession();
        LoginManager loginManager = session.getLoginManager();
        String accountPwd = LoginManager.getLoginPwdByAccount(account);
        if (loginManager == null) {
            args.sendMessage("You are not allowed to login.");
            return;
        }
        if (accountPwd == null) {
            args.sendMessage("Account not found.");
            return;
        }

        // Check password
        if (accountPwd.isEmpty()) {
            args.sendMessage("Account first login, your passwoed is set as: " + args.get(1));
            ConfigManager.getLoginData().update(account, sendPwd);
            loginManager.loginSuccess(args.getSender());
        } else if (accountPwd.equals(sendPwd)) {
            args.sendMessage("Login success.");
            loginManager.loginSuccess(args.getSender());
        } else {
            args.sendMessage("Incorrect password.");
        }
        
    }

}
