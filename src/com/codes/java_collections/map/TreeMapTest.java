package com.codes.java_collections.map;

import java.util.TreeMap;

public class TreeMapTest {
    public static void main(String[] args) {
        TreeMap tm = new TreeMap();
        tm.put(new R(3), "shawu");
        tm.put(new R(-5), "sisinai");
        tm.put(new R(9), "loving");
        System.out.println(tm);
        System.out.println(tm.firstEntry());
        System.out.println(tm.lastKey());
        System.out.println(tm.higherKey(new R(2)));
        System.out.println(tm.lowerEntry(new R(2)));
        System.out.println(tm.subMap(new R(-1), new R(4)));

    }
}
class R implements Comparable{
    int count;
    R(int count){
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
        if (obj != null && obj.getClass() == R.class){
            R r = (R)obj;
            return r.count == this.count;
        }
        return false;
    }

    @Override
    public int compareTo(Object o) {
        R r = (R) o;
//        return Integer.compare(count, r.count);
        return count > r.count ? 1 : count < r.count ? -1 : 0;
    }
}