package com.codes.genericity.genericMethod;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<String> ts1 = new TreeSet<>(
                new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                return Integer.compare(o1.hashCode(), o2.hashCode());
            }
        });
        ts1.add("hello");
        ts1.add("wa");
        TreeSet<String> ts2 = new TreeSet<>(
                new Comparator<String>() {
                    @Override
                    public int compare(String o1, String o2) {
                        return Integer.compare(o2.length(), o1.length());
                    }
                }
        );
        ts2.add("hello");
        ts2.add("wa");
        System.out.println(ts1);
        System.out.println(ts2);
    }
}
