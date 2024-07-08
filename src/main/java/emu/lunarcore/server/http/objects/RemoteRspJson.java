package emu.lunarcore.server.http.objects;

import io.javalin.http.Context;
import io.javalin.http.Handler;

public class RemoteRspJson implements Handler {
    public int retcode = 200;
    public String message = "";

    public RemoteRspJson() {}

    public RemoteRspJson(int code, String message) {
        this.retcode = code;
        this.message = message;
    }

    @Override
    public void handle(Context ctx) throws Exception {
        ctx.json(this);
    }
}