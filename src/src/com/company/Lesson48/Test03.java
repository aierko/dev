package com.company.Lesson48;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user on 13.01.2017.
 *//* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в убывающем порядке.
*/
public class Test03 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int t = array[j];
                    array[j] = array[j + 1]; // [0] = 8
                    array[j + 1] = t;        // [1] = 5
                }

            }
        }
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}

