package com.codes.java_collections.set;

import java.util.TreeSet;

public class TreeSetTestThree {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        ts.add(new Cc(5));
        ts.add(new Cc(-3));
        ts.add(new Cc(9));
        ts.add(new Cc(-2));
        System.out.println(ts);
        Cc first = (Cc) ts.first();
        first.count = 20;
        Cc last = (Cc)ts.last();
        last.count = -2;
        System.out.println(ts);
        System.out.println(ts.remove(new Cc(-2)));
        System.out.println(ts);
        System.out.println(ts.remove(new Cc(5)));
        System.out.println(ts);
    }
}
class Cc implements Comparable{
    int count;
    public Cc(int count){
        this.count = count;
    }

    @Override
    public String toString() {
        return "R[count: " + count + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj != null && obj.getClass() == Cc.class){
            Cc r = (Cc) obj;
            return r.count == this.count;
        }
        return false;
    }

    @Override
    public int compareTo(Object o) {
        Cc r = (Cc)o;
        return count > r.count ? 1 :
                count < r.count ? -1 : 0;
    }
}
