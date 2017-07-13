package com.company.Lesson90;

/**
 * Created by user on 15.05.2017.
 * /* Исключение при работе с числами
 Перехватить исключение (и вывести его на экран),
 указав его тип, возникающее при выполнении кода:
 int a = 42 / 0;
 */
public class Test03 {
    public static void main(String[] args) {
        try {
            int a = 42 / 0;
            System.out.println(a);
        }
        catch ( ArithmeticException exception){
            System.out.println("Exception1 has been handled ");
        }

        }

    }

