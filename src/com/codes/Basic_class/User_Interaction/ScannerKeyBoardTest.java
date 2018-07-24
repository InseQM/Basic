package com.codes.Basic_class.User_Interaction;

import java.util.Scanner;

public class ScannerKeyBoardTest {
    public static void main(String[] args) {
//        System.in代表标准输入，也就是键盘输入
        Scanner scanner = new Scanner(System.in);
//        只把回车作为分隔符,默认为(空格、Tab空白、回车)
        scanner.useDelimiter("\n");
        while (scanner.hasNext()){
            System.out.println("键盘输入的内容：" + scanner.next());
        }

    }
}
