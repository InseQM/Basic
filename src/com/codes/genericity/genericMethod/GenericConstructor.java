package com.codes.genericity.genericMethod;

public class GenericConstructor {
    public static void main(String[] args) {
        new Foo("sukidayo");
        new Foo(300);
        new <String>Foo("cmss");
    }
}
class Foo{
    public <T> Foo(T t){
        System.out.println(t);
    }
}
