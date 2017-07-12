package com.company.Lesson103;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 10.07.2017.
 * /* Задача по алгоритмам
 * Задача: Ввести с клавиатуры 10 слов и выведи их в алфавитном порядке.
 */
public class Test {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();
        spisok(list);
        voc(list);
        for (String s : list) {
            System.out.println(s);
        }

 //       String[] array = list.toArray(new String[list.size()]);

    }

    public static void spisok(List<String> list) throws IOException {
        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }
    }

    public static void voc(List<String> list) throws IOException {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - 1; j++) {
                if (com(list.get(j), list.get(j + 1))) {
                    String temp = list.get(j + 1);
                    list.set(j+1, list.get(j));
                    list.set(j, temp);
                }
            }
        }
    }

    private static boolean com(String a, String b) {
        return a.compareTo(b) > 0;
    }
}
