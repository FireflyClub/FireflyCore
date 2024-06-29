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
    desc = "/kick @[player id]. Kicks a player from the server."
)
public final class KickCommand implements CommandHandler {

    @Override
    public void execute(CommandArgs args) {
        // Kick player
        Player target = args.getTarget();
        target.sendPacket(new PacketPlayerKickOutScNotify());

        // Send message
        args.sendMessage("Player kicked successfully");
    }
}
