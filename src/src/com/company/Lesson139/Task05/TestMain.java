package com.company.Lesson139.Task05;

/**
 * Created by User on 08.12.2017.
 */
public class TestMain {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Printer("First"));
        thread.start();
        thread.join();
        Thread thread1 = new Thread(new Printer("Second"));
        thread1.start();
    }
}
