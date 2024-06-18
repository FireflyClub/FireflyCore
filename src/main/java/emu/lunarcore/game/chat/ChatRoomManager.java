package emu.lunarcore.game.chat;

import java.util.List;

import emu.lunarcore.LunarCore;
import emu.lunarcore.game.player.Player;

public class ChatRoomManager {

    // Method to handle chatroom message
    public static void handleChatRoomMsg(Player player, int targetUid, String msg) {

        int senderUid = player.getUid();
        String nickname = player.getNickname();
        String tag = LunarCore.getTagByUid(senderUid);

        String modifiedMsg = "[" + tag + "] " + nickname + " (" + senderUid + "): " + msg;
        ChatMessage localMsg = new ChatMessage(senderUid, targetUid, msg);
        ChatMessage annoMsg = new ChatMessage(targetUid, senderUid, modifiedMsg);

        // Display message for sender
        player.getChatManager().addChatMessage(localMsg);
        
        // Send to all players, except the sender
        List<Integer> allUids = player.getServer().getAllPlayerUIDs();
        allUids.forEach(eachUid -> {
            // Check if UID is not the sender's UID
            if (eachUid != senderUid) {
                Player target = player.getServer().getOnlinePlayerByUid(eachUid);
                target.getChatManager().addChatMessage(annoMsg);

            }

        });

    }

    // Method to handle chatroom emote
    public static void handleChatRoomEmote(Player player, int targetUid, int emote) {

        int senderUid = player.getUid();
        String nickname = player.getNickname();
        String tag = LunarCore.getTagByUid(senderUid);

        String modifiedMsg = "[" + tag + "] " + nickname + "(" + senderUid + "):";
        ChatMessage localMsg = new ChatMessage(senderUid, targetUid, emote);

        // both send sender info and emote
        ChatMessage annoMsg = new ChatMessage(targetUid, senderUid, modifiedMsg);
        ChatMessage annoEmote = new ChatMessage(targetUid, senderUid, emote);

        // Display message for sender
        player.getChatManager().addChatMessage(localMsg);

        // Send to all players, except the sender
        List<Integer> allUids = player.getServer().getAllPlayerUIDs();
        allUids.forEach(eachUid -> {
            // Check if UID is not the sender's UID
            if (eachUid != senderUid) {
                Player target = player.getServer().getOnlinePlayerByUid(eachUid);
                target.getChatManager().addChatMessage(annoMsg);
                target.getChatManager().addChatMessage(annoEmote);

            }

        });

    }

}