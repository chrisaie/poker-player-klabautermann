package org.leanpoker.player;

import com.google.gson.JsonElement;

import java.util.Map;

public class Player {

    static final String VERSION = "Default Java folding player";

    public static int betRequest(JsonElement request) {
       // request.toString()
        if(Math.random() > 0.8) {
            return 3000 * (int)Math.random();
        }
        return 0;
    }

    public static void showdown(JsonElement game) {
    }
}
