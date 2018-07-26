package com.codes.collections.iterator;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorError {
    public static void main(String[] args) {
        Collection person = new HashSet();
        person.add("纱雾");
        person.add("18");
        person.add("165");
        System.out.println(person);
        Iterator i = person.iterator();
        while (i.hasNext()){
            String t = (String)i.next();
            System.out.println(t);
            if (t.equals("纱雾")){
                //使用Iterator迭代过程中，不可修改集合元素，下面代码引发异常ConcurrentModificationException
                person.remove(t);
            }
        }
    }
}
