package emu.lunarcore.command.commands;

import emu.lunarcore.command.Command;
import emu.lunarcore.command.CommandArgs;
import emu.lunarcore.command.CommandHandler;
import emu.lunarcore.config.ConfigManager;
import emu.lunarcore.data.ResourceLoader;
import emu.lunarcore.game.player.Player;

@Command(label = "reload", permission = {"admin"}, desc = "/reload { config | res}. Reloads the server config.")
public class ReloadCommand implements CommandHandler {

    @Override
    public void execute(CommandArgs args) {
        Player player = args.getSender();
        String type = args.get(0).toLowerCase();

        if ("all".equals(type)) {
            ConfigManager.loadConfig();
            ConfigManager.loadHotfixData();
            ResourceLoader.reloadAll();

        } else if ("config".equals(type)) {
            ConfigManager.loadConfig();
            ConfigManager.loadHotfixData();

        } else if ("res".equals(type)) {
            ResourceLoader.reloadAll();

        } else {
            args.sendMessage("Invalid reload type.");
            return;

        }

        args.sendMessage("Reloaded the " + type + " data.");
        if (args.getOnlineTarget() != null) {
            args.getOnlineTarget().loadScene(player.getPlaneId(), player.getFloorId(), player.getEntryId(), player.getPos(), player.getRot(), true);

        }

    }

}
