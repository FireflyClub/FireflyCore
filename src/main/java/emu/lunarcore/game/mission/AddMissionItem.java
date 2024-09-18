package emu.lunarcore.game.mission;
import java.util.List;

import emu.lunarcore.game.player.Player;

public class AddMissionItem {
    public void addMissionItem(List<Integer> params, List<String> paramString, Player player) {
        if (params.size() < 2) return;
        for (int i = 0; i < params.size(); i += 2) {
            int itemId = params.get(i);
            int count = params.get(i + 1);
            player.getInventory().addItem(itemId, count);
        }
    }
}
