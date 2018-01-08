package com.company.NewDate;

import java.util.Date;

/**
 * Created by user on 17.02.2017.
 * Склолько времени прошло с начала текущего дня.
 */
public class Test01 {
    public static void main(String[] args) {
        Date timeBegin = new Date();

        long hours = timeBegin.getHours();
        long minuts = timeBegin.getMinutes();
        long seconds = timeBegin.getSeconds();

        System.out.println(hours + ":" + minuts + ":" + seconds);
    }
}
