package com.codes.java_collections.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class CollectionTest {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("纱雾");
        c.add(6);
        System.out.println("c集合元素的个数为：" + c.size());
        c.remove(6);//删除指定元素
        System.out.println("c集合元素的个数为：" + c.size());
        System.out.println("判断是否包含“纱雾”字符串" + c.contains("纱雾"));
        c.add("javaee");
        System.out.println("c集合的元素为：" + c);
        Collection books = new HashSet();
        books.add("javaee");
        books.add("JVM实战");
        System.out.println("c集合是否完全包含books集合?" + c.containsAll(books));
        c.removeAll(books);//c集合减去books集合的元素
        System.out.println("c集合的元素为：" + c);
        c.clear();//清除c集合元素
        System.out.println("c集合的元素为：" + c);
        c.add("javaee");
        books.retainAll(c);//控制books集合里只剩下c集合的元素
        System.out.println("books集合的元素为：" + books);
    }
}
