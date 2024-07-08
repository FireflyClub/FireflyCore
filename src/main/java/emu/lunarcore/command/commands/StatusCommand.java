package emu.lunarcore.command.commands;

import emu.lunarcore.LunarCore;
import emu.lunarcore.command.Command;
import emu.lunarcore.command.CommandArgs;
import emu.lunarcore.command.CommandHandler;
import emu.lunarcore.server.game.GameServer;

@Command(label = "status", aliases = {"st"}, permission = {"admin"}, desc = "/status. Displays the status of the server.")
public class StatusCommand implements CommandHandler {

    @Override
    public void execute(CommandArgs args) {
        // Run garbage collector
        if (!args.hasFlag("-nogc")) {
            System.gc();
        }

        int count = 0;
        GameServer server = LunarCore.getGameServer();
        if (server!= null) {
            count = server.getPlayerCount();
        }
        
        // Show status
        String gitHash = "Git hash: " + LunarCore.getGitHash();
        String memory = "Memory usage: " + LunarCore.getMemoryUsage() + " MB";
        String playerCount = "Players online: " + count;
        String messages = gitHash + "\n" + memory + "\n" + playerCount;

        args.sendMessage(gitHash, false);
        args.sendMessage(memory, false);
        args.sendMessage(playerCount, false);
        args.sendRemoteMessage(messages);

    }
}
