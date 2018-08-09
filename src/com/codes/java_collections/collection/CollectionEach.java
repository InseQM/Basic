package com.codes.java_collections.collection;

import java.util.Collection;
import java.util.HashSet;

public class CollectionEach {
    public static void main(String[] args) {
        Collection books = new HashSet();
        books.add("纱雾");
        books.add("bilibili");
        books.add(16);
        books.forEach(o -> System.out.println("迭代集合元素：" + o));
    }
}
