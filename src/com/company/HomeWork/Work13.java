package com.company.HomeWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 10.02.2017.
 * /* Самая длинная строка
 * 1. Создай список строк.
 * 2. Считай с клавиатуры 5 строк и добавь в список.
 * 3. Используя цикл, найди самую длинную строку в списке.
 * 4. Выведи найденную строку на экран.
 * 5. Если таких строк несколько, выведи каждую с новой строки.
 */
public class Work13 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> array = new ArrayList<>();
        int stroka = 0;
        for (int i = 0; i < 5; i++) {
            array.add(reader.readLine());
            if (array.get(i).length() > stroka) {
                stroka = array.get(i).length();
            }
        }
        for (int i = 0; i < array.size(); i++) {
            if (stroka == array.get(i).length()) {
                System.out.println(array.get(i));
            }
        }


    }
}

