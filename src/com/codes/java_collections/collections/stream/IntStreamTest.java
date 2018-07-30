package com.codes.java_collections.collections.stream;

import java.util.stream.IntStream;
//每个Stream只能执行一次
public class IntStreamTest {
    public static void main(String[] args) {
        IntStream is = IntStream.builder()
                .add(20)
                .add(13)
                .add(-2)
                .add(18)
                .build();
        //每次仅能运行一句
//        System.out.println("is所有元素的最大值：" + is.max().getAsInt());
//        System.out.println("is所有元素的最大值：" + is.max());
//        System.out.println("is所有元素的最小值：" + is.min().getAsInt());
//        System.out.println("is所有元素的总和：" + is.sum());
//        System.out.println("is所有元素的平均值：" + is.average());
//        System.out.println("is所有元素的平方是否都大于20："
//                + is.allMatch(value -> value * value > 20));
//        System.out.println("is是否包含任何元素的平方大于20"
//                + is.anyMatch(value -> value * value >20));
        IntStream newIs = is.map(ele -> ele * ele + 1);
        newIs.forEach(System.out :: println);
    }
}
