package com.codes.java_collections.set;

import java.util.HashSet;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(new A());
        hashSet.add(new A());
        hashSet.add(new B());
        hashSet.add(new B());
        hashSet.add(new C());
        hashSet.add(new C());
        System.out.println(hashSet);
    }
}
class A{
    @Override
    public boolean equals(Object obj) {
        return true;
    }
}
class B{
    @Override
    public int hashCode() {
        return 1;
    }
}
class C{
    @Override
    public int hashCode() {
        return 2;
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }
}