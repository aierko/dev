package com.company.Lesson69;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user on 13.03.2017.
 * Sorting down
 */
public class Test02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int [] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        sortin(array);
        for (int i : array) {
            System.out.println(i);
        }

    }
    public static void sortin(int [] array){
        for (int i = 0; i < array.length -1; i++) {
            for (int j = 0; j < array.length - 1 ; j++) {
                if (array[j] < array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
}
