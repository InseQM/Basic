package com.codes.java_collections.list;

import java.util.ArrayList;
import java.util.List;

/**
 * List
 * 1.元素有序、可重复的集合，每个元素都有其对应的顺序索引
 * 2.默认按照元素的添加顺序设置元素索引
 *
 */
public class ListTest {
    public static void main(String[] args) {
        List person = new ArrayList();
        person.add(new String("纱雾"));
        person.add(new String("四糸乃"));
        person.add(new String("InseQM"));
        System.out.println(person);
        person.add(1, new String("雪"));
        for (Object i : person){
            System.out.print(i + "\t");
        }
        System.out.println();
        person.remove(2);
        System.out.println(person);
        System.out.println(person.indexOf(new String("InseQM")));
        person.set(2, new String("shawu"));
        System.out.println(person);
        System.out.println(person.subList(1, 2));
    }
}
