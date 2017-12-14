package com.company.Lesson139.Task04;

/**
 * Created by User on 08.12.2017.
 */
public class Test01 {
    public static void main(String[] args) {
        Printer printer = new Printer();
        Thread thread1 = new Thread(printer);
        thread1.start();
        printer.run();
        System.out.println("printer started");
        System.out.println("Main thread finished");
        Thread thread2 = new Thread(printer);
        thread2.start();
        Printer2 newPrinter = new Printer2();
        newPrinter.start();
    }
}
