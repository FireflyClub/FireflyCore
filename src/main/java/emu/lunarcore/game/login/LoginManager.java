package emu.lunarcore.game.login;

import emu.lunarcore.config.ConfigManager;
import emu.lunarcore.game.player.Player;
import emu.lunarcore.server.game.GameSession;
import emu.lunarcore.server.packet.send.PacketPlayerKickOutScNotify;
import emu.lunarcore.server.packet.send.PacketServerAnnounceNotify;

import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public class LoginManager {
    private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
    private final AtomicReference<ScheduledFuture<?>> future = new AtomicReference<>();

    public static String getLoginPwdByAccount(String account) {
        return ConfigManager.loginData.getLoginPwdByUser(account);
    }

    public static void handleLogin(GameSession session) {
        LoginManager loginManager = new LoginManager();
        loginManager.startLogin(session);
    }

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
    
    public void loginVerify(Player player, String sendUser, String sendPwd) {
        if (!loginPwdCheck(player, sendUser, sendPwd)) {
            player.sendMessage("login failed!");
            return;
        }

        // Device check
        if (ConfigManager.getConfig().getAccountOptions().limitDeviceId &&
            !loginDeviceCheck(player, sendUser)) {
            player.sendMessage("login failed!");
            return;
        }

        loginSuccess(player);
    }

    public static boolean loginPwdCheck(Player player, String sendUser, String sendPwd) {
        String enPwd = PasswordHandler.hashWithMD5(sendPwd);
        String userPwd = LoginManager.getLoginPwdByAccount(sendUser);
        if (userPwd == null) {
            player.sendMessage("Account not found.");
            return false;
        }

        if (userPwd.isEmpty()) {
            // First login
            player.sendMessage("Account first login, your password is set as: " + sendPwd);
            ConfigManager.getLoginData().update(sendUser, enPwd);
            return true;
        } else if (userPwd.equals(enPwd)) {
            // Login success with correct password
            return true;
        } else {
            player.sendMessage("Incorrect password.");
            return false;
        }
    }

    public static boolean loginDeviceCheck(Player player, String sendUser) {
        List<String> deviceIds = ConfigManager.getLoginData().getDeviceIdsByUser(sendUser);

        // Has max device id limit
        if (ConfigManager.getConfig().getAccountOptions().maxDeviceId > 0) {
            if (!deviceIds.contains(player.getAccount().getDeviceId())) {
                // New device id
                if (deviceIds.size() < ConfigManager.getConfig().getAccountOptions().maxDeviceId) {
                    deviceIds.add(player.getAccount().getDeviceId());
                    ConfigManager.getLoginData().update(sendUser, deviceIds);
                    return true;
                } else {
                    player.sendMessage("DeviceId limit reached.");
                    return false;
                }
            }
        }

        // No device id limit
        return true;
    }

    public void loginSuccess(Player player) {
        ScheduledFuture<?> currentFuture = future.get();
        if (currentFuture != null) {
            currentFuture.cancel(true);
        }
        player.getAccount().addPermission("support");
        player.getAccount().removePermission("player");
        player.sendMessage("Login success!");
    }

}