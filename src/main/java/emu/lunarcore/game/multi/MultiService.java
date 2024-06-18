package emu.lunarcore.game.multi;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import emu.lunarcore.game.player.Player;
import emu.lunarcore.server.game.GameSession;
import emu.lunarcore.util.Position;

public class MultiService {
    public void handleMultiCheck (GameSession session, Player multiPlayer) {
        Position multiCurrentPos = multiPlayer.getPos();
        Position multiStartPos = multiPlayer.getScene().getMultiStartPos();
        Position multiEndPos = multiPlayer.getScene().getMultiEndPos();
        int multiFps = session.getPlayer().getScene().getMultiFps();
        int period = Math.round(500.0f / multiFps);

        if (multiStartPos == null) {
            multiStartPos = new Position();
            multiStartPos.set(multiCurrentPos);
            multiPlayer.getScene().setMultiStartPos(multiStartPos);
            return;
        }

        multiEndPos = new Position();
        multiEndPos.set(multiCurrentPos);
        multiPlayer.getScene().setMultiEndPos(multiEndPos);

        MultiPosManager posManager = new MultiPosManager(Executors.newScheduledThreadPool(1));
        MultiPosManager.PositionUpdater positionUpdater = posManager.new PositionUpdater(session, multiStartPos, multiEndPos, multiFps);
        posManager.scheduler.scheduleAtFixedRate(positionUpdater, 0, period, TimeUnit.MILLISECONDS);

        multiStartPos.set(multiEndPos);
        multiPlayer.getScene().setMultiStartPos(multiStartPos);

    }
}
