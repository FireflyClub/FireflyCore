package emu.lunarcore.command.commands;

import emu.lunarcore.command.Command;
import emu.lunarcore.game.player.lineup.PlayerLineup;
import emu.lunarcore.command.CommandArgs;
import emu.lunarcore.command.CommandHandler;

@Command(label = "energy", permission = {"player"}, requireTargetOnline = true, desc = "/energy. Refills all characters energy in current lineup.")
public class EnergyCommand implements CommandHandler {

    @Override
    public void execute(CommandArgs args) {
        PlayerLineup lineup = args.getOnlineTarget().getCurrentLineup();
        lineup.forEachAvatar(avatar -> {
            avatar.setCurrentSp(lineup, 10000);
            avatar.save();
        });
        lineup.refreshLineup();
        
        args.sendMessage("Refilled SP for " + args.getOnlineTarget().getName());
    }

}
