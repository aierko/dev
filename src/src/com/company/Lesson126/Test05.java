package com.company.Lesson126;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by User on 13.10.2017.
 * SORTING_ROOM
 */
public class Test05 {
    public static void main(String[] args) throws IOException {
      int [] array = new int[10];
      array = fillInArray(array);
      sortArray(array);
        for (int i : array) {
            System.out.println(i);
        }
    }

    public static int[] fillInArray(int[] array) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        return array;
    }

    public static void sortArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                 int temp = array[j];
                 if (array[j] > array[j+1]){
                     array[j] = array[j+1];
                     array[j+1]  = temp;
                 }
            }

        }
    }
}
