package com.company.Repitt;

import java.util.Date;

/**
 * Created by user on 20.02.2017.
 * высчиать время работы программы, в мл/с.
 */
public class Test01 {
    public static void main(String[] args) throws InterruptedException {
        Date time1 = new Date();
        Thread.sleep(3000);

        Date time2 = new Date();

        long sTime = time2.getTime() - time1.getTime();
        System.out.println(sTime/1000);

}
}
