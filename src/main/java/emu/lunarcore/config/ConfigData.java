package emu.lunarcore.config;

import java.util.Date;
import java.util.List;
import java.util.Set;

import com.google.gson.annotations.SerializedName;

import emu.lunarcore.data.common.ItemParam;
import lombok.Getter;

@Getter
public class ConfigData {
    public DatabaseInfo accountDatabase = new DatabaseInfo();
    public DatabaseInfo gameDatabase = new DatabaseInfo();
    public InternalMongoInfo internalMongoServer = new InternalMongoInfo();
    public boolean useSameDatabase = true;

    public KeystoreInfo keystore = new KeystoreInfo();

    public HttpServerConfig httpServer = new HttpServerConfig(619);
    public GameServerConfig gameServer = new GameServerConfig(2007);
    
    public ServerOptions serverOptions = new ServerOptions();
    public AccountOptions accountOptions = new AccountOptions();
    public ServerTime serverTime = new ServerTime();
    public ServerRates serverRates = new ServerRates();
    public LogOptions logOptions = new LogOptions();
    public AnnounceData announceData = new AnnounceData();

    public String resourceDir = "./resources";
    public String dataDir = "./config";

    @Getter
    public static class DatabaseInfo {
        public String uri = "mongodb://localhost:27017";
        public String collection = "jokersr";
        public boolean useInternal = false;
    }

    @Getter
    public static class InternalMongoInfo {
        public String address = "localhost";
        public int port = 27017;
        public String filePath = "database.mv";
    }

    @Getter
    public static class KeystoreInfo {
        public String path = "./keystore.p12";
        public String password = "";
    }

    @Getter
    private static class ServerConfig {
        public String bindAddress = "0.0.0.0";
        @SerializedName(value = "bindPort", alternate = {"port"})
        public int bindPort;
        
        // Will return bindAddress if publicAddress is null
        public String publicAddress = "127.0.0.1";
        // Will return bindPort if publicPort is null
        public Integer publicPort;
        
        public ServerConfig(int port) {
            this.bindPort = port;
        }
        
        public String getPublicAddress() {
            if (this.publicAddress != null && !this.publicAddress.isEmpty()) {
                return this.publicAddress;
            }
            
            return this.bindAddress;
        }
        
        public int getPublicPort() {
            if (this.publicPort != null && this.publicPort != 0) {
                return this.publicPort;
            }
            
            return this.bindPort;
        }
    }
    
    @Getter
    public static class HttpServerConfig extends ServerConfig {
        public boolean useSSL = false;
        public long regionListRefresh = 60_000; // Time in milliseconds to wait before refreshing region list cache again

        public HttpServerConfig(int port) {
            super(port);
        }
        
        public String getDisplayAddress() {
            return (useSSL ? "https" : "http") + "://" + getPublicAddress() + ":" + getPublicPort();
        }
    }

    @Getter
    public static class GameServerConfig extends ServerConfig {
        public String id = "Joker";
        public String name = "Joker-Server";
        public String description = "JokerSR-LC";
        public int kcpInterval = 40;
        public Integer kcpTimeout = 30;

        public GameServerConfig(int port) {
            super(port);
        }
        
        public int getKcpTimeout() {
            return kcpTimeout.intValue();
        }
    }
    
    @Getter 
    public static class ServerTime {
        public boolean spoofTime = false;
        public Date spoofDate = new Date(1705276800000L); // January 15, 2024 12:00:00 AM (GMT)
    }
    
    @Getter
    public static class ServerOptions {
        public boolean useMission = false; // Seems to be stuck in mission scene
        public int sceneMaxEntites = 500;
        public int maxCustomRelicLevel = 15; // Maximum level of a relic that the player can create with the /give command
        public boolean unlockAllChallenges = true;
        public boolean spendStamina = true;
        public int staminaRecoveryRate = 5 * 60;
        public int staminaReserveRecoveryRate = 18 * 60;
        public int startTrailblazerLevel = 1; // Starting trailblazer level for new players
        public boolean autoUpgradeWorldLevel = true; // Automatically upgrades world level when the player reaches a certain TB level
        public String language = "CHS";
        public Set<String> defaultPermissions = Set.of("player");
        public ServerProfile serverFriendInfo = new ServerProfile();
        public ServerChatProfile serverChatFriendInfo = new ServerChatProfile();
        public WelcomeMail welcomeMail = new WelcomeMail();
        
        public int getStaminaRecoveryRate() {
            return staminaRecoveryRate > 0 ? staminaRecoveryRate : 1;
        }
        
        public int getStaminaReserveRecoveryRate() {
            return staminaReserveRecoveryRate > 0 ? staminaReserveRecoveryRate : 1;
        }
    }
    
    @Getter
    public static class AccountOptions {
        public boolean autoCreateAccount = true;
        public int maxPlayers = -1;
        public String consoleRemoteKey = "";
        public boolean useLogin = false;
        public boolean adminLoginSkip = true;
        public boolean limitDeviceId = false;
        public int maxDeviceId = 3;
    }

    @Getter
    public static class ServerRates {
        public double exp = 1.0;
        public double credit = 1.0;
        public double jade = 1.0;
        public double material = 1.0;
        public double equip = 1.0;
    }
    
    @Getter
    public static class ServerProfile {
        public String name = "JokerSR-Console";
        public String signature = "Type /help for a list of the modified commands.";
        public int level = 70;
        public int headIcon = 202007;
        public int chatBubbleId = 0;
        public List<ServerDisplayAvatar> displayAvatars = List.of(new ServerDisplayAvatar(1220, 80), new ServerDisplayAvatar(1222, 80));
        
        @Getter
        public static class ServerDisplayAvatar {
            public int avatarId;
            public int level;
            
            public ServerDisplayAvatar(int avatarId, int level) {
                this.avatarId = avatarId;
                this.level = level;
            }
        }
    }

    @Getter
    public static class ServerChatProfile {
        public String name = "JokerSR-World";
        public String signature = "Be free chating here!";
        public int level = 70;
        public int headIcon = 202016;
        public int chatBubbleId = 0;
        public List<ServerDisplayAvatar> displayAvatars = List.of(new ServerDisplayAvatar(1223, 80));
        
        @Getter
        public static class ServerDisplayAvatar {
            public int avatarId;
            public int level;
            
            public ServerDisplayAvatar(int avatarId, int level) {
                this.avatarId = avatarId;
                this.level = level;
            }
        }
    }
    
    @Getter
    public static class WelcomeMail {
        public String title;
        public String sender;
        public String content;
        public List<ItemParam> attachments;
        
        public WelcomeMail() {
            this.title = "Welcome to a JokerSR-Server";
            this.sender = "Joker";
            this.content = "Welcome to JokerSR-Server, a modified version of LunarCore.";
            this.attachments = List.of(
                new ItemParam(2, 1000000),
                new ItemParam(101, 1000),
                new ItemParam(102, 1000)
            );
        }
    }
    
    @Getter
    public static class LogOptions {
        public boolean commands = true;
        public boolean connections = true;
        public boolean easyPackets = false;
        public boolean packets = false;
        public boolean filterLoopingPackets = false;
    }

    @Getter
    public static class AnnounceData {
        public boolean useBanner = false;
        public String bannerText = "JokerSR-LC By Lethe";
        public String adminBannerText = "JokerSR-LC By Lethe (Admin Access)";
        public int bannerFrequency = 0;
    }

    public void validate() {
        if (this.gameServer.kcpTimeout == null) {
            this.gameServer.kcpTimeout = 30;
        }
    }

}
