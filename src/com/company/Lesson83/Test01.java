package com.company.Lesson83;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user on 24.04.2017.
 * /* Задача по алгоритмам
 * Задача: Ввести с клавиатуры 10 слов и вывести их в алфавитном порядке.
 */
public class Test01 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String[] words = new String[5];
        for (int i = 0; i < 5; i++) {
            words[i] = reader.readLine();
        }

        sort(words);

        for (String word : words) {
            System.out.println(word);
        }

    }

    private static void sort(String[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (isGreaterThen(array[j], array[j + 1])) {
                    String temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    private static boolean isGreaterThen(String s1, String s2) { // ketrin - 70 ,glory - 54 .....
        return s1.compareTo(s2) > 0;
    }
}
