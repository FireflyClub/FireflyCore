package emu.lunarcore.server.http.objects;

import emu.lunarcore.util.Utils;
import io.javalin.http.Context;
import io.javalin.http.Handler;

public final class RemoteResponse implements Handler {

    public int retcode = 200;
    public String message = "Success";
    public Object data;

    public RemoteResponse() {}

    public RemoteResponse(int code, String message) {
        this.retcode = code;
        this.message = message;
    }

    public RemoteResponse(int code, String message, Object data) {
        this.retcode = code;
        this.message = message;
        this.data = data;
    }

    public RemoteResponse(int code, String message, String data) {
        this.retcode = code;
        this.message = message;
        this.data = Utils.stringToJSONObject(data) == null ? data : Utils.stringToJSONObject(data);
    }

    public RemoteResponse(Object data) {
        this.data = data;
    }

    public RemoteResponse(String data) {
        this.data = Utils.stringToJSONObject(data) == null ? data : Utils.stringToJSONObject(data);
    }

    @Override
    public void handle(Context ctx) throws Exception {
        ctx.json(this);
    }
}