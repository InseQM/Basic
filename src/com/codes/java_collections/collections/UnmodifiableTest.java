package com.codes.java_collections.collections;

import java.util.*;

/**
 * 设置不可变集合，“只读”
 */
public class UnmodifiableTest {
    public static void main(String[] args) {
        //创建一个空的、不可改变的List对象
        List unmodifiableList = Collections.emptyList();
        //创建一个只有一个元素的，且不可改变的Set对象
        Set unmodifiableSet = Collections.singleton("shawu");
        //创建一个普通的Map对象
        Map scores = new HashMap();
        scores.put("语文", 30);
        scores.put("java", 90);
        //返回普通的Map对象对应的不可变版本
        Map unmodifiableMap = Collections.unmodifiableMap(scores);
        //下面代码均会引发UnsupportedOperationException异常
        unmodifiableList.add("ceshi");
        unmodifiableMap.put("ceshi", 1);
        unmodifiableSet.add("ceshi");
    }
}
