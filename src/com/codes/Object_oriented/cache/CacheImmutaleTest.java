package com.codes.Object_oriented.cache;

public class CacheImmutaleTest {
    public static void main(String[] args) {
        CachesImmutale c1 = CachesImmutale.valueOf("hello");
        CachesImmutale c2 = CachesImmutale.valueOf("hello");
        System.out.println(c1 == c2);
        System.out.println(c1.equals(c2));
        System.out.println( c1.hashCode());
        System.out.println( c2.hashCode());
    }
}