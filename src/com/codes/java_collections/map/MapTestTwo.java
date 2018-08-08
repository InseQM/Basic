package com.codes.java_collections.map;

import java.util.HashMap;
import java.util.Map;

public class MapTestTwo {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("shawu", 1);
        map.put("sisinai", 91);
        map.put("loving", 999);
        map.put("inseqm", 99);
        map.replace("shawu", 28);
        System.out.println(map);
        map.merge("loving", 10,
                (oldVal, param) -> (Integer) oldVal + (Integer) param);
        System.out.println(map);
        map.computeIfAbsent("sukidayo", key -> ((String)key).length());
        System.out.println(map);
        map.computeIfPresent("sukidayo",
                (key, value) -> (Integer)value * (Integer)value);
        System.out.println(map);
        map.computeIfPresent("sukidayo",
                (key, value) -> null);
        System.out.println(map);
    }
}
