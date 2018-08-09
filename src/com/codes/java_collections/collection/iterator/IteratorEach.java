package com.codes.java_collections.collection.iterator;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorEach {
    public static void main(String[] args) {
        Collection books = new HashSet();
        books.add("纱雾");
        books.add("bilibili");
        books.add("16");
        System.out.println(books);
        Iterator iterator = books.iterator();
        iterator.forEachRemaining(o ->
                System.out.println("迭代集合元素：" + o));
    }
}
