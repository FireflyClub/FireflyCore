package emu.lunarcore.command.commands;

import emu.lunarcore.command.Command;
import emu.lunarcore.command.CommandArgs;
import emu.lunarcore.command.CommandHandler;
import emu.lunarcore.game.account.BanManager;
import emu.lunarcore.game.player.Player;
import emu.lunarcore.server.packet.send.PacketPlayerKickOutScNotify;

@Command(label = "ban", permission = {"admin"}, requireTarget = true, desc = "/ban [player]. Bans a player from the server.")
public class BanCommand implements CommandHandler {

    @Override
    public void execute(CommandArgs args) {
        Player target = args.getTarget();
        if (target == null) {
            args.sendMessage("Player not found.");
            return;
        }

        int targetUid = args.getTargetUid();

        if (BanManager.checkBanPerm(target)) {
            args.sendMessage("You cannot ban an admin.");
            return;
        }

        if (BanManager.ban(targetUid)) {
            if (args.getOnlineTarget() != null) {
                args.getOnlineTarget().sendPacket(new PacketPlayerKickOutScNotify(4));
            }

            args.sendMessage("Successfully Banned: " + targetUid);

        } else {
            args.sendMessage("Failed to Ban: " + targetUid);

        }
    }

}
