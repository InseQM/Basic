package com.codes.Object_oriented.interfaces;

public interface Output {
    int Max_CACHE_LINE = 50;
    void out();
    void getData(String msg);
    default void print(String... mags){
        for (String msg : mags){
            System.out.println(msg);
        }
    }
    default void test(){
        System.out.println("默认的text（）方法");
    }
    static String staticTest(){
        return "接口里面的类方法";
    }
}
