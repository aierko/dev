package com.company.Lesson61;

import java.util.Date;

/**
 * Created by user on 15.02.2017.
 */
public class Test02 {
    public static void main(String[] args) throws InterruptedException {
        Date firstDate = new Date();

        Thread.sleep (5000);

        Date lustDate = new Date();

        long summerTime = lustDate.getTime() - firstDate.getTime();
        System.out.println(summerTime/1000);
    }
}
