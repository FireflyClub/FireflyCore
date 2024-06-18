package emu.lunarcore.command.commands;

import emu.lunarcore.util.Utils;
import emu.lunarcore.command.Command;
import emu.lunarcore.command.CommandArgs;
import emu.lunarcore.command.CommandHandler;

@Command(label = "traillevel", aliases = {"tlevel"}, permission = {"player"}, requireTargetOnline = true, desc = "/traillevel [level] - Sets the targeted player's trailblazer level.")
public class TrailLevelCommand implements CommandHandler {

    @Override
    public void execute(CommandArgs args) {
        int targetLevel = Utils.parseSafeInt(args.get(0));
        
        args.getOnlineTarget().setLevel(targetLevel);
        args.sendMessage("Set trailblazer level to " + args.getOnlineTarget().getLevel());
    }

}
