package com.company.Lesson38;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 16.12.2016.
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
public class Stest03 {
    public static void main(String[] args) throws IOException {
        List<String> list = vvod();
        list = fix(list);
        System.out.println(list);
    }
    public static List<String> vvod() throws IOException {
        List<String> array = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String a = reader.readLine();
            if(a.isEmpty()) break;
            else array.add(a);
        }
        return array;

    }
    public static List<String> fix(List<String> arr3){
        List<String> list = new ArrayList<>();
        for (int i = 0; i <arr3.size() ; i++) {
            if(arr3.get(i).length() % 2 == 0){
                list.add(arr3.get(i));
                list.add(arr3.get(i));
            } else {
                list.add(arr3.get(i));
                list.add(arr3.get(i));
                list.add(arr3.get(i));
            }
        }
        return list;
    }
}
