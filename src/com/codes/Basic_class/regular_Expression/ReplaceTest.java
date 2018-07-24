package com.codes.Basic_class.regular_Expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceTest {
    public static void main(String[] args) {
        String[] msgs = new String[]{"Java has regular expressions in 1.4", "regular expressions now expressing in Java", "Java represses oracular expressions"};
        Pattern pattern = Pattern.compile("re\\w*");
        Matcher matcher = null;

        for(int i = 0; i < msgs.length; ++i) {
            if (matcher == null) {
                matcher = pattern.matcher(msgs[i]);
            } else {
                matcher.reset(msgs[i]);
            }

            System.out.println(matcher.replaceAll("haha!:)"));
        }

    }
}
