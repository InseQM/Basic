package com.codes.Basic_class.User_Interaction;

import java.io.*;
import java.util.*;

public class ScannerFileTest {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("src//com//codes//Basic_class//User_Interaction//ScannerFileTest.java"));
        System.out.println("ScannerFileTest.java的文件如下：");
        //判断是否有下一行
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
    }
}
