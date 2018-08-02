package com.codes.java_collections.set;

import java.util.TreeSet;

public class TreeSetTestFour {
    public static void main(String[] args) {
//        TreeSet<M> ts = new TreeSet<>(((o1, o2) -> o2.age - o1.age));
        TreeSet ts = new TreeSet(((o1, o2) -> {
            M m1 = (M)o1;
            M m2 = (M)o2;
            return m1.age > m2.age ? -1 :
                    m1.age < m2.age ? 1 : 0;
        }));
        ts.add(new M(5));
        ts.add(new M(-3));
        ts.add(new M(9));
        System.out.println(ts);
    }
}
class M{
    int age;

    M(int age){
        this.age = age;
    }

    @Override
    public String toString() {
        return "[age: " + age + "]";
    }
}
