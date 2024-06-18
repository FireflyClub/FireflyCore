package emu.lunarcore.command.commands;

import emu.lunarcore.command.Command;
import emu.lunarcore.command.CommandArgs;
import emu.lunarcore.command.CommandHandler;
import emu.lunarcore.game.account.BanManager;

@Command(label = "unban", permission = {"admin"}, requireTarget = true, desc = "/unban [player]. Unbans a player from the server.")
public class UnbanCommand implements CommandHandler {

    @Override
    public void execute(CommandArgs args) {
        int targetUid = args.getTargetUid();

        if (BanManager.unban(targetUid) == true) {
            args.sendMessage("Successfully Unbanned: " + targetUid);

        } else {
            args.sendMessage("Failed to Unban: " + targetUid);

        }
    }

}
