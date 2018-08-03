package com.codes.java_collections.set;

import java.util.Collection;
import java.util.EnumSet;
import java.util.HashSet;

/**
 * 复制collection集合中的所有元素创建EnumSet集合时，要求collection所有元素
 * 必须是同一枚举类的枚举值
 */
public class EnumSetTestTwo {
    public static void main(String[] args) {
        Collection collection = new HashSet();
        collection.clear();
        collection.add(Season.SUMMER);
        collection.add(Season.SPRING);
        EnumSet enumSet = EnumSet.copyOf(collection);
        System.out.println(enumSet);
        collection.add("shawu");
        enumSet = EnumSet.copyOf(collection);
        System.out.println(enumSet);
    }
}
