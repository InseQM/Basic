package com.codes.java_collections.list;

import java.util.Arrays;
import java.util.List;

/**
 * asList()
 * 既不是ArrayList的实例，又不是Vector的实例，是Arrays内部类ArrayList的实例
 * 是一个固定长度的List集合，只能遍历访问该集合里的元素，不可增加、删除集合的元素
 */
public class FixSizeList {
    public static void main(String[] args) {
        List fixedList = Arrays.asList(
                "java 编程思想",
                "java web 实战",
                "算法导论");
        System.out.println(fixedList.getClass());
        fixedList.forEach(System.out :: println);
        //报错
        fixedList.add("1");
        fixedList.remove("算法导论");
    }
}
