package com.codes.java_collections.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListTestThree {
    public static void main(String[] args) {
        List books = new ArrayList();
        books.add(new String("java 虚拟机"));
        books.add(new String("java web 实战"));
        books.add(new String("java 编程思想"));
        books.add(new String("算法导论"));
//        books.sort((Comparator.comparingInt(o -> ((String) o).length()));
        books.sort((o1, o2) -> ((String)o2).length() - ((String)o1).length());
        System.out.println(books);
        books.replaceAll(ele -> ((String)ele).length());
        System.out.println(books);
    }
}
