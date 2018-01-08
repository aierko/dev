package com.company.Lesson16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user on 21.10.2016.
 *//* Максимальное среди массива на 10 чисел
1. В методе initializeArray():
1.1. Создайте массив на 10 чисел
1.2. Считайте с консоли 10 чисел и заполните ими массив
2. Метод max(int[] array) должен находить максимальное число из элементов массива
*/
public class Test06 {
    public static void main(String[] args) throws IOException {
        int[] array = initializeArray();
        System.out.println(max(array));
    }

    public static int[] initializeArray() throws IOException {
        int[] q = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < q.length; i++) {
            q[i] = Integer.parseInt(reader.readLine());
        }
        return q;
    }

    public static int max(int[] arr){
        int max = arr[0];
        for (int i = 0; i <arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }

        }
       return max;
    }

}
