package com.codes.genericity.genericMethod;
/**
 * 设定下限super
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MyUtils {
    public static <T>T copy(Collection<? super T > desk, Collection<T> src){
        T last = null;
        for (T ele : src){
            last = ele;
            desk.add(ele);
        }
        return last;
    }

    public static void main(String[] args) {
        List<Number> ln = new ArrayList<>();
        List<Integer> li = new ArrayList<>();
        li.add(5);
        Integer last = copy(ln, li);
        System.out.println(ln);
        System.out.println(last);
    }
}
