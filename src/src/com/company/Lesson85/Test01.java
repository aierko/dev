package com.company.Lesson85;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user on 03.05.2017.
 * /* Задача по алгоритмам
 * Задача: Ввести с клавиатуры 10 слов и выведи их в алфавитном порядке.
 */
public class Test01 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String[] words = new String[10];
        for (int i = 0; i < 10; i++) {
            words[i] = reader.readLine();
        }
        poisk(words);
        for (String word : words) {
            System.out.println(word);
        }
    }

    private static void poisk(String[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (bukvi(array[j], array[j+1])){
                    String temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    private static boolean bukvi(String a, String b) {
        return a.compareTo(b) > 0;
    }
}
