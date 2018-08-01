package com.codes.java_collections.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTestTwo {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add(new R(5));
        hs.add(new R(-3));
        hs.add(new R(9));
        hs.add(new R(-2));
        System.out.println(hs);
        Iterator i = hs.iterator();
        R first = (R) i.next();
        first.count = -3;
        System.out.println(hs);
        hs.remove(new R(-3));
        System.out.println(hs);
        System.out.println("hs是否包含count为-3的R对象？" + hs.contains(new R(-3)));
        System.out.println("hs是否包含count为-2的R对象？" + hs.contains(new R(-2)));
    }
}
class R{
    int count;
    public R(int count){
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
            return this.count == r.count;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.count;
    }
}
