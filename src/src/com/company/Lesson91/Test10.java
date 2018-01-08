package com.company.Lesson91;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user on 17.05.2017.
 * Sorting words.
 */
public class Test10 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        String[] array = new String[10];
        mass(array);
        sort(array);
        for (String s : array) {
            System.out.println(s);
        }
    }
    public static void mass(String[] array) throws IOException {
        for (int i = 0; i < array.length; i++) {
            array[i] = reader.readLine();
        }
    }
    private static void sort(String[] array){
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length-1-i ; j++) {
               if (compar(array[j], array[j+1])){     //
                   String temp = array[j];              //
                   array[j] = array[j+1];
                   array[j+1] = temp;
               }
            }
        }
    }
    private static boolean compar(String a,String b){
        return a.compareTo(b) >0;
    }

}
