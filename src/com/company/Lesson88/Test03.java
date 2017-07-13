package com.company.Lesson88;

/**
 * Created by user on 10.05.2017./* И снова StackTrace
 Написать пять методов, которые вызывают друг друга.
 Каждый метод должен возвращать имя метода, вызвавшего его, полученное с помощью StackTrace.
 */
public class Test03 {
    public static void main(String[] args) {
        stackTraceElements1();
    }
    public static String stackTraceElements1(){
        stackTraceElements2();
        StackTraceElement [] elements = Thread.currentThread().getStackTrace();
        System.out.println(elements[2]);
        return elements[2].getMethodName();
    }
    public static String stackTraceElements2(){
        stackTraceElements3();
        StackTraceElement[] elements1 = Thread.currentThread().getStackTrace();
        System.out.println(elements1[2].getMethodName());
        return elements1[2].getMethodName();
    }
    public static String stackTraceElements3(){
        stackTraceElements4();
        StackTraceElement[] elements2 = Thread.currentThread().getStackTrace();
        System.out.println(elements2[2].getMethodName());
        return elements2[2].getMethodName();
    }
    public static String stackTraceElements4(){
        stackTraceElements5();
        StackTraceElement[] elements3 = Thread.currentThread().getStackTrace();
        System.out.println(elements3[2].getMethodName());
        return elements3[2].getMethodName();
    }
    public static String stackTraceElements5(){
        StackTraceElement[] elements4 = Thread.currentThread().getStackTrace();
        System.out.println(elements4[2].getMethodName());
        return elements4[2].getMethodName();
    }
}
