package emu.lunarcore.game.mission;

import java.util.List;

import emu.lunarcore.data.GameData;
import emu.lunarcore.data.excel.AvatarExcel;
import emu.lunarcore.data.excel.SpecialAvatarExcel;
import emu.lunarcore.game.avatar.GameAvatar;
import emu.lunarcore.game.player.Player;

public class ChangeMissionLineup {
    public void changeMissionLineup(List<Integer> params, List<String> paramString, Player player) {
        player.getLineupManager().getCurrentLineup().getAvatars().clear();
        int count = 0;
        int avatarCount = (int) params.stream().filter(value -> value != 0).count() - 1;

        for (int avatarId : params) {
            if (count++ >= 4) break;

            SpecialAvatarExcel specialAvatar = GameData.getSpecialAvatarExcelMap().get(avatarId * 10 + player.getWorldLevel());
            if (specialAvatar == null) {
                AvatarExcel avatar = GameData.getAvatarExcelMap().get(avatarId);
                if (avatar == null) continue;

                GameAvatar ava = player.getAvatarById(avatarId);
                if (ava == null) {
                    player.addAvatar(ava);
                }
                player.getLineupManager().(avatarId, count == avatarCount);
            } else {
                player.getLineupManager().(avatarId * 10 + player.getWorldLevel(), count == avatarCount);
            }
        }

        SpecialAvatarExcel leaderAvatar = GameData.getSpecialAvatarExcelMap().get(params.get(4) * 10 + player.getWorldLevel());
        if (leaderAvatar == null) {
            player.getLineupManager().getCurrentLineup().setLeader(params.get(4));
        } else {
            player.getLineupManager().getCurrentLineup().setLeader(leaderAvatar.getAvatarID());
        }

        player.getLineupManager().getCurrentLineup().refreshLineup();
    }
}