package com.codes.java_collections.collections;

import java.util.Collection;
import java.util.HashSet;

public class PredicateTest {
    public static void main(String[] args) {
        Collection c = new HashSet();
        c.add(new String("Java ee 实战"));
        c.add(new String("Java 讲义"));
        c.add(new String("IOS 讲义"));
        c.add(new String("String 实战"));
        c.add("字符串");
        System.out.println(c);
        for (Object obj:c) {
            System.out.println(((String)obj).length());
        }
        c.removeIf(ele -> ((String)ele).length() < 8);
        System.out.println(c);


    }
}
