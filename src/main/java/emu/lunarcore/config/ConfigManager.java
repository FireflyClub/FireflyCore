package emu.lunarcore.config;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import emu.lunarcore.GameConstants;
import emu.lunarcore.LunarCore;
import emu.lunarcore.util.JsonUtils;
import lombok.Getter;

public class ConfigManager {
    public static File configFile = new File("./config/Config.json");
    public static File hotfixFile = new File("./config/Hotfix.json");
    public static File tagFile = new File("./config/Tag.json");
    public static File remoteFile = new File("./config/Remote.json");
    public static File loginFile = new File("./config/Login.json");

    @Getter public static ConfigData config;
    @Getter public static HotfixData hotfixData;
    @Getter public static TagData tagData;
    @Getter public static RemoteData remoteData;
    @Getter public static LoginData loginData;

    public static void loadConfigs() {
        loadConfig();
        loadHotfixData();
        loadTagData();
        loadRemoteData();
        loadLoginData();
    }
    
    public static void loadConfig() {
        try (FileReader file = new FileReader(ConfigManager.configFile)) {
            ConfigManager.config = JsonUtils.loadToClass(file, ConfigData.class);
        } catch (Exception e) {
            // Ignored
        }
        
        // Sanity check
        if (ConfigManager.getConfig() == null) {
            ConfigManager.config = new ConfigData();
        } else {
            ConfigManager.getConfig().validate();
        }
        
        // Save config
        saveConfig();
    }

    public static void saveConfig() {
        try (FileWriter file = new FileWriter(ConfigManager.configFile)) {
            Gson gson = new GsonBuilder()
                    .setDateFormat("dd-MM-yyyy hh:mm:ss")
                    .setPrettyPrinting()
                    .serializeNulls()
                    .create();
            
            file.write(gson.toJson(ConfigManager.config));
        } catch (Exception e) {
            LunarCore.getLogger().error("Config save error");
        }
    }

    public static void loadHotfixData() {
        try (FileReader file = new FileReader(ConfigManager.hotfixFile)) {
            ConfigManager.hotfixData = JsonUtils.loadToClass(file, HotfixData.class);
        } catch (Exception e) {
            ConfigManager.hotfixData = null;
        }

        if (ConfigManager.hotfixData == null) {
            ConfigManager.hotfixData = new HotfixData();
        }

        // Check and add missing versions
        String version = GameConstants.VERSION;
        for (int i = 1; i <= 5; i++) {
            String targetVersion = version + i;
            if (!ConfigManager.hotfixData.getDownloadData().containsKey(targetVersion)) {
                ConfigManager.hotfixData.addNewVersion(targetVersion);
            }
        }

        saveHotfixData();
    }

    public static void saveHotfixData() {
        // Save hotfix data
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .serializeNulls()
                .create();

        try (FileWriter fw = new FileWriter(ConfigManager.hotfixFile)) {
            fw.write(gson.toJson(ConfigManager.hotfixData));
        } catch (Exception ex) {
            // Ignored
        }
    }

    public static void loadTagData() {
        try (FileReader file = new FileReader(ConfigManager.tagFile)) {
            ConfigManager.tagData = JsonUtils.loadToClass(file, TagData.class);
        } catch (Exception e) {
            ConfigManager.tagData = null;
        }

        if (ConfigManager.tagData == null) {
            ConfigManager.tagData = new TagData();
        }

        saveTagData();
    }

    public static void saveTagData() {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .serializeNulls()
                .create();
    
        try (FileWriter fw = new FileWriter(ConfigManager.tagFile)) {
            fw.write(gson.toJson(ConfigManager.tagData));
        } catch (Exception ex) {
            // Ignored
        }
    }

    public static void loadRemoteData() {
        try (FileReader file = new FileReader(ConfigManager.remoteFile)) {
            ConfigManager.remoteData = JsonUtils.loadToClass(file, RemoteData.class);
        } catch (Exception e) {
            ConfigManager.remoteData = null;
        }

        if (ConfigManager.remoteData == null) {
            ConfigManager.remoteData = new RemoteData();
        }

        saveRemoteData();
    }

    public static void saveRemoteData() {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .serializeNulls()
                .create();
    
        try (FileWriter fw = new FileWriter(ConfigManager.remoteFile)) {
            fw.write(gson.toJson(ConfigManager.remoteData));
        } catch (Exception ex) {
            // Ignored
        }
    }

    public static void loadLoginData() {
        try (FileReader file = new FileReader(ConfigManager.loginFile)) {
            ConfigManager.loginData = JsonUtils.loadToClass(file, LoginData.class);
        } catch (Exception e) {
            ConfigManager.loginData = null;
        }

        if (ConfigManager.loginData == null) {
            ConfigManager.loginData = new LoginData();
        }

        saveLoginData();
    }

    public static void saveLoginData() {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .serializeNulls()
                .create();
    
        try (FileWriter fw = new FileWriter(ConfigManager.loginFile)) {
            fw.write(gson.toJson(ConfigManager.loginData));
        } catch (Exception ex) {
            // Ignored
        }
    }

}
