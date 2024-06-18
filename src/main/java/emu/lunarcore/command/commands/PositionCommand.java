package emu.lunarcore.command.commands;

import emu.lunarcore.command.Command;
import emu.lunarcore.command.CommandArgs;
import emu.lunarcore.command.CommandHandler;

@Command(label = "position", aliases = {"pos"}, permission = {"player"}, requireTargetOnline = true, desc = "/pos. Get your current position.")
public class PositionCommand implements CommandHandler {

    @Override
    public void execute(CommandArgs args) {
        int PosX = args.getOnlineTarget().getPos().getX();
        int PosY = args.getOnlineTarget().getPos().getY();
        int PosZ = args.getOnlineTarget().getPos().getZ();
        args.sendMessage("Your Position - X: " + PosX + ", Y: " + PosY + ", Z: " + PosZ);

    }

}
