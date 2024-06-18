package emu.lunarcore.command.commands;

import emu.lunarcore.command.Command;
import emu.lunarcore.command.CommandArgs;
import emu.lunarcore.command.CommandHandler;
import emu.lunarcore.game.player.Player;

@Command(
    label = "multi",
    aliases = {"mu"},
    permission = {"admin"},
    requireTargetOnline = true,
    desc = "/multi { join | quit | fps [Multi Display FPS] } @[player id]. Join a multi play."
)
public final class MultiCommand implements CommandHandler {

    @Override
    public void execute(CommandArgs args) {
        String type = args.get(0).toLowerCase();
        Player sender = args.getSender();
        Player target = args.getOnlineTarget();

        if ("join".equals(type)) {
            if (sender.getUid() == target.getUid()) {
                sender.sendMessage("You cannot join your own multi play.");
                return;
            }

            sender.getScene().setMultiPlayerId(target.getUid());
            target.getScene().setMultiPlayerId(sender.getUid());

            sender.sendMessage("You have joined the multi play.");
            target.sendMessage(sender.getName() + " has joined the multi play.");

        } else if ("quit".equals(type) || "exit".equals(type)) {
            sender.getScene().setMultiPlayerId(0);
            target.getScene().setMultiPlayerId(0);

            sender.sendMessage("You have left the multi play.");
            target.sendMessage(sender.getName() + " has left the multi play.");

        } else if ("fps".equals(type)) {
            int fps = Integer.parseInt(args.get(1));
            int multiFps = Math.round(fps / 2);
            sender.getScene().setMultiFps(multiFps);

            sender.sendMessage("Multi display FPS set to: " + fps);

        } else {
            args.sendMessage("Invalid type.");
            return;
        }
    }
    
}
