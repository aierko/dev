package com.company.Lesson61;

import java.util.Date;

/**
 * Created by user on 15.02.2017.
 * вывести время участника на экран перед и после проигрыша.
 */
public class Test03 {
    public static void main(String[] args) throws InterruptedException {
        Date startDate = new Date();

        long msTimer = startDate.getTime() + 5000;
        Date timer = new Date(msTimer);

        Thread.sleep(3000);

        Date currentDate = new Date();
        if(currentDate.after(timer)){
            System.out.println("You lose!");
        } else {
            System.out.println("You win!");
        }
    }
}
