package com.company.Lesson88;

/**
 * Created by user on 10.05.2017.
 *
 * Stack - LIFO
 */
public class Test01 {
    public static void main(String[] args) {
        m();
    }

    static void m() {
        m1();
    }

    static void m1() {
        m2();
    }

    static void m2() {
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : elements) {
            System.err.println(element);
        }
    }
}
