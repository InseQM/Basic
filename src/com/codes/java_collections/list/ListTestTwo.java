package com.codes.java_collections.list;

import java.util.ArrayList;
import java.util.List;

public class ListTestTwo {
    public static void main(String[] args) {
        List books = new ArrayList();
        books.add(new String("java 虚拟机"));
        books.add(new String("java web 实战"));
        books.add(new String("java 编程思想"));
        System.out.println(books);
        books.remove(new A());
        System.out.println(books);
        books.remove(new A());
        System.out.println(books);
    }
}
class A{
    @Override
    public boolean equals(Object obj) {
        return true;
    }
}
