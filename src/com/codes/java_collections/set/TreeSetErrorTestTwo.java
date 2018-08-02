package com.codes.java_collections.set;

import java.util.Date;
import java.util.TreeSet;

public class TreeSetErrorTestTwo {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        ts.add(new String("shawu"));
        ts.add(new Date());
    }
}
