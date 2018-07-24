package com.codes.Basic_class.System;

public class ExecTest {
    public static void main(String[] args) throws Exception{
        Runtime rt = Runtime.getRuntime();
        //运行技术本程序
        rt.exec("notepad.exe");
    }
}
