package com.codes.java_collections.collections;

import java.util.ArrayList;
import java.util.Collections;

public class SortTest {
    public static void main(String[] args) {
        ArrayList nums = new ArrayList();
        nums.add(2);
        nums.add(5);
        nums.add(-3);
        nums.add(0);
        System.out.println(nums);
        Collections.reverse(nums);
        System.out.println(nums);
        Collections.sort(nums);
        System.out.println(nums);
        //对list集合元素进行随机排序，模拟了”洗牌“动作
        Collections.shuffle(nums);
        //每次输出次数不固定
        System.out.println(nums);
    }
}
