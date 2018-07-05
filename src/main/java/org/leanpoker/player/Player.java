package org.leanpoker.player;

import com.google.gson.JsonElement;

import java.util.Map;

public class Player {

    static final String VERSION = "V1.1";

    public static int betRequest(JsonElement request) {


        try {
            int i = request.getAsJsonObject().getAsJsonObject("round").getAsInt();
            if (i<5) return 0;

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
