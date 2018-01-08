package com.company.Lesson84;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user on 28.04.2017.
 * * /**
 * Задача по алгоритмам
 * Задача: Ввести с клавиатуры 5 слов и выведи их в алфавитном порядке.
 */
public class Test06 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String [] array = new String[5];
        for (int i = 0; i < 5; i++) {
            array[i] = reader.readLine();
        }
        sort(array);
        for (String s : array) {
            System.out.println(s);
        }
    }
    private static void sort(String [] array){
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (snosMozga(array[j], array[j+1])) {
                    String temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
    private static boolean snosMozga(String a, String b){
        return a.compareTo(b) > 0;
    }
}
