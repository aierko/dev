package com.company.Lesson119;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by User on 24.09.2017.
 */
public class Test02 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
       int [] array = new int[10];
       chisla(array);
       sort(array);
        for (int i : array) {
            System.out.println(i);
        }
    }

    public static int[] chisla(int[] array) throws IOException {
        for (int i = 0; i < 10; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        return array;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                int temp = array[i];
                if (array[i] > array[j + 1]){
                    array[i+1] = array[i];
                    array[i] = temp;
                }
            }
        }
    }
}
