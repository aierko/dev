package com.company.Lesson19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user on 28.10.2016.
 *//* Максимальное среди массива на 20 чисел
1. В методе initializeArray():
1.1. Создайте массив на 5 чисел
1.2. Считайте с консоли 5 чисел и заполните ими массив
2. Метод max(int[] array) должен находить максимальное число из элементов массива
*/
public class Test02 {
    public static void main(String[] args) throws IOException {
        int[] array1 = initializeArray();
        System.out.println(max(array1));
    }

    public static int[] initializeArray() throws IOException {
        int[] array = new int[5];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        return array;
    }

    public static int max(int[] arr) {
        int a = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < a) {
                a = arr[i];
            }
        }
        return a;

    }
}