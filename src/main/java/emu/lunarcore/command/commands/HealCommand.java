package emu.lunarcore.command.commands;

import emu.lunarcore.command.Command;
import emu.lunarcore.command.CommandArgs;
import emu.lunarcore.command.CommandHandler;
import emu.lunarcore.game.player.lineup.PlayerLineup;

@Command(label = "heal", permission = {"support"}, requireTargetOnline = true, desc = "/heal. Heals your avatars.")
public class HealCommand implements CommandHandler {

    @Override
    public void execute(CommandArgs args) {
        PlayerLineup lineup = args.getOnlineTarget().getCurrentLineup();
        lineup.forEachAvatar(avatar -> {
            avatar.setCurrentHp(lineup, 10000);
            avatar.save();
        });
        lineup.refreshLineup();

        args.sendMessage("Healed all avatars for " + args.getOnlineTarget().getName());
    }

}
