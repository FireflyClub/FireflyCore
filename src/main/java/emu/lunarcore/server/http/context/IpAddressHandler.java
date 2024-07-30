package emu.lunarcore.server.http.context;

import io.javalin.http.Context;

public class IpAddressHandler {
    private static final String[] HEADERS_TO_TRY = {
        "X-Forwarded-For",
        "Proxy-Client-IP",
        "WL-Proxy-Client-IP",
        "HTTP_X_FORWARDED_FOR",
        "HTTP_X_FORWARDED",
        "HTTP_X_CLUSTER_CLIENT_IP",
        "HTTP_CLIENT_IP",
        "HTTP_FORWARDED_FOR",
        "HTTP_FORWARDED",
        "HTTP_VIA",
        "REMOTE_ADDR"
    };

    public static String getClientIpAddress(Context ctx) {
        for (String header : HEADERS_TO_TRY) {
            String ip = ctx.header(header);
            if (ip != null && ip.length() != 0 && !"unknown".equalsIgnoreCase(ip)) {
                // Splitting the header value if it contains multiple IP addresses
                String[] ips = ip.split(",");
                for (String singleIp : ips) {
                    // Trim the IP address to remove any leading/trailing whitespace
                    singleIp = singleIp.trim();
                    if (!"unknown".equalsIgnoreCase(singleIp)) {
                        return singleIp;
                    }
                }
            }
        }
        // Fallback to the remote address if no valid IP address is found
        return ctx.ip();
    }
}