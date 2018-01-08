package com.company.Lesson86;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user on 05.05.2017.
 * /* Задача по алгоритмам
 Задача: Ввести с клавиатуры 10 слов и выведи их в алфавитном порядке.
 */
public class Nofor {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        String [] word = new String[10];
        words(word);
        sort(word);
        for (String s : word) {
            System.out.println(s);
        }
    }
    public static void words(String [] words) throws IOException {
        for (int i = 0; i < 10; i++) {
            words[i] = reader.readLine();
        }
    }
    private static void sort(String[] array){
        for (int i = 0; i < array.length - 1; ) { // b c a -> b c a -> b a c -> a b c
         if (poisk(array[i], array[i+1])){
             String temp = array[i];
             array[i] = array[i+1];
             array[i+1] = temp;
            if (i > 0){
                i--;
            }
         } else i++;

        }
    }
    private static boolean poisk(String a, String b){
        return a.compareTo(b) >0;
    }
}
