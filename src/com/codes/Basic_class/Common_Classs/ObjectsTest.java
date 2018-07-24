package com.codes.Basic_class.Common_Classs;

import java.util.Objects;

public class ObjectsTest {
    static ObjectsTest obj;

    public static void main(String[] args) {
        System.out.println(Objects.hashCode(obj));
        System.out.println(Objects.toString(obj));
//        System.out.println(obj.toString());
//        System.out.println(obj.hashCode());
        //要求obj不能为null，否则引发异常
        System.out.println(Objects.requireNonNull(obj,"obj参数不能为null!"));
    }
}
