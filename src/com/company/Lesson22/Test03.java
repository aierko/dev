package com.company.Lesson22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 08.11.2016.
 *//* Самая длинная строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Test03 {
    public static void main(String[] args) throws IOException {
        List<String> array = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            array.add(reader.readLine());
        }
        int maxLenght = 0;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).length() > maxLenght) {
                maxLenght = array.get(i).length();
            }
        }
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).length() == maxLenght) {
                System.out.println(array.get(i));
            }
        }
    }
}
