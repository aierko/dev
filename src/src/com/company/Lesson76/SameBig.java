package com.company.Lesson76;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by user on 29.03.2017./* Пять наибольших чисел
 * Создать массив на 10 чисел. Заполнить его числами с клавиатуры. Вывести пять наибольших чисел.
 */
public class SameBig {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = Integer.parseInt(reader.readLine());
        }
        sort(a);
    }

    public static void sort(int[] a) {
        Arrays.sort(a);
        for (int i = a.length - 5; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

}
