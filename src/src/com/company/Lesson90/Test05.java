package com.company.Lesson90;

/**
 * Created by user on 15.05.2017./* Исключение при работе с массивами
 Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
 int[] m = new int[2];
 m[8] = 5;
 */
public class Test05 {
    public static void main(String[] args) {
        try {
            int[] m = new int[10];
            m[8] = 5;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(" handled");
        }
    }
}
