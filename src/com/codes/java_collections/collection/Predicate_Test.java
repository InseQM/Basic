package com.codes.java_collections.collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.function.Predicate;

public class Predicate_Test {
    public static void main(String[] args) {
        Collection c = new HashSet();
        c.add(new String("Java ee 实战"));
        c.add(new String("Java 讲义"));
        c.add(new String("IOS 讲义"));
        c.add(new String("String 实战"));
        c.add("字符串");
        System.out.println(c);
        System.out.println(calAll(c, ele -> ((String)ele).contains("Java")));
        System.out.println(calAll(c, ele -> ((String)ele).contains("讲义")));
        System.out.println(calAll(c, ele -> ((String)ele).length() > 8));
    }
    public static int calAll(Collection c, Predicate p){
        int total = 0;
        for (Object obj : c){
            //使用Predicate的test()方法判断该对象是否满足Predicate指定的条件
            if (p.test(obj)){
                total++;
            }
        }
        return total;
    }
}
