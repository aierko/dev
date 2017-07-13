package com.company.Lesson52;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user on 23.01.2017.
 *//* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 10 чисел и выводит их в возрастающем порядке.
*/
public class Test02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int [] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }
        sort(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void sort (int [] array){ // 54 12 27 -> 12 54 27 ->
        for (int i = 0; i < array.length - 1; i++) {          // i = 0,
            for (int j = 0; j < array.length - i - 1; j++) {  // j = 0,
                if (array[j] > array[j + 1]){                 // 54 > 12
                    int temp = array[j];                      // temp = 54
                    array[j] = array[j + 1];                  // [0] = 12
                    array[j + 1] = temp;                      // [1] = 54
                }
            }
        }
    }
}
