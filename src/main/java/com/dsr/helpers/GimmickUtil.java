package com.dsr.helpers;

import com.dsr.pojo.Gimmick;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GimmickUtil {

    public static List<Gimmick> getMajorGimmicks() {
        List<Gimmick> gimmicks = new ArrayList<>();
        gimmicks.add((new Gimmick()).setName("Fists Only").addTag(Gimmick.Type.WEAPONS).setMinorSlots(2));
        gimmicks.add((new Gimmick()).setName("Daggers Only").addTag(Gimmick.Type.WEAPONS).setMinorSlots(2));
        gimmicks.add((new Gimmick()).setName("Whips Only").addTag(Gimmick.Type.WEAPONS).setMinorSlots(2));
        gimmicks.add((new Gimmick()).setName("Only Level up").addTag(Gimmick.Type.WEAPONS).setMinorSlots(1).setAdditional(
                () -> {return StatsUtil.listRandomStats(4);}
        ));
        gimmicks.add((new Gimmick()).setName("No Upgrade").setMinorSlots(2));
        gimmicks.add((new Gimmick()).setName("Max Level 40").addTag(Gimmick.Type.STATS));
        gimmicks.add((new Gimmick()).setName("Chaos Weapons").setMinorSlots(2));
        gimmicks.add((new Gimmick()).setName("No Bonfire").setMinorSlots(1));
        gimmicks.add((new Gimmick()).setName("Bow Only").addTag(Gimmick.Type.WEAPONS).setMinorSlots(1));
        gimmicks.add((new Gimmick()).setName("Set Build").addTag(Gimmick.Type.WEAPONS).addTag(Gimmick.Type.STATS).addTag(Gimmick.Type.SHIELDS).addTag(Gimmick.Type.ARMOUR));

        return gimmicks;
    }

    public static List<Gimmick> getMinorGimmicks() {
        List<Gimmick> gimmicks = new ArrayList<>();
        gimmicks.add((new Gimmick()).setName("Mandatory Shield").addTag(Gimmick.Type.SHIELDS));
        gimmicks.add((new Gimmick()).setName("No Shield").addTag(Gimmick.Type.SHIELDS));
        gimmicks.add((new Gimmick()).setName("Mandatory Bow").addTag(Gimmick.Type.WEAPONS));
        gimmicks.add((new Gimmick()).setName("No Bow").addTag(Gimmick.Type.WEAPONS));
        gimmicks.add((new Gimmick()).setName("Mandatory Armour").addTag(Gimmick.Type.ARMOUR));
        gimmicks.add((new Gimmick()).setName("No Armour").addTag(Gimmick.Type.ARMOUR));
        gimmicks.add((new Gimmick()).setName("Mandatory Crossbow").addTag(Gimmick.Type.WEAPONS));
        gimmicks.add((new Gimmick()).setName("You cant Level up").addTag(Gimmick.Type.STATS).setAdditional(StatsUtil::getRandomStat));
        gimmicks.add((new Gimmick()).setName("Only Level up after a boss"));
        gimmicks.add((new Gimmick()).setName("One Handed"));
        gimmicks.add((new Gimmick()).setName("Havel's Armour").addTag(Gimmick.Type.ARMOUR));
        gimmicks.add((new Gimmick()).setName("Swords only").addTag(Gimmick.Type.WEAPONS));
        gimmicks.add((new Gimmick()).setName("Spears only").addTag(Gimmick.Type.WEAPONS));
        gimmicks.add((new Gimmick()).setName("Great Weapons only").addTag(Gimmick.Type.WEAPONS));
        gimmicks.add((new Gimmick()).setName("Scythe's only").addTag(Gimmick.Type.WEAPONS));
        gimmicks.add((new Gimmick()).setName("Boss Weapons only").addTag(Gimmick.Type.WEAPONS));
        gimmicks.add((new Gimmick()).setName("Take All Boss Weapons").addTag(Gimmick.Type.WEAPONS));

        return gimmicks;
    }
}
