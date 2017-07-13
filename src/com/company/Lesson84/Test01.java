package com.company.Lesson84;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user on 26.04.2017./* Задача по алгоритмам
 * Задача: Ввести с клавиатуры 10 слов и выведи их в алфавитном порядке.
 */
public class Test01 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String[] word = new String[5];
        for (int i = 0; i < 5; i++) {
            word[i] = reader.readLine();
        }
        sortWord(word);
        for (String s : word) {
            System.out.println(s);
        }
    }

    private static void sortWord(String[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (alfavitPoryadok(array[j], array[j + 1])) {
                    String temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    private static boolean alfavitPoryadok(String a, String b) {
        return a.compareTo(b) > 0;
    }

    private static boolean alfavitPoryadok1(String a, String b) {
        return a.compareTo(b) < 0;
    }
}
