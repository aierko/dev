package com.company.Lesson88;

/**
 * Created by user on 10.05.2017./* Каждый метод должен возвращать свой StackTrace
 Написать пять методов, которые вызывают друг друга. Каждый метод должен возвращать свой StackTrace.
 */
public class StackTr {
    public static void main(String[] args) {
           stack();
    }
    public static StackTraceElement[] stack(){
        stack1();
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        return elements;
    }
    public static StackTraceElement[] stack1(){
        stack2();
        StackTraceElement[] elements1 = Thread.currentThread().getStackTrace();
        return elements1;
    }
    public static StackTraceElement[] stack2(){
        stack3();
         StackTraceElement[] elements3 = Thread.currentThread().getStackTrace();
        return elements3;
    }
    public static StackTraceElement[] stack3(){
        stack4();
        StackTraceElement[] elements4 = Thread.currentThread().getStackTrace();
        return elements4;
    }
    public static StackTraceElement[] stack4(){
        StackTraceElement[] elements4 = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : elements4) {
            System.err.println(element);
        }
        return elements4;
    }
}