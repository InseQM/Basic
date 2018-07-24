package com.codes.Object_oriented.cache;

public class IntegerCacheTest {
    public static void main(String[] args) {
        Integer in1 = new Integer(6);
        Integer in2 = Integer.valueOf(6);
        Integer in3 = Integer.valueOf(6);
        System.out.println(in1 == in2);
        System.out.println(in2 == in3);
        //由于Integer只缓存-128~127之间的值
        Integer in4 = Integer.valueOf(128);
        Integer in5 = Integer.valueOf(128);
        System.out.println(in4 == in5);
    }

}
