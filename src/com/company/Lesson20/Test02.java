package com.company.Lesson20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user on 02.11.2016.
 *//* Максимальное среди массива на 20 чисел
1. В методе initializeArray():
1.1. Создайте массив на 20 чисел
1.2. Считайте с консоли 20 чисел и заполните ими массив
2. Метод max(int[] array) должен находить максимальное число из элементов массива
*/
public class Test02 {
    public static void main(String[] args) throws IOException {
        int[] array = initializeArray();
        System.out.println(max(array));
    }
    public static int[] initializeArray() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array1 = new int[5];
        for (int i = 0; i <array1.length; i++) {
            array1[i] = Integer.parseInt(reader.readLine());
        }
        return array1;
    }
    public static int max(int[] arr){
        int max =  arr[0];
        for (int i = 0; i <arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }

        }
        return max;
    }

}
