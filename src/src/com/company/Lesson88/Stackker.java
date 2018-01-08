package com.company.Lesson88;

/**
 * Created by user on 12.05.2017.
 * /* Каждый метод должен возвращать свой StackTrace
 Написать пять методов, которые вызывают друг друга. Каждый метод должен возвращать свой StackTrace.
 */
public class Stackker {
    public static void main(String[] args) {
        mass();
    }
    public static StackTraceElement[] mass() {
        mass1();
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        return stackTrace;
    }
    public static StackTraceElement[] mass1(){
        mass2();
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        return stackTrace;
    }
    public static StackTraceElement[] mass2(){
        mass3();
        StackTraceElement [] stackTrace = Thread.currentThread().getStackTrace();
        return stackTrace;
    }
    public static StackTraceElement[] mass3(){
        mass4();
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        return stackTrace;
    }
    public static StackTraceElement[] mass4(){
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : stackTrace) {
            System.err.println(element);
        }
        return stackTrace;
    }
}
