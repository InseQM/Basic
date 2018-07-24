package com.codes.Object_oriented.Enum;

public class GenderTest {
    public static void main(String[] args) {
        Gender g = Enum.valueOf(Gender.class, "FEMALE");
//        g.name = "女";
//        System.out.println(g + "代表" + g.name);
//        g.setName("女");
//        System.out.println(g + "代表" + g.getName());
//        g.setName("男");
        System.out.println(g + "代表" + g.getName());
    }
}
