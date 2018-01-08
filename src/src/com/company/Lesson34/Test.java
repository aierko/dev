package com.company.Lesson34;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user on 07.12.2016.
 *//* Минимальное из N чисел
1. Ввести с клавиатуры число N.
2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
3. Найти минимальное число среди элементов списка - метод getMinimum.

3
23
45
12
*/
public class Test {
    public static void main(String[] args) throws IOException {
        int [] arr = getIntegerList();
        int n = getMin(arr);
        System.out.println(n);
    }

    public static int[] getIntegerList() throws IOException {
        int[] array = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        return array;
    }

    public static int getMin(int[] arr1){
        int n = arr1[0];
        for (int i = 0; i < arr1.length; i++) {
            if(n<arr1[i]){
                n = arr1[i];
            }
        }
        return n;
    }
}
