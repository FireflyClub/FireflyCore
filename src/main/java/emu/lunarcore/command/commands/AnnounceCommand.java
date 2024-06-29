package emu.lunarcore.command.commands;

import java.util.List;

import emu.lunarcore.command.Command;
import emu.lunarcore.command.CommandArgs;
import emu.lunarcore.command.CommandHandler;
import emu.lunarcore.game.player.Player;
import emu.lunarcore.server.packet.send.PacketServerAnnounceNotify;

@Command(label = "announce", aliases = {"anno"}, permission = {"admin"}, desc = "/ban [player]. Bans a player from the server.")
public class AnnounceCommand implements CommandHandler {

    @Override
    public void execute(CommandArgs args) {
        Player sender = args.getSender();
        String centerText = args.get(0);

        // Send to all players, except the sender
        List<Integer> allUids = sender.getServer().getAllPlayerUIDs();
        for (Integer eachUid : allUids) {
            // Check if UID is not the sender's UID
            if (sender != null && eachUid == sender.getUid()) {
                continue;
            }

            Player player = sender.getServer().getOnlinePlayerByUid(eachUid);
            player.sendPacket(new PacketServerAnnounceNotify(centerText));

        };
    }

}
