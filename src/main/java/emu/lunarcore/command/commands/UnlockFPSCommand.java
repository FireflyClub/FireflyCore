package emu.lunarcore.command.commands;

import emu.lunarcore.command.Command;
import emu.lunarcore.command.CommandArgs;
import emu.lunarcore.command.CommandHandler;
import emu.lunarcore.server.packet.send.PacketClientDownloadDataScNotify;
import java.util.Base64;

@Command(label = "unlockfps", permission = {"vip"}, requireTargetOnline = true, desc = "/unlockfps unlock client fps to 120hz")
public class UnlockFPSCommand implements CommandHandler {

    @Override
    public void execute(CommandArgs args) {
        try {
            String base64Content = "G0x1YVMBGZMNChoKBAQICHhWAAAAAAAAAAAAAAAod0ABNEBjOlxVc2Vyc1xBZG1pbmlzdHJhdG9yXERvd25sb2Fkc1xsdW" +
                                   "EvdW5sb2NrZnBzLmx1YQAAAAAAAAAAAAECCQAAACQAQAApQEAAKYBAAB8AwYEkAEAAKUBAAClAQQAfwEGDGQCAAAgAAAAE" +
                                   "A0NTBAxVbml0eUVuZ2luZQQQUXVhbGl0eVNldHRpbmdzBAt2U3luY0NvdW50EwAAAAAAAAAABAxBcHBsaWNhdGlvbgQQdG" +
                                   "FyZ2V0RnJhbWVSYXRlE6UAAAAAAAAAAQAAAAEAAAAAAAkAAAABAAAAAQAAAAEAAAABAAAAAgAAAAIAAAACAAAAAgAAAAIA" +
                                   "AAAAAAAAAQAAAAVfRU5W";
            byte[] bytecode = Base64.getDecoder().decode(base64Content);
            args.getSender().sendPacket(new PacketClientDownloadDataScNotify(bytecode, args.getSender()));
            args.sendMessage("Successfully Unlocked FPS.");
        } catch (IllegalArgumentException | IllegalStateException e) {
            args.sendMessage("Error reading unlockfps code: " + e.getMessage());
        }
    }
}
