package com.codes.genericity.genericMethod;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class RightTest {
    static <T> void test(Collection<? extends T> from, Collection<T> to){
        for (T o : from){
            to.add(o);
        }
    }
    public static void main(String[] args) {
        List<Object> ao = new ArrayList<>();
        List<String> as = new ArrayList<>();
        test(as, ao);
    }
}
