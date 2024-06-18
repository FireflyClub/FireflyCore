package emu.lunarcore;

import java.util.*;

import lombok.Getter;

@Getter
public class HotfixData {

    public BaseUrlData baseUrl = new BaseUrlData();
    public Map<String, DownloadData> downloadData = new LinkedHashMap<>();

    @Getter
    public static class BaseUrlData {
        public String CNWin = "https://autopatchcn.bhsr.com";
        public String OSWin = "https://autopatchos.starrails.com";
    }

    @Getter
    public static class DownloadData {
        public String assetBundleUrl = "";
        public String exResourceUrl = "";
        public String luaUrl = "";
        public String ifixUrl = "";

        public DownloadData() {
            this.assetBundleUrl = "";
            this.exResourceUrl = "";
            this.luaUrl = "";
            this.ifixUrl = "";
        }
    }

    public void addNewVersion(String version) {
        if (!downloadData.containsKey(version)) {
            DownloadData newDownloadData = new DownloadData();
            downloadData.put(version, newDownloadData);
        }
    }

}