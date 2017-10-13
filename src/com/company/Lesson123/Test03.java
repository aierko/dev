package com.company.Lesson123;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by User on 08.10.2017.
 */
public class Test03 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int[] array = new int[10];
        array = arrayNumbers(array);
        sortArray(array);
        for (int i : array) {
            System.out.println(i);
        }
    }

    public static int[] arrayNumbers(int[] array) throws IOException {
        for (int i = 0; i < 10; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        return array;
    }

    public static void sortArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                int temp = array[j + 1];
                if (array[j] < array[j + 1]){
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}

