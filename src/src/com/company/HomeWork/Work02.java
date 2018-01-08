package com.company.HomeWork;

/**
 * Created by user on 09.09.2016.
 */
//Реализуй метод public static void salary(int a).
//Метод должен увеличить переданное число на 100 и вывести на экран надпись:
// «Твоя зарплата составляет: a долларов в месяц.». Где a - это число, которое увеличили на 100.
public class Work02 {
    public static void main(String[] args) {
        salary(400);
    }
    public static void salary(int a){
        String g = (" твоя зарплата составляет " + (a + 100) +" в місяць");
        System.out.println(g);
    }

}
