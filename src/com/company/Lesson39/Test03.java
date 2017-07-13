package com.company.Lesson39;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 19.12.2016.
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
public class Test03 {

    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String a = reader.readLine();
            if (a.isEmpty()) {
                break;
            } else list.add(a);
        }
        List<String> list1 = fix(list);
        System.out.println(list1);


    }



    public static List<String> fix(List<String> list1) {
        List<String> arr1 = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i).length() % 2 == 0) {
                arr1.add(list1.get(i));
                arr1.add(list1.get(i));
            } else {
                arr1.add(list1.get(i));
                arr1.add(list1.get(i));
                arr1.add(list1.get(i));
            }
        }
        return arr1;

    }

}
