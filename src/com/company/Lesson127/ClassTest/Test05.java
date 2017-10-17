package com.company.Lesson127.ClassTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by User on 16.10.2017.
 * Sorting.
 */
public class Test05 {
  static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int [] array = new int[10];
        array = sortArray(array);
        sort(array);
        for (int i : array) {
            System.out.println(i);
        }
    }
    public static int[] sortArray(int [] array) throws IOException {
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        return array;
    }

    public static void sort(int [] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                int temp = array[j];
                if (array[j] < array[j+1]){
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    }
                }
            }
        }
    }

