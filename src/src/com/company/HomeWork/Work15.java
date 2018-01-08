package com.company.HomeWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 13.02.2017.
 * /* Удали последнюю строку и вставь её в начало
 * 1. Создай список строк.
 * 2. Добавь в него 5 строчек с клавиатуры.
 * 3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.
 * 4. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
 */
public class Work15 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());
        }
        for (int i = 0; i < 13; i++) {
            String b = list.remove(list.size() - 1);
            list.add(0, b);

        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

}

