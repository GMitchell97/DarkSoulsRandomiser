package com.dsr.pojo;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Gimmick {

    public enum Type {
        STATS,
        WEAPONS,
        ARMOUR,
        SHIELDS
    }

    private String name;
    private List<Type> tags = new ArrayList<>();
    private Supplier<String> additional;
    private int minorSlots;

    public String getName() {
        return name;
    }

    public Gimmick setName(String name) {
        this.name = name;
        return this;
    }

    public List<Type> getTags() {
        return tags;
    }

    public Gimmick setTags(List<Type> tags) {
        this.tags = tags;
        return this;
    }

    public Gimmick addTag(Type tag) {
        tags.add(tag);
        return this;
    }

    public boolean matchTags(List<Type> tags) {
        for (Type tag : tags) {
            if (this.tags.contains(tag)) {
                return true;
            }
        }
        return false;
    }

    public int getMinorSlots() {
        return minorSlots;
    }

    public Gimmick setMinorSlots(int minorSlots) {
        this.minorSlots = minorSlots;
        return this;
    }

    public boolean hasAdditional() {
        return additional != null;
    }

    public Gimmick setAdditional(Supplier<String> additional) {
        this.additional = additional;
        return this;
    }

    public String getAdditional() {
        return additional.get();
    }
}
