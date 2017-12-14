package com.company.Lesson139.Task06;

/**
 * Created by User on 12.12.2017.
 */
public class HeadMethod {
    public static void main(String[] args) throws InterruptedException {
        PrintListTread tread1 = new PrintListTread("Fug");
        PrintListTread tread2 = new PrintListTread("SKF");
        tread1.start();
        tread1.join();
        tread2.start();
    }
}
