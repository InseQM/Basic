package com.codes.java_collections.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorTest {
    public static void main(String[] args) {
        String[] books = {
                "java 编程思想",
                "java web 实战",
                "算法导论"
        };
        List bookList = new ArrayList();
        for (int i = 0; i < books.length; i++) {
            bookList.add(books[i]);
        }
        ListIterator li = bookList.listIterator();
        while (li.hasNext()) {
            li.add("--------分割线--------");
            System.out.println(li.next());
        }
        System.out.println("========下面开始反向迭代========");
        while (li.hasPrevious()) {
            System.out.println(li.previous());
        }
    }
}
