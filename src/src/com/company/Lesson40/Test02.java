package com.company.Lesson40;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 21.12.2016.
 *//* Новая задача: Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
Потом программа строит новый список. Если в строке чётное число букв, строка удваивается, если нечётное – утраивается.
Программа выводит содержимое нового списка на экран.
Пример ввода:
Кот
Коты
Я
Пример вывода:
Кот Кот Кот
Коты Коты
Я Я Я
*/
public class Test02 {
    public static void main(String[] args) throws IOException {
      List<String> list = stroki();
        System.out.println(fix(list));
    }

    public static List<String> stroki() throws IOException {
        List<String> arr3 = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String a = reader.readLine();
            if (a.isEmpty()) break;
            else arr3.add(a);
        }
        return arr3;
    }

    public static List<String> fix(List<String> list) {
        List<String> arr1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() % 2 == 0) {
                arr1.add(list.get(i));
                arr1.add(list.get(i));
            } else {
                arr1.add(list.get(i));
                arr1.add(list.get(i));
                arr1.add(list.get(i));
            }

        }
        return arr1;
    }
}