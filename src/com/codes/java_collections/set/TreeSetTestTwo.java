package com.codes.java_collections.set;

import java.util.TreeSet;

public class TreeSetTestTwo {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        Z z = new Z(6);
        ts.add(z);
        System.out.println(ts.add(z));
        System.out.println(ts);
        ((Z)ts.first()).age = 9;
        System.out.println(((Z)ts.last()).age);
    }
}
class Z implements Comparable{
    int age;
    public Z(int age){
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }

    @Override
    public int compareTo(Object o) {
        return 1;
    }
}
