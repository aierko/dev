package com.company.Lesson24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 11.11.2016.
 *//* Удали последнюю строку и вставь её в начало
1. Создай список строк.
2. Добавь в него 5 строчек с клавиатуры.
3. Удали последнюю строку и вставь её в начало. Повторить 8 раз.
4. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/
public class Test02 {
    public static void main(String[] args) throws IOException {
        List<String> arrr = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            arrr.add(reader.readLine());
        }
        for (int i = 0; i < arrr.size(); i++) {
            String s = arrr.remove(arrr.size() - 1);
            arrr.add(0, s);
        }
        for (int i = 0; i < arrr.size(); i++) {
            System.out.println(arrr.get(i));
        }

    }
}
