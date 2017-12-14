package com.company.Lesson139.Task05;

/**
 * Created by User on 08.12.2017.
 */
public class Printer implements Runnable {
    String name;

    public Printer(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("It's run method " + this.name);
    }
}
