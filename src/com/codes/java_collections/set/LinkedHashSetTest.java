package com.codes.java_collections.set;

import java.util.LinkedHashSet;

/**
 * 根据元素的hashCode值来决定元素的储存位置；同时使用链表维护元素的次序；当遍历LinkedHashSet
 * 元素时，将会按照元素的添加顺序来访问集合里的元素;不允许元素重复
 * 性能略低于HashSet，在迭代访问Set里面的集合元素时有很好的性能，它是以链表来维护内部顺序
 */
public class LinkedHashSetTest {
    public static void main(String[] args) {
        LinkedHashSet person = new LinkedHashSet();
        person.add("shawu");
        person.add("Inse");
        System.out.println(person);
        person.remove("shawu");
        person.add("shawu");
        System.out.println(person);
    }
}
