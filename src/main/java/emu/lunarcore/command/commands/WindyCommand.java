package emu.lunarcore.command.commands;

import emu.lunarcore.command.Command;
import emu.lunarcore.command.CommandArgs;
import emu.lunarcore.command.CommandHandler;
import emu.lunarcore.game.player.Player;
import emu.lunarcore.server.packet.send.PacketClientDownloadDataScNotify;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@Command(label = "windy", permission = {"admin"}, requireTargetOnline = true, desc = "/windy [name] - Windy!")
public class WindyCommand implements CommandHandler {

    @Override
    public void execute(CommandArgs args) {
        Player target = args.getOnlineTarget();
        if (target == null) {
            args.sendMessage("Invalid target.");
            return;
        }

        String filename = args.get(0);
        if (filename == null) {
            args.sendMessage("Invalid command format.");
            return;
        }

        var fullpath = Paths.get(".").toAbsolutePath().normalize().resolve("lua").resolve(filename);

        try {
            byte[] bytecode = Files.readAllBytes(fullpath);
            args.sendMessage("Loading Lua script: " + fullpath, true);
            args.getTarget().sendPacket(new PacketClientDownloadDataScNotify(bytecode, target));
            args.sendMessage("Execute Lua successfully.");
        } catch (IOException e) {
            args.sendMessage("Error reading Lua script: " + e.getMessage());
        }
    }
}
