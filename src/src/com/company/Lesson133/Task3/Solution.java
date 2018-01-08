package com.company.Lesson133.Task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by User on 14.11.2017.
 * 1. Считывать строки(параметры) с консоли, пока пользователь не введет пустую строку(Enter).
 * 2. Каждый параметр соответствует имени кота.
 * Для каждого параметра:
 * 3. Создать объект cat класса Cat, который равен коту из getCatByKey(String параметр).
 * 4. Вывести на экран cat.toString().
 */
public class Solution {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        while (true) {
            String read = reader.readLine();
            if (read.equals("")) {
                break;
            }
            Cat1 cat = CatFactory.getCatByKey(read);
            System.out.println(cat.toString());
        }

    }
}

