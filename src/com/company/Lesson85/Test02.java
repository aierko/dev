package com.company.Lesson85;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user on 03.05.2017.
 * /* Задача по алгоритмам
 * Задача: Ввести с клавиатуры 10 слов и выведи их в алфавитном порядке.
 */
public class Test02 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {

    }

    public static void baza(String[] array) throws IOException {
        for (int i = 0; i < 10; i++) {
            array[i] = reader.readLine();
        }
    }

    private static void sort(String[] words) {
        for (int i = 0; i < words.length - 1; ) {
            if (poisk(words[i], words[i+1])){
                String temp = words[i];
                words[i] = words[i+1];
                words[i+1] = temp;
                if (i > 0) i--;
            } else i++;
        }
    }

    private static boolean poisk(String a, String b) {
        return a.compareTo(b) > 0;
    }
}
