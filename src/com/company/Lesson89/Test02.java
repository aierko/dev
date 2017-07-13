package com.company.Lesson89;

/**
 * Created by user on 12.05.2017.
 * * И снова StackTrace
 Написать пять методов, которые вызывают друг друга. Каждый метод должен возвращать имя метода, вызвавшего его, полученное с помощью StackTrace.
 */
public class Test02 {
    public static void main(String[] args) {
        stackTraceElements();
    }
    public static String stackTraceElements(){
        stackTraceElements1();
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        System.out.println(elements[2].getMethodName());
        return elements[2].getMethodName();
    }
    public static String stackTraceElements1(){
        stackTraceElements2();
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        System.out.println(elements[2].getMethodName());
        return elements[2].getMethodName();
    }
    public static String stackTraceElements2(){
        stackTraceElements3();
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        System.out.println(elements[2].getMethodName());
        return elements[2].getMethodName();
    }
    public static String stackTraceElements3(){
        stackTraceElements4();
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        System.out.println(elements[2].getMethodName());
        return elements[2].getMethodName();
    }
    public static String stackTraceElements4(){
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        System.out.println(elements[2].getMethodName());
        return elements[2].getMethodName();
    }
}
