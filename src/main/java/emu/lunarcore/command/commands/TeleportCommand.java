package emu.lunarcore.command.commands;

import emu.lunarcore.command.Command;
import emu.lunarcore.command.CommandArgs;
import emu.lunarcore.command.CommandHandler;
import emu.lunarcore.game.player.Player;
import emu.lunarcore.util.Position;

@Command(label = "teleport", aliases = {"tp"}, permission = {"support"}, requireTargetOnline = true, desc = "/tp. Move yourself to a specific position.")
public class TeleportCommand implements CommandHandler {

    @Override
    public void execute(CommandArgs args) {
        Player player = args.getSender();
        if (args.getList().size() == 3) {
            try {
                int X = Integer.parseInt(args.get(0));
                int Y = Integer.parseInt(args.get(1));
                int Z = Integer.parseInt(args.get(2));
                Position pos = new Position();
                pos.set(X, Y, Z);

                player.loadScene(player.getPlaneId(), player.getFloorId(), player.getEntryId(), pos, player.getRot(), true);
                args.sendMessage(String.format("Successfully teleported to - X: %s, Y: %s, Z: %s", args.get(0), args.get(1), args.get(2)));

            } catch (Exception e) {
                args.sendMessage("Wrong position info.");

            }
        } else {
            args.sendMessage("Wrong position command format.");

        }
    }

}
