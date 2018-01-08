package com.company.HomeWork;

/**
 * Created by user on 25.01.2017.
 *//*Реализуй метод public static void salary(int a).
        Метод должен увеличить переданное число на 100 и вывести на экран надпись:
         «Твоя зарплата составляет: a долларов в месяц.».
        Где a - это число, которое увеличили на 100.
*/
public class Salary {
    public static void main(String[] args) {
        salary(300);
    }

    public static void salary(int a) {
        String j = "Твоя зарплата составляет: " + (a + 100) + " долларов в месяц.";
        System.out.println(j);
    }
}



