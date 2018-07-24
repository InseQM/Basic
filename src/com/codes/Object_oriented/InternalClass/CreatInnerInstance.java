package com.codes.Object_oriented.InternalClass;

public class CreatInnerInstance {
    public static void main(String[] args) {
        Out.In in = new Out().new In("测试信息");
//        Out.In in1;
//        Out out = new Out();
//        in = out.new In("测试信息");
    }
}
