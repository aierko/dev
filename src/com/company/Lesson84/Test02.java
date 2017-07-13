package com.company.Lesson84;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user on 26.04.2017.
 */
public class Test02 {
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
        for (int i = 0; i < array.length - 1; ) {
            int s = i + 1;
            String temp = null;
            if (alfavitPoryadok(array[i], array[s])) {
                temp = array[s];
                array[s] = array[i];
                array[i] = temp;
                if (i > 0) i--;
            } else i++;
        }
    }

    private static boolean alfavitPoryadok(String a, String b) {
        return a.compareTo(b) > 0;
    }
}
