package com.codes.java_collections.map;

import java.util.EnumMap;

import static com.codes.java_collections.map.Season.*;

public class EnumMapTest {
    public static void main(String[] args) {
        EnumMap enumMap = new EnumMap(Season.class);
        enumMap.put(SUMMER, "夏日炎炎");
        enumMap.put(SPRING, "春暖花开");
        System.out.println(enumMap);
    }
}
