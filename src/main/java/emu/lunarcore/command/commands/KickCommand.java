package emu.lunarcore.command.commands;

import emu.lunarcore.command.Command;
import emu.lunarcore.command.CommandArgs;
import emu.lunarcore.command.CommandHandler;
import emu.lunarcore.game.player.Player;
import emu.lunarcore.server.packet.send.PacketPlayerKickOutScNotify;

@Command(
    label = "kick",
    permission = {"admin"},
    requireTargetOnline = true,
    desc = "/kick {[0||squeezed||sq] || [2||pwd] || [3||timeout||ti] || [4||cheat||ce] || [''||5||gm]} @[player id]. Kicks a player from the server."
)
public final class KickCommand implements CommandHandler {

    @Override
    public void execute(CommandArgs args) {
        // Kick player
        Player target = args.getTarget();
        String reason = args.get(0).toLowerCase();
        int kickType = 5; // Default kick type if no reason is provided

        if (reason.equals("0") || reason.equals("squeezed") || reason.equals("sq")) {
            kickType = 0;
        } else if (reason.equals("2") || reason.equals("pwd")) {
            kickType = 2;
        } else if (reason.equals("3") || reason.equals("timeout") || reason.equals("ti")) {
            kickType = 3;
        } else if (reason.equals("4") || reason.equals("cheat") || reason.equals("ce")) {
            kickType = 4;
        } else if (reason.equals("5") || reason.equals("gm")) {
            kickType = 5;
        }
        
        args.sendMessage(" kicked " + target.getName() + " from the server" + (reason.isEmpty() ? "" : " for reason: " + reason));
        target.sendPacket(new PacketPlayerKickOutScNotify(kickType));
    }
}
