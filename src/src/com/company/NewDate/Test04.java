package com.company.NewDate;

import java.util.Date;

/**
 * Created by user on 17.02.2017.
 *Сколько дней прошло с начала года.
 */
public class Test04 {
    public static void main(String[] args) {
        Date currentDate = new Date();
        Date newYearDate = new Date();

        newYearDate.setDate(1);
        newYearDate.setMonth(0);
        newYearDate.setHours(0);
        newYearDate.setMinutes(0);
        newYearDate.setSeconds(0);
        long date = currentDate.getTime() - newYearDate.getTime();
        long sumDate = 24*60*60*1000;
        System.out.println(date/sumDate);
    }

}
