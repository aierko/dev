package com.company.Lesson87;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user on 08.05.2017.
 * Задача: Ввести с клавиатуры 10 слов и выведи их в алфавитном порядке.
 */
public class Test01 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        String[] words = new String[10];
        words(words);
        sorting(words);
        for (String s : words) {
            System.out.println(s);
        }
    }
    public static String[] words(String[] words) throws IOException {
        for (int i = 0; i < 10; i++) {
            words[i] = reader.readLine();
        }
        return words;
    }
    private static boolean trueth(String a,String b){
        return a.compareTo(b) > 0;
    }
    private static void sorting(String[] array){
        for (int i = 0; i < array.length - 1; ) {
            if (trueth(array[i], array[i+1])){
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
}
