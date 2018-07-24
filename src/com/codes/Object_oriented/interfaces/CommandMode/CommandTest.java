package com.codes.Object_oriented.interfaces.CommandMode;

public class CommandTest {
    public static void main(String[] args) {
        ProcessArray pa = new ProcessArray();
        int[] target = {3, -4, 6, 4};
        pa.process(target, new PrintCommand());
        System.out.println("-------------------");
        //第二次处理数组，具体处理取决于AddCommand
        pa.process(target, new AddCommand());
    }
}
