package com.company.Lesson61;

import java.util.Date;

/**
 * Created by user on 15.02.2017.
 * Вывести на экран прошедшее время, с начала текущего дня.
 */
public class Test04 {
    public static void main(String[] args) {
        Date begin = new Date();
        long timeOn = begin.getHours();
        long minuts = begin.getMinutes();
        long seconds = begin.getSeconds();
        System.out.println(timeOn + ":" + minuts + ":" + seconds);
    }
}
