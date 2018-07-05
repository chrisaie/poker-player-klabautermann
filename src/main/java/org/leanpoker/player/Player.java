package org.leanpoker.player;

import com.google.gson.JsonElement;

import java.util.Map;

public class Player {

    static final String VERSION = "Default Java folding player";

    public static int betRequest(JsonElement request) {


        try {
            int i = request.getAsJsonObject().getAsJsonObject("round").getAsInt();
            if (i<15) return 0;

            if (Math.random() > 0.1) {

                return 3000 * (int) Math.random();
            }
            return 0;
        } catch (Exception e) {

            if (Math.random() > 0.1) {

                return 3000 * (int) Math.random();
            }
            return 0;
        }

    }

    public static void showdown(JsonElement game) {
    }
}
