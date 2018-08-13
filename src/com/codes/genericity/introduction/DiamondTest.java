package com.codes.genericity.introduction;

import java.util.*;

/**
 * java7泛型的“菱形”语法
 */
public class DiamondTest {
    public static void main(String[] args) {
        List<String> books = new ArrayList<>();
        books.add("夜夜");
        books.add("雪月花");
        books.forEach(ele -> System.out.print(ele.length() + "\t"));
        Map<String, List<String>> schoolInfo = new HashMap<>();
        List<String> schools = new ArrayList<>();
        schools.add("夜夜");
        schools.add("雪月花");
        schoolInfo.put("acm", schools);
        schoolInfo.forEach((key, value) -> System.out.println(key + " --> " + value));
    }
}
