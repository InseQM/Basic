package com.codes.Basic_class.Date;

import java.time.Clock;
import java.time.Duration;

public class NewDatePackageTest {
    public static void main(String[] args) {
        Clock clock = Clock.systemUTC();
        System.out.println("当前时刻为：" + clock.instant());
        System.out.println(clock.millis() == System.currentTimeMillis());
        Duration duration = Duration.ofSeconds(6000L);
        System.out.println("6000秒相当于：" + duration.toMinutes() + " minutes");
        System.out.println("6000秒相当于：" + duration.toHours() + " hours");
        System.out.println("6000秒相当于：" + duration.toDays() + " days");
        Clock clock1 = Clock.offset(clock, duration);
        System.out.println("当前时刻加6000秒为：" + clock1.instant());
    }
}
