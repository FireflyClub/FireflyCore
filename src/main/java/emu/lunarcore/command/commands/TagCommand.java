package emu.lunarcore.command.commands;

import emu.lunarcore.command.Command;
import emu.lunarcore.command.CommandArgs;
import emu.lunarcore.command.CommandHandler;
import emu.lunarcore.config.ConfigManager;

@Command(label = "tag", permission = {"admin"}, requireTargetOnline = true, desc = "/tag {add | remove} [name]. Add or remove a tag to a player.")
public class TagCommand implements CommandHandler {

    @Override
    public void execute(CommandArgs args) {
        String type = args.get(0).toLowerCase();
        int uid = args.getTargetUid();
    
        if ("add".equals(type)) {
            String tag = args.get(1);

            ConfigManager.getTagData().add(uid, tag);

            args.sendMessage("Tag added.");

        } else if ("remove".equals(type)) {
            ConfigManager.getTagData().remove(uid);

            args.sendMessage("Tag removed.");
        } else {
            args.sendMessage("Invalid type.");
            return;
        }
    }
}
