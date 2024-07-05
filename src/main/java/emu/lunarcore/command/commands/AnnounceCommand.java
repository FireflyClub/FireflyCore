package emu.lunarcore.command.commands;

import java.util.List;

import emu.lunarcore.LunarCore;
import emu.lunarcore.command.Command;
import emu.lunarcore.command.CommandArgs;
import emu.lunarcore.command.CommandHandler;
import emu.lunarcore.game.player.Player;
import emu.lunarcore.server.packet.send.PacketServerAnnounceNotify;

@Command(label = "announce", aliases = {"anno"}, permission = {"admin"}, desc = "/anno [text]. Sends a message to all players on the server.")
public class AnnounceCommand implements CommandHandler {

    @Override
    public void execute(CommandArgs args) {
        String centerText = args.get(0);

        // Send to all players, except the sender
        List<Integer> allUids = LunarCore.getGameServer().getAllPlayerUIDs();
        for (Integer eachUid : allUids) {
            Player player = LunarCore.getGameServer().getOnlinePlayerByUid(eachUid);
            player.sendPacket(new PacketServerAnnounceNotify(centerText));

        };

        args.sendMessage("Announce sent to all players.");
    }

}
