package com.company.Lesson128.TestingOOP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by User on 20.10.2017.
 * Sorting//
 */
public class Test04Sort {
    public static void main(String[] args) throws IOException {
        int[] array = new int[5];
        array = fillIn(array);

        sort(array);

        for (int i : array) {
            System.out.println(i);
        }
    }

    public static int[] fillIn(int[] array) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        return array;
    }

    public static void sort(int[] array) {
        boolean flag = true;
        int count = 0;
        for (int i = 0; flag; i++) {
            count++;
            flag = false;
            for (int j = 0; j < array.length - 1 - i; j++) {
                int temp = array[j];
                if (array[j] < array[j + 1]) {
                    flag = true;
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println(count);
    }
}
