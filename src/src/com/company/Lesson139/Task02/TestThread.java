package com.company.Lesson139.Task02;

/**
 * Created by User on 08.12.2017.
 */
public class TestThread extends Thread {

    static {
        System.out.println("It's static block inside TestThread");
    }


    @Override
    public void run() {
        System.out.println("It's run method");
    }
}