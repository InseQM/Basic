package com.codes.java_collections.map;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("shawu", 1);
        map.put("sisinai", 91);
        map.put("loving", 999);
        map.put("inseqm", 99);
        System.out.println(map.put("shawu", 99));
        System.out.println(map);
        System.out.println(map.containsKey("loving"));
        System.out.println(map.containsValue(99));
        for (Object key : map.keySet()){
            System.out.println(key + "-->" + map.get(key));
        }
        map.remove("sisinai");
        System.out.println(map);
    }
}