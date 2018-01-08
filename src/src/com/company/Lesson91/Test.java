package com.company.Lesson91;

/**
 * /* Исключение при работе с числами
 Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
 int a = 42 / 0;
 */
public class Test {
    public static void main(String[] args) {
        try {
            int a = 42 / 0;
        }
        catch(ArithmeticException e){
            System.out.println("car don't go");
        }

    }

}
