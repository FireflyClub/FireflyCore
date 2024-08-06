package emu.lunarcore.command.commands;

import emu.lunarcore.command.Command;
import emu.lunarcore.command.CommandArgs;
import emu.lunarcore.command.CommandHandler;
import emu.lunarcore.game.login.LoginManager;
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

        // Check password
        String sendUser = args.get(0);
        String sendPwd = args.get(1);
        GameSession session = args.getSender().getSession();
        LoginManager loginManager = session.getLoginManager();
        loginManager.loginVerify(session.getPlayer(), sendUser, sendPwd);
        
    }

}
