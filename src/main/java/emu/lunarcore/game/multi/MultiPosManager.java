package emu.lunarcore.game.multi;

import java.util.concurrent.ScheduledExecutorService;

import emu.lunarcore.server.game.GameSession;
import emu.lunarcore.util.Position;

public class MultiPosManager {
    public ScheduledExecutorService scheduler;

    public MultiPosManager(ScheduledExecutorService scheduler) {
        this.scheduler = scheduler;
    }

    public class PositionUpdater implements Runnable {
        public ScheduledExecutorService scheduler;
        private GameSession session;
        private Position multiStartPos;
        private Position multiEndPos;
        private int multiFps;
        private int i = 1;

        public PositionUpdater(GameSession session, Position multiStartPos, Position multiEndPos, int multiFps) {
            // Must use deep copy (idk where changed multiStartPos => multiEndPos)
            this.multiStartPos = new Position(multiStartPos.getX(), multiStartPos.getY(), multiStartPos.getZ());
            this.multiEndPos = new Position(multiEndPos.getX(), multiEndPos.getY(), multiEndPos.getZ());
            this.session = session;
            this.multiFps = multiFps;
        }

        @Override
        public void run() {
            if (i <= multiFps) {
                int x = multiStartPos.getX() + (multiEndPos.getX() - multiStartPos.getX()) * i / multiFps;
                int y = multiStartPos.getY() + (multiEndPos.getY() - multiStartPos.getY()) * i / multiFps;
                int z = multiStartPos.getZ() + (multiEndPos.getZ() - multiStartPos.getZ()) * i / multiFps;
                Position flameTargetPos = new Position(x, y, z);
                i++;

                MultiSpawnManager multiEntitySpawn = new MultiSpawnManager();
                multiEntitySpawn.multiEntitySpawn(session, flameTargetPos);
            } else {
                // Clean to avoid timeout
                scheduler.shutdownNow();

            }
        }
    }
}
