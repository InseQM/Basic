package com.codes.Basic_class.regular_Expression;

import java.util.Arrays;

public class StringReg {
    public static void main(String[] args) {
        String[] msgs = new String[]{"Java has regular expressions in 1.4", "regular expressions now expressing in Java", "Java represses oracular expressions"};
        String[] var2 = msgs;
        int var3 = msgs.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            String msg = var2[var4];
            System.out.println(msg.replaceFirst("re\\w*", "haha:)"));
            System.out.println(Arrays.toString(msg.split(" ")));
        }

    }
}
