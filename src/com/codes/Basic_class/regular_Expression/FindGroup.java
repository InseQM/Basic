package com.codes.Basic_class.regular_Expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindGroup {
    public static void main(String[] args) {
        String string = "edfasijlk 13500006666asdsa1361112556512sadv15899903312";
        Matcher m = Pattern.compile("((13\\d)|(15\\d))\\d{8}").matcher(string);

        while(m.find()) {
            System.out.println(m.group());
        }

    }
}
