package com.company.Lesson84;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user on 28.04.2017.
 * /**
 * Задача по алгоритмам
 * Задача: Ввести с клавиатуры 5 слов и выведи их в алфавитном порядке.

 */
public class Test05 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String [] array = new String[5];
        for (int i = 0; i < 5; i++) {
            array[i] = reader.readLine();
        }
        sort(array);
        for (String s : array) {
            System.out.println(s);
        }
    }
    private static void sort(String [] words){
        for (int i = 0; i < words.length - 1;) {
            if (alfavit(words[i], words[i+1])){
                String temp = words[i];
                words[i] = words[i+1];
                words[i+1] = temp;
                if (i > 0) i--;
            } else i++;
        }
    }
    private static boolean alfavit(String a, String b){
        return b.compareTo(a) >0;
    }
}
