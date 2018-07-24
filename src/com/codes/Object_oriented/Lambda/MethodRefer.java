package com.codes.Object_oriented.Lambda;

@FunctionalInterface
interface Converter {
    Integer convert(String from);
}
@FunctionalInterface
interface MyTest{
    String test(String a, int b, int c);
}

public class MethodRefer {
    public static void main(String[] args) {
        //引用类方法
        //Converter converter1 = from -> Integer.valueOf(from);
        Converter converter1 = Integer :: valueOf;
        Integer val = converter1.convert("99");
        System.out.println(val);
        //引用特定对象的实例方法
        //Converter converter2 = from -> "fkit.org".indexOf(from);
        Converter converter2 = "fk it.org"::indexOf;
        Integer value = converter2.convert("it");
        System.out.println(value);
        //引用某类对象的实例方法
        //MyTest mt = (a, b, c) -> a.substring(b, c);
        MyTest mt = String ::substring;
        String str = mt.test("Java I Love you", 2, 9);
        System.out.println(str);
    }
}
