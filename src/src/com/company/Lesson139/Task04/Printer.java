package com.company.Lesson139.Task04;

/**
 * Created by User on 08.12.2017.
 */
public class Printer implements Runnable {
    @Override
    public void run() {
        System.out.println("I am Printer");
        System.out.println("Printer thread finished");
    }
}
