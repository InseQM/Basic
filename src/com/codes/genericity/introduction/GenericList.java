package com.codes.genericity.introduction;

import java.util.ArrayList;
import java.util.List;

/**
 * 使用泛型
 */
public class GenericList {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("index");
        strList.add("ic");
//        strList.add(33);
        strList.forEach(str -> System.out.print(str.length() + "\t"));
        System.out.println();
        strList.forEach(System.out::print);
    }
}
