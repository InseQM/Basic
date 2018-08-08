package com.codes.java_collections.map;

import java.util.LinkedHashMap;

public class LinkedHashMapTest {
    public static void main(String[] args) {
        LinkedHashMap lhm = new LinkedHashMap();
        lhm.put("语文", 80);
        lhm.put("数学", 82);
        lhm.put("英语", 76);
        lhm.forEach((key, value) -> System.out.println(key + "-->" + value));
    }
}
