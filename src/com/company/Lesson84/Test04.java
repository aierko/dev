package com.company.Lesson84;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Задача по алгоритмам
 * Задача: Ввести с клавиатуры 5 слов и выведи их в алфавитном порядке.
 */
public class Test04 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String[] words = new String[3];
        for (int i = 0; i < 3; i++) {
            words[i] = reader.readLine();
        }
        sortLeter(words);
        for (String word : words) {
            System.out.println(word);
        }
    }

    private static void sortLeter(String[] array) { // b c a -> b a c -> a b c
        for (int i = 0; i < array.length - 1; ) {//?
            String temp = null;
            if (alfavit(array[i+1], array[i])) {   //?
                temp = array[i+1];
                array[i+1] = array[i];
                array[i] = temp;
                if (i > 0) i--;
            } else i++;                          //?


        }
    }

    private static boolean alfavit(String a, String b) {
        return a.compareTo(b) > 0;
    }
}
