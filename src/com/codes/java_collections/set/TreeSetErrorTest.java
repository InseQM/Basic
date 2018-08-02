package com.codes.java_collections.set;

import java.util.TreeSet;

/**
 * TreeSet添加对象时一定要实现Comparable接口
 */
public class TreeSetErrorTest {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        ts.add(new Err());
        ts.add(new Err());
    }
}
class Err{}