package com.company.NewDate;

import java.util.Date;

/**
 * Created by user on 17.02.2017.
 * просчитайте время работы программы и выведите его на экран.
 */
public class Test02 {
    public static void main(String[] args) throws InterruptedException {
        Date timeon = new Date();

        Thread.sleep(4000);

        Date timeof = new Date();

        long pause = timeof.getTime() - timeon.getTime();
        System.out.println(pause/1000);
    }
}
