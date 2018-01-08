package com.company.Lesson61;

import java.util.Date;

/**
 * Created by user on 15.02.2017.
 * Вывести на экран, прошедшие дни с начала года!
 */
public class Test05 {
    public static void main(String[] args) {
        Date daySn = new Date();
        daySn.setDate(1);
        daySn.setMonth(0);
        daySn.setHours(0);
        daySn.setMinutes(0);
        daySn.setSeconds(0);
        Date dayFn = new Date();
        long sumTime = dayFn.getTime() - daySn.getTime();
        long day = 24 * 60 * 60 * 1000;
        System.out.println(sumTime/day);
    }
}
