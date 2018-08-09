package com.codes.java_collections.collection.stream;

import java.util.Collection;
import java.util.HashSet;

public class CollectionStream {
    public static void main(String[] args) {
        Collection c = new HashSet();
        c.add(new String("Java ee 实战"));
        c.add(new String("Java 讲义"));
        c.add(new String("IOS 讲义"));
        c.add(new String("String 实战"));
        c.add("字符串");
        System.out.println(c);
        System.out.println(c.stream().filter(ele -> ((String)ele)
                .contains("Java")).count());
        System.out.println(c.stream().filter(ele -> ((String)ele)
                .contains("讲义")).count());
        System.out.println(c.stream().filter(ele -> ((String)ele)
                .length() > 8).count());
        c.stream().mapToInt(ele -> ((String)ele).length())
                .forEach(value -> System.out.print(value + "\t"));
    }
}
