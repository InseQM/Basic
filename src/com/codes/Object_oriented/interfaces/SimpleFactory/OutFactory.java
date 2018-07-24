package com.codes.Object_oriented.interfaces.SimpleFactory;

import com.codes.Object_oriented.interfaces.Output;
import com.codes.Object_oriented.interfaces.Printer;

public class OutFactory {
    public Output getOutput(){
        return new BetterPrinter();
    }

    public static void main(String[] args) {
        OutFactory of = new OutFactory();
        Computer c = new Computer(of.getOutput());
        c.KeyIn("轻量级javaee企业应用实战");
        c.KeyIn("疯狂java讲义");
        c.print();
    }
}
