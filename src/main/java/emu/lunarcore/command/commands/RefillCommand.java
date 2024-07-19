package emu.lunarcore.command.commands;

import emu.lunarcore.GameConstants;
import emu.lunarcore.command.Command;
import emu.lunarcore.command.CommandArgs;
import emu.lunarcore.command.CommandHandler;

@Command(label = "refill", aliases = {"rf"}, permission = {"support"}, requireTargetOnline = true, desc = "/refill - refill your skill points in open world.")
public class RefillCommand implements CommandHandler {

    @Override
    public void execute(CommandArgs args) {
        args.getOnlineTarget().getCurrentLineup().addMp(GameConstants.MAX_MP);
        args.sendMessage("Successfully refilled skill points for " + args.getOnlineTarget().getName());
    }

}
