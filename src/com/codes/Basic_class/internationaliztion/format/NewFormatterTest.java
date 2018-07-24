package com.codes.Basic_class.internationaliztion.format;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class NewFormatterTest {
    public static void main(String[] args) {
        DateTimeFormatter[] dtf = new DateTimeFormatter[]{
                DateTimeFormatter.ISO_LOCAL_DATE,
                DateTimeFormatter.ISO_LOCAL_TIME,
                DateTimeFormatter.ISO_LOCAL_DATE_TIME,
                DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.MEDIUM), DateTimeFormatter.ofLocalizedTime(FormatStyle.LONG),
                DateTimeFormatter.ofPattern("Gyyyy%%MMM%%dd HH:mm:ss")
        };
        LocalDateTime dateTime = LocalDateTime.now();

        for(int i = 0; i < dtf.length; ++i) {
            System.out.println(dateTime.format(dtf[i]));
        }

    }
}
