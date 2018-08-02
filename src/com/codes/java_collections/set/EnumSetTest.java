package com.codes.java_collections.set;

import java.util.EnumSet;

/**
 * EnumSet：
 * 1. 元素必为枚举类型，有序的由Enum类内的定义顺序决定元素集合顺序
 * 2. 内部以位向量的形式存储，这种存储形式非常紧凑、高效；内存占用小，运行效率高
 * 3. 不予许加入null元素
 * 4. 没有暴露任何构造器来创建该类实例，应该通过它提供的类方法来创建EnumSet对象
 */
enum Season{
    SPRING,SUMMER,FALL,WINTER
}
public class EnumSetTest {
    public static void main(String[] args) {
        EnumSet enumSet = EnumSet.allOf(Season.class);
        enumSet.remove(Season.WINTER);
        System.out.println(enumSet);
        EnumSet enumSet1 = EnumSet.complementOf(enumSet);
        System.out.println(enumSet1);
        enumSet1.add(Season.WINTER);
        enumSet1.add(Season.SPRING);
        System.out.println(enumSet1);
        EnumSet enumSet2 = EnumSet.of(Season.SUMMER, Season.WINTER);
        System.out.println(enumSet2);
        EnumSet enumSet3 = EnumSet.range(Season.SUMMER, Season.WINTER);
        System.out.println(enumSet3);
        EnumSet enumSet4 = EnumSet.complementOf(enumSet3);
        System.out.println(enumSet4);
    }
}
