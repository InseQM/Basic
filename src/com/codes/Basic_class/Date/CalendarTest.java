package com.codes.Basic_class.Date;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest {
    public static void test01() {
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        Calendar calendar1 = Calendar.getInstance();
        calendar1.setTime(date);
    }

    public static void calendarDemo() {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get(1));
        System.out.println(calendar.get(2));
        System.out.println(calendar.get(5));
        calendar.set(2003, 10, 23, 12, 32, 23);
        System.out.println(calendar.getTime());
        calendar.add(1, -1);
        System.out.println(calendar.getTime());
        calendar.roll(2, -8);
        System.out.println(calendar.getTime());
    }

    public static void LenientTest() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2, 13);
        System.out.println(calendar.getTime());
        calendar.setLenient(false);
        calendar.set(2, 13);
        System.out.println(calendar.getTime());
    }

    public static void LazyTest() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2018, 7, 31);
        calendar.set(2, 8);
        calendar.set(5, 5);
        System.out.println(calendar.getTime());
    }
}
