package com.company.Lesson89;

/**
 * Created by user on 12.05.2017.
 * /* Метод должен вернуть номер строки кода, из которого вызвали этот метод
 Написать пять методов, которые вызывают друг друга.
 Метод должен вернуть номер строки кода, из которого вызвали этот метод.
 Воспользуйся функцией: element.getLineNumber().
 */
public class Test03 {
    public static void main(String[] args) {
        stackTrace1();
    }
    public static int stackTrace1(){
        stackTrace2();
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        System.out.println(elements[2].getLineNumber());
        return elements[2].getLineNumber();
    }
    public static int stackTrace2(){
        stackTrace3();
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        System.out.println(elements[2].getLineNumber());
        return elements[2].getLineNumber();
    }
    public static int stackTrace3(){
        stackTrace4();
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        System.out.println(elements[2].getLineNumber());
        return elements[2].getLineNumber();
    }
    public static int stackTrace4(){
        stackTrace5();
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        System.out.println(elements[2].getLineNumber());
        return elements[2].getLineNumber();
    }
    public static int stackTrace5(){
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        System.out.println(elements[2].getLineNumber());
        return elements[2].getLineNumber();
    }
}
