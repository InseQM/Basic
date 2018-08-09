package com.codes.java_collections.collection.iterator;

import java.util.Collection;
import java.util.HashSet;

public class ForeachTest {
    public static void main(String[] args) {
        Collection books = new HashSet();
        books.add("纱雾");
        books.add("bilibili");
        books.add("16");
        System.out.println(books);
        for (Object obj :
                books) {
            String book = (String)obj;
            System.out.println(book);
            if (book.equals("纱雾")){
                //引发ConcurrentModificationException
                books.remove(book);
            }
        }
    }
}
