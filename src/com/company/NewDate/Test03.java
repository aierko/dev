package com.company.NewDate;

import java.util.Date;

/**
 * Created by user on 17.02.2017.
 * Сделать таймер на пять секунд!
 */
public class Test03 {
    public static void main(String[] args) throws InterruptedException {
        Date user = new Date();

        long begin = user.getTime() + 5000;
        Date timer = new Date(begin);

        Thread.sleep(3000);
        Date user2 = new Date();
        if (user2.after(timer)){
            System.out.println("You lose");
        }
        else{
            System.out.println("You win");
        }
    }
}
