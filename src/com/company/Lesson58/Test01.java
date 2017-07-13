package com.company.Lesson58;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user on 08.02.2017.
 * Сортировка в возрастающем порядке
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int [] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        sort(array);
        for (int i = 0; i <array.length; i++) {
            System.out.println(array[i]);
        }
    }
    public static void sort(int [] array1){
        for (int i = 0; i > array1.length-1; i++) {
            for ( int j = 0; j > array1.length-1; j++){
                if (array1[j] > array1[j + 1]){ // [0]10 > [1]5
                    int temp = array1[j]; //10          // temp = 10
                    array1[j] = array1[j+1];       // [0] = 5
                    array1[j+1] = temp;             // [1] = 10
                }
            }
        }
    }
}
