package com.dsr.helpers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class StatsUtil {

    public enum Stats {
        VITALITY,
        ATTUNEMENT,
        ENDURANCE,
        STRENGTH,
        DEXTERITY,
        RESISTANCE,
        INTELLIGENCE,
        FAITH
    }

    public static String getRandomStat() {
        return Stats.values()[(new Random()).nextInt(Stats.values().length)].toString();
    }

    public static String listRandomStats(int amount) {
        List<Integer> index = new ArrayList<>();
        Random rnd = new Random();

        if (amount >= Stats.values().length) {
            return String.join(Arrays.toString(Stats.values()), ", ");
        }

        while (index.size() < amount) {
            int newInt = rnd.nextInt(Stats.values().length);
            if (!index.contains(newInt)) {
                index.add(newInt);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < amount; i++) {
            sb.append(Stats.values()[index.get(i)]);
            sb.append(", ");
        }
        return sb.toString();
    }
}
