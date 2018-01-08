package com.company.Lesson89;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user on 12.05.2017.
 * Задача: Ввести с клавиатуры 10 слов и выведи их в алфавитном порядке.
 */
public class Test05 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
     String[] words = new String[5];
        slova(words);
        sort(words);
        for (String word : words) {
            System.out.println(word);
        }
    }
    public static void slova(String[] massiv) throws IOException {
        for (int i = 0; i < 5; i++) {
            massiv[i] = reader.readLine();
        }
    }
    private static void sort(String[]array){
        for (int i = 0; i < array.length - 1; ) {
            if (holder(array[i], array[i+1])){
                String temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp;
                if (i > 0){
                    i--;
                }
            }
            else i++;

        }

    }
    private static boolean holder(String a, String b){
        return a.compareTo(b) > 0;
    }
}
