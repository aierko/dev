package com.company.NewDate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user on 17.02.2017.
 * SORTINGER
 */
public class Test05 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int array [] = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    public static void sort(int [] array){
        for (int i = 0; i < array.length-1 ; i++) { // 3 5 -> 5 3
            for (int j = 0; j < array.length-1-i ; j++) {
                if (array[j] < array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
}
