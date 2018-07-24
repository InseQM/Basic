package com.codes.Object_oriented.InternalClass;

import com.codes.Object_oriented.interfaces.Output;

public class Outer {
    private int outProp = 9;
    class Inner{
        private int inProp = 5;
        public void acessOuterProp(){
            System.out.println("外部类的outProp值：" + outProp);
        }
    }
    public void acessInnerProp(){
        //外部类不能直接访问非静态内部类的实例变量；
        //下面代码编译错误
        //System.out.println("内部类的inProp值：" + inProp);
        System.out.println("内部累的inProp值：" + new Inner().inProp);
    }

    public static void main(String[] args) {
        Outer out = new Outer();
        out.acessInnerProp();
    }
}
