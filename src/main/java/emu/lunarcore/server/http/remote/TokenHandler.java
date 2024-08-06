package emu.lunarcore.server.http.remote;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class TokenHandler {
    private Map<Integer, String> tokenMap;
    public TokenHandler() {
        tokenMap = new HashMap<>();
    }

    public void addToken(int uid, String token) {
        tokenMap.put(uid, token);
    }

    public String getTokenByUid(int uid) {
        return tokenMap.get(uid);
    }

    public static String generateRandomToken(int length) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder token = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            token.append(chars.charAt(random.nextInt(chars.length())));
        }
        return token.toString();
    }
}
