package emu.lunarcore.command.commands;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import emu.lunarcore.command.Command;
import emu.lunarcore.command.CommandArgs;
import emu.lunarcore.command.CommandHandler;
import emu.lunarcore.game.avatar.GameAvatar;
import emu.lunarcore.server.packet.send.PacketPlayerSyncScNotify;
import emu.lunarcore.util.Utils;

@Command(label = "avatar", requireTargetOnline = true, permission = {"player"}, desc = "/avatar {cur | all | lineup} lv(level) p(ascension) e(eidolon) s(skill levels). Sets the current avatar's properties")
public class AvatarCommand implements CommandHandler {

    @Override
    public void execute(CommandArgs args) {
        // Temp avatar list
        List<GameAvatar> changeList = new ArrayList<>();
        
        // Handle optional arguments
        String arg = args.get(0).toLowerCase();
        
        if (arg.isBlank()) {
            // Select current avatar if we dont specify any extra args
            changeList.add(args.getOnlineTarget().getCurrentLeaderAvatar());
        } else {
            // Handle
            switch (arg) {
                case "all":
                    args.getOnlineTarget().getAvatars().forEach(changeList::add);
                    break;
                case "lineup":
                    args.getOnlineTarget().getCurrentLineup().forEachAvatar(changeList::add);
                    break;
                case "cur":
                    changeList.add(args.getOnlineTarget().getCurrentLeaderAvatar());
                    break;
                default:
                    int avatarId = Utils.parseSafeInt(arg);
                    var avatar = args.getOnlineTarget().getAvatarById(avatarId);
                    if (avatar != null) {
                        changeList.add(avatar);
                    }
                    break;
            }
        }
        
        // Try to set properties of avatars
        Iterator<GameAvatar> it = changeList.iterator();
        while (it.hasNext()) {
            GameAvatar avatar = it.next();
            
            if (args.setProperties(avatar)) {
                // Save avatar
                avatar.save();
            } else {
                // Remove from list if nothing was changed
                it.remove();
            }
        }
        
        
        if (changeList.size() > 0) {
            // Send packet
            args.getOnlineTarget().sendPacket(new PacketPlayerSyncScNotify(changeList.toArray(GameAvatar[]::new)));
            // Send message
            args.sendMessage("Set avatar(s) properties successfully");
        } else {
            args.sendMessage("No avatar properties to change");
        }
    }

}
