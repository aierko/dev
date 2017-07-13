package com.company.Lesson88;

/**
 * Created by user on 12.05.2017.
 * Написать пять методов, которые вызывают друг друга.
 Каждый метод должен возвращать имя метода, вызвавшего его, полученное с помощью StackTrace.
 */
public class NameStack {
    public static void main(String[] args) {
        stack();
    }
    public static String stack(){
        stack1();
        StackTraceElement[] element = Thread.currentThread().getStackTrace();
        System.out.println(element[2]);
        return element[2].getMethodName();
    }
    public static String stack1(){
        stack2();
        StackTraceElement[] element = Thread.currentThread().getStackTrace();
        System.out.println(element[2]);
        return element[2].getMethodName();
    }
    public static String stack2(){
        stack3();
        StackTraceElement[] element = Thread.currentThread().getStackTrace();
        System.out.println(element[2].getMethodName());
        return element[2].getMethodName();
    }
    public static String stack3(){
        stack4();
        StackTraceElement[] element = Thread.currentThread().getStackTrace();
        System.out.println(element[2].getMethodName());
        return element[2].getMethodName();
    }
    public static String stack4(){
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        System.out.println(elements[2].getMethodName());
        return elements[2].getMethodName();
    }


}
