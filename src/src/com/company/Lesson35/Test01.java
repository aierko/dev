package com.company.Lesson35;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user on 09.12.2016.
 *//* Максимальное и минимальное числа в массиве
Создать массив на 10 чисел. Заполнить его числами с клавиатуры. Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
*/
public class Test01 {
    public static void main(String[] args) throws IOException {
        int[] array = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        int b = array[0];
        int a = array[0];
        for (int i = 0; i < array.length; i++) {
            if (a < array[i]) {
                a = array[i];
            }
            if (b > array[i]) {
                b = array[i];


            }
        }
        System.out.println(a + " " + b);
    }
}