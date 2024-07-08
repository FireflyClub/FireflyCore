package emu.lunarcore.server.http.objects;

import org.jetbrains.annotations.NotNull;

import io.javalin.http.ContentType;
import io.javalin.http.Context;
import io.javalin.http.Handler;

public class HttpJsonResponse implements Handler {
    private final String json;
    private final int status;

    public HttpJsonResponse(String jsonString) {
        this.status = 200;
        this.json = jsonString;
    }

    public HttpJsonResponse(int status, String jsonString) {
        this.status = status;
        this.json = jsonString;
    }

    @Override
    public void handle(@NotNull Context ctx) throws Exception {
        ctx.status(status);
        ctx.contentType(ContentType.APPLICATION_JSON);
        ctx.result(json);
    }
}
