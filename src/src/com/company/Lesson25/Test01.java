package com.company.Lesson25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 15.11.2016.
 *//* Удали последнюю строку и вставь её в начало
1. Создай список строк.
2. Добавь в него 5 строчек с клавиатуры.
3. Удали последнюю строку и вставь её в начало. Повторить 18 раз.
4. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/
public class Test01 {
    public static void main(String[] args) throws IOException {
        List<String> array = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            array.add(reader.readLine());
        }
        for (int i = 0; i < 18; i++) {
            String s = array.remove(array.size() - 1);
            array.add(0, s);
        }
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }
        }
    }
