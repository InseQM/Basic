package com.codes.Object_oriented.interfaces.CommandMode;

public interface Command {
    //接口里定义process方法用于封装“处理pu行为”
    void process(int[] target);
}
