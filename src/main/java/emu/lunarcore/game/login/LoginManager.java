package emu.lunarcore.game.login;

import emu.lunarcore.config.ConfigManager;
import emu.lunarcore.game.player.Player;
import emu.lunarcore.server.game.GameSession;
import emu.lunarcore.server.packet.send.PacketPlayerKickOutScNotify;
import emu.lunarcore.server.packet.send.PacketServerAnnounceNotify;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public class LoginManager {
    private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
    private final AtomicReference<ScheduledFuture<?>> future = new AtomicReference<>();

    public void startLogin(GameSession session) {
        if (ConfigManager.getConfig().getAccountOptions().adminLoginSkip &&
            session.getAccount().hasPermission("admin")) {
            return;
        }

        session.getPlayer().sendPacket(new PacketServerAnnounceNotify(
            "Server enabled account protection, please login in 60s!", "red"));
        session.getPlayer().sendMessage("Enter '/help' to see login commands!");

        ScheduledFuture<?> newFuture = scheduler.schedule(() -> {
            session.getPlayer().sendPacket(new PacketPlayerKickOutScNotify(3));
        }, 60, TimeUnit.SECONDS);

        future.set(newFuture);
    }

    public static String getLoginPwdByAccount(String account) {
        return ConfigManager.loginData.getLoginPwdByAccount(account);
    }
    
    public void loginSuccess(Player player) {
        ScheduledFuture<?> currentFuture = future.get();
        if (currentFuture != null) {
            currentFuture.cancel(true);
        }
        player.getAccount().addPermission("login");
        player.getAccount().removePermission("player");
    }

    public static void handleLogin(GameSession session) {
        LoginManager loginManager = new LoginManager();
        loginManager.startLogin(session);
    }
}