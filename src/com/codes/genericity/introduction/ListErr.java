package com.codes.genericity.introduction;

import java.util.ArrayList;
import java.util.List;

/**
 * 编译时不检查类型的异常
 */
public class ListErr {
    public static void main(String[] args) {
        List strList = new ArrayList();
        strList.add("雪");
        strList.add("花");
        strList.add(5);
        strList.forEach(str -> System.out.print(str + "\t"));
        System.out.println();
        strList.forEach(str -> System.out.println(((String)str).length()));
    }
}
