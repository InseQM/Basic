package com.codes.java_collections.set;

import java.util.TreeSet;

/**
 *  TreeSet是SortedSet的实现类，可以保证集合元素处于排序状态
 *  采用红黑树数据结构来存储集合元素
 */
public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet nums = new TreeSet();
        nums.add(5);
        nums.add(12);
        nums.add(1);
        nums.add(-3);
        System.out.println(nums);
        System.out.println(nums.first());
        System.out.println(nums.last());
        System.out.println(nums.headSet(1));
        System.out.println(nums.headSet(1, true));
        System.out.println(nums.tailSet(1, false));
        System.out.println(nums.subSet(1, 12));
        System.out.println(nums.lower(1));
        System.out.println(nums.higher(1));
    }
}
