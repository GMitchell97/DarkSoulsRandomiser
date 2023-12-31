package com.dsr;

import com.dsr.helpers.GimmickUtil;
import com.dsr.helpers.StatsUtil;
import com.dsr.pojo.Display;
import com.dsr.pojo.Gimmick;

import java.util.List;
import java.util.Random;

public class DSR {

    private List<Gimmick> majorGimmicks;
    private List<Gimmick> minorGimmicks;

    public DSR() {
        majorGimmicks = GimmickUtil.getMajorGimmicks();
        minorGimmicks = GimmickUtil.getMinorGimmicks();
    }
    public Display nextRandom() {
        Display display = new Display();

        List<Gimmick.Type> tags;
        Gimmick major = majorGimmicks.get((new Random()).nextInt(majorGimmicks.size()));
        tags = major.getTags();
        String majorDisplay;
        StringBuilder minorDisplayBuilder = new StringBuilder();

        if (major.hasAdditional()) {
            majorDisplay = major.getName() + " " + major.getAdditional();
        } else {
            majorDisplay = major.getName();
        }

        for (int i = 0; i < major.getMinorSlots(); i++) {
            List<Gimmick> filteredGimmicks = minorGimmicks.stream().filter(g -> !g.matchTags(tags)).toList();
            Gimmick minor = filteredGimmicks.get((new Random()).nextInt(filteredGimmicks.size()));
            tags.addAll(minor.getTags());
            if (minor.hasAdditional()) {
                minorDisplayBuilder.append(minor.getName()).append(" ").append(minor.getAdditional());
            } else {
                minorDisplayBuilder.append(minor.getName());
            }
            minorDisplayBuilder.append("\n");
        }

        display.setMajor(majorDisplay);
        display.setMinor(minorDisplayBuilder.toString());

        return display;
    }
}
