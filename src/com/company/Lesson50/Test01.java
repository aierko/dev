package com.company.Lesson50;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user on 18.01.2017.
 *//* Максимальное среди массива на 20 чисел
1. В методе initializeArray():
1.1. Создайте массив на 5 чисел
1.2. Считайте с консоли 5 чисел и заполните ими массив
2. Метод max(int[] array) должен находить максимальное число из элементов массива
*/
public class Test01 {
    public static void main(String[] args) throws IOException {
        int[] arr = initializeArarray();
        System.out.println (max(arr));
    }

    public static int[] initializeArarray() throws IOException {
        int[] arr = new int[5];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }
        return arr;
    }

    public static int max(int[] array) {
        int a = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > a) {
                a = array[i];
            }
        }
        return a;
    }


}
