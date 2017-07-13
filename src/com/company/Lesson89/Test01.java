package com.company.Lesson89;

/**
 * Created by user on 12.05.2017.
 * /* Каждый метод должен возвращать свой StackTrace
 Написать пять методов, которые вызывают друг друга. Каждый метод должен возвращать свой StackTrace.
 */
public class Test01 {
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
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        return elements;
    }
    public static StackTraceElement[] stack2(){
        stack3();
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        return elements;
    }
    public static StackTraceElement[] stack3(){
        stack4();
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        return elements;
    }
    public static StackTraceElement[] stack4(){
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : elements) {
            System.err.println(element);
        }
        return elements;
    }



}
