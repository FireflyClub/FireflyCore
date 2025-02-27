package emu.lunarcore.command;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import org.reflections.Reflections;

import emu.lunarcore.LunarCore;
import emu.lunarcore.config.ConfigManager;
import emu.lunarcore.game.player.Player;
import io.javalin.http.Context;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import lombok.Getter;

@Getter
public class CommandManager {
    private Object2ObjectMap<String, CommandHandler> labels;
    private Object2ObjectMap<String, CommandHandler> commands;
    
    public CommandManager() {
        this.labels = new Object2ObjectOpenHashMap<>();
        this.commands = new Object2ObjectOpenHashMap<>();
        
        // Scan for commands
        var commandClasses = new Reflections(CommandManager.class.getPackageName()).getTypesAnnotatedWith(Command.class);
        
        for (var cls : commandClasses) {
            if (!CommandHandler.class.isAssignableFrom(cls)) {
                continue;
            }
            
            try {
                CommandHandler handler = (CommandHandler) cls.getDeclaredConstructor().newInstance();
                this.registerCommand(handler);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    /**
     * Adds a command that players and server console users can use. Command handlers must have the proper command annotation attached to them.
     */
    public CommandManager registerCommand(CommandHandler handler) {
        Command command = handler.getClass().getAnnotation(Command.class);
        if (command == null) return this;
        
        this.getLabels().put(command.label(), handler);
        this.getCommands().put(command.label(), handler);
        
        for (String alias : command.aliases()) {
            this.getCommands().put(alias, handler);
        }
        
        return this;
    }
    
    /**
     * Removes a command from use.
     * @param label The command name
     * @return
     */
    public CommandManager unregisterCommand(String label) {
        CommandHandler handler = this.getLabels().get(label);
        if (handler == null) return this;
        
        Command command = handler.getClass().getAnnotation(Command.class);
        if (command == null) {
            return this;
        }
        
        this.getLabels().remove(command.label());
        this.getCommands().remove(command.label());
        
        for (String alias : command.aliases()) {
            this.getCommands().remove(alias);
        }
        
        return this;
    }
    
    /**
     * Checks if the sender has permission to use this command. Will always return true if the sender is the server console.
     * @param sender The sender of the command.
     * @param command
     * @return true if the sender has permission to use this command
     */
    public boolean checkPermission(Player sender, Command command) {
        if (sender == null || command.permission().length == 0) {
            return true;
        }
        
        for (String perm : command.permission()) {
            if (sender.getAccount().hasPermission(perm)) {
                return true; // player have one of the permission
            }
        }

        // Make sure admin has all perms
        return sender.getAccount().hasPermission("admin");
    }

    /**
     * Checks if the sender has permission to use this command on other players. Will always return true if the sender is the server console.
     * @param sender The sender of the command.
     * @param command
     * @return true if the sender has permission to use this command
     */
    private boolean checkTargetPermission(Player sender, Command command) {
        if (sender == null) {
            return true;
        }
        
        // Make sure admin has all perms
        return sender.getAccount().hasPermission("admin");
    }

    public void invoke(Player sender, String message, @Nullable Context ctx) {
        // Parse message into arguments
        List<String> args = Arrays.stream(message.split(" ")).collect(Collectors.toCollection(ArrayList::new));
        
        // Get command label
        String label = args.remove(0).toLowerCase();
        
        // Filter out command prefixes
        if (label.startsWith("/")) {
            label = label.substring(1);
        }
        
        // Get command handler
        CommandHandler handler = this.commands.get(label);

        // Execute command
        if (handler != null) {
            // Get command annotation data
            Command command = handler.getData();
            
            // Check if sender has permission to run the command.
            if (sender != null && !this.checkPermission(sender, command)) {
                // We have a double null check here just in case
                sender.sendMessage("You do not have permission to use this command.");
                return;
            }
            
            // Build command arguments
            CommandArgs cmdArgs = new CommandArgs(sender, args, ctx);

            // Check targeted permission
            if (sender != cmdArgs.getTarget() && !this.checkTargetPermission(sender, command)) {
                cmdArgs.sendMessage("You do not have permission to use this command on another player.");
                return;
            }
            
            // Make sure our command has a target
            if (command.requireTargetOnline() && cmdArgs.getOnlineTarget() == null) {
                cmdArgs.sendMessage("Error: Targeted player not found or offline.");
                return;
            }
            if (command.requireTarget() && cmdArgs.getTarget() == null) {
                cmdArgs.sendMessage("Error: Targeted player not found.");
                return;
            }
            
            // Log
            if (sender != null && ConfigManager.getConfig().getLogOptions().commands) {
                LunarCore.getLogger().info("\u001B[38;2;0;255;234m[UID: " + sender.getUid() + "] " + sender.getName() + " used command: " + message + "\u001B[0m");
            }
            
            // Run command
            handler.execute(cmdArgs);
        } else {
            if (sender != null) {
                sender.sendMessage("Invalid Command!");
            } else {
                LunarCore.getLogger().info("Invalid Command!");
            }
        }
    }
}
