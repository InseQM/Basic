package com.codes.Object_oriented.interfaces.SimpleFactory;

import com.codes.Object_oriented.interfaces.Output;

public class Computer {
    private Output out;

    public Computer(Output out) {
        this.out = out;
    }
    public void KeyIn(String msg){
        out.getData(msg);
    }
    public void print(){
        out.out();
    }
}
