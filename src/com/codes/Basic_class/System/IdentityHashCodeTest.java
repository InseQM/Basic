package com.codes.Basic_class.System;

public class IdentityHashCodeTest {
    public static void main(String[] args) {
        //下列程序中s1和s2是两个不同的对象
        String s1 = new String("Hello");
        String s2 = new String("Hello");
        //String重写了hashCode()方法——改为根据字符序列计算hashCode值
        //因为s1和s2的字符序列相同，所以它们的hashCode返回值相同
        System.out.println(s1.hashCode() + "----" +s2.hashCode());
        //因为s1和s2是不同的字符串对象，所以它们的identityHashCode值不同
        System.out.println(System.identityHashCode(s1) + "----" + System.identityHashCode(s2));
        String s3 = "Hello";
        String s4 = "Hello";
        System.out.println(System.identityHashCode(s3) + "----" +System.identityHashCode(s4));
    }
}
