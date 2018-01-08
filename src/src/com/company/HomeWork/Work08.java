package com.company.HomeWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user on 29.01.2017.
 * /* Максимальное среди массива на 10 чисел
 * 1. В методе initializeArray():
 * 1.1. Создайте массив на 10 чисел
 * 1.2. Считайте с консоли 10 чисел и заполните ими массив
 * 2. Метод max(int[] array) должен находить максимальное число из элементов массива
 */

public class Work08 {
    public static void main(String[] args) throws IOException {
        int[] aro = initializeArray();
        System.out.println(max(aro));

    }

    public static int [] initializeArray() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int [] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        return array;
    }

        public static int max(int[] array2) {
        int arr1 = array2[0];
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] > arr1) {
                arr1 = array2[i];
            }
        }
     return arr1;
    }
}