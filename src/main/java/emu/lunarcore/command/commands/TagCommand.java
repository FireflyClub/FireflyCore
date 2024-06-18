package emu.lunarcore.command.commands;

import emu.lunarcore.LunarCore;
import emu.lunarcore.command.Command;
import emu.lunarcore.command.CommandArgs;
import emu.lunarcore.command.CommandHandler;

@Command(label = "tag", permission = {"admin"}, requireTarget = true, desc = "/tag {add | remove} [name]. Add or remove a tag to a player.")
public class TagCommand implements CommandHandler {

    @Override
    public void execute(CommandArgs args) {
        String type = args.get(0).toLowerCase();
        int uid = args.getTargetUid();
    
        if ("add".equals(type)) {
            String tag = args.get(1);

            LunarCore.getTagData().addTag(uid, tag);

            args.sendMessage("Tag added.");

        } else if ("remove".equals(type)) {
            LunarCore.getTagData().removeTag(uid);

            args.sendMessage("Tag removed.");
        } else {
            args.sendMessage("Invalid type.");
            return;
        }
    }
}
