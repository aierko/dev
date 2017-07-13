package com.company.Lesson77;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user on 31.03.2017.
 * /* Пять наибольших чисел
 Создать массив на 10 чисел. Заполнить его числами с клавиатуры. Вывести пять наибольших чисел.
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int [] start = new int[10];
        for (int i = 0; i < 10; i++) {
            start[i] = Integer.parseInt(reader.readLine());
        }
        sameBigly(start);
        for (int i = start.length - 5; start.length > i; i++) {
            System.out.println(start[i]);
        }
    }
    public static void sameBigly(int [] big){
        for (int i = 0; i < big.length-1; i++) {
            for (int j = 0; j <big.length-1 ; j++) {
                if (big[j] > big[j+1]){
                    int temp = big[j];
                    big[j] = big[j+1];
                    big[j+1] = temp;
                }
            }
        }
    }
}
