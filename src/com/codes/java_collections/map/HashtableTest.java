package com.codes.java_collections.map;

import java.util.Hashtable;

public class HashtableTest {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable();
        ht.put(new A(1232), "CMCC");
        ht.put(new A(9527), "CCTV");
        ht.put(new A(12315), new B());
        System.out.println(ht);
        System.out.println(ht.containsValue("ceshi"));
        System.out.println(ht.containsKey(9527));
        ht.remove(new A(12315));
        System.out.println(ht);
    }
}
class A{
    int count;
    public A(int count){
        this.count = count;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj != null && obj.getClass() == A.class){
            A a = (A) obj;
            return this.count == a.count;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.count;
    }
}
class B{
    @Override
    public boolean equals(Object obj) {
        return true;
    }
}
