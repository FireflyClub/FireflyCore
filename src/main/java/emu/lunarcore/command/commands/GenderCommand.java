package emu.lunarcore.command.commands;

import emu.lunarcore.GameConstants;
import emu.lunarcore.command.Command;
import emu.lunarcore.command.CommandArgs;
import emu.lunarcore.command.CommandHandler;
import emu.lunarcore.game.player.Player;
import emu.lunarcore.game.player.PlayerGender;
import emu.lunarcore.proto.MultiPathAvatarTypeOuterClass.MultiPathAvatarType;

@Command(label = "gender", permission = {"player"}, requireTarget = true, desc = "/gender {male | female}. Sets the player gender.")
public class GenderCommand implements CommandHandler {

    @Override
    public void execute(CommandArgs args) {
        Player target = args.getTarget();
        PlayerGender currentGender = args.getTarget().getGender();
        int currentAvatarId = args.getTarget().getCurrentMultiPathAvatarType().get(GameConstants.TRAILBLAZER_AVATAR_ID);
        String gender = args.get(0).toLowerCase();
        boolean isChanged = false;
        
        switch (gender) {
            case "m", "male", "boy", "man" -> {
                if (currentGender == PlayerGender.GENDER_WOMAN) {
                    currentAvatarId -= 1;
                    isChanged = true;
                    currentGender = PlayerGender.GENDER_MAN;
                }
            }
            case "f", "female", "girl", "woman" -> {
                if (currentGender == PlayerGender.GENDER_MAN) {
                    currentAvatarId += 1;
                    isChanged = true;
                    currentGender = PlayerGender.GENDER_WOMAN;
                }
            }
        }

        // Change gender
        if (isChanged) {
            target.setGender(currentGender);
            target.setMultiAvatarType(MultiPathAvatarType.forNumber(currentAvatarId));
            args.sendMessage("Gender for " + target.getName() + " set successfully");
        }
    }

}
