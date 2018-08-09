package com.codes.java_collections.collection.iterator;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorTest {
    public static void main(String[] args) {
        Collection books = new HashSet();
        books.add("纱雾");
        books.add("bilibili");
        books.add("16");
        System.out.println(books);
        Iterator iterator = books.iterator();
        while (iterator.hasNext()){
            String book = (String) iterator.next();
            if (book.equals("bilibili")){
                //删除上次next()方法返回的元素
                iterator.remove();
            }
            book = "测试字符串";
        }
        System.out.println(books);
    }
}
