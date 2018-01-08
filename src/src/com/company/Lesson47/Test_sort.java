package com.company.Lesson47;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user on 11.01.2017.
 */
public class Test_sort {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }

        sort(arr);

//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void sort(int[] array){ // 3 1 5 2 -> 1 3 5 2 -> 1 3 2 5
        for (int i = 0; i < array.length; i++) { // i = 0;
            for (int j = 0; j < array.length - 1; j++) { // j = 0; j = 1; j = 2
                if(array[j] > array[j + 1]){     // 3 > 1 t; 3 > 5 f; 5 > 2 t
                    int temp = array[j];         // temp = 3;  -;      temp = 5;
                    array[j] = array[j + 1];     // [0] = 1;   -;      [2] = 2;
                    array[j + 1] = temp;         // [1] = 3;   -;      [3] = 5;
                }
            }
        }
    }

}
