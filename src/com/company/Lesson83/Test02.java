package com.company.Lesson83;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user on 24.04.2017.
 * /* Задача по алгоритмам
 * Задача: Ввести с клавиатуры 10 слов и вывести их в алфавитном порядке.
 */
public class Test02 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String[] word = new String[5];
        for (int i = 0; i < 5; i++) {
            word[i] = reader.readLine();
        }
        sort(word);
        for (String s : word) {
            System.out.println(s);
        }
    }

    private static void sort(String[] words) throws IOException {
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = 0; j < words.length - 1 - i; j++) {
                if (isGreaterThen(words[j], words[j + 1])) {
                    String temp = words[j];
                    words[j] = words[j+1];
                    words[j+1] = temp;
                }
            }
        }
    }

    private static boolean isGreaterThen(String a, String b) {
        return a.compareTo(b) > 0;
    }

}
