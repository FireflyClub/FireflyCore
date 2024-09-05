package emu.lunarcore.server.http.module;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class TokenHandler {
    private static final TokenHandler instance = new TokenHandler();
    private Map<Integer, String> tokenMap;

    private TokenHandler() {
        tokenMap = new HashMap<>();
    }

    public static TokenHandler getInstance() {
        return instance;
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
