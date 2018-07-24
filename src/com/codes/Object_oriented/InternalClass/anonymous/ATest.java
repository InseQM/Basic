package com.codes.Object_oriented.InternalClass.anonymous;

public class ATest {
    public static void main(String[] args) {
        int age = 8;
        A a = new A() {
            @Override
            public void test() {
                //java8前：age必须使用final修饰；
                //java8开始，匿名内部类、局部内部类允许访问非final的局部变量
                System.out.println(age);
            }
        };
        a.test();
//        java匿名内部类、局部内部类访问的局部变量是final的
//        age = 9;
    }
}
