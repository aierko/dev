package com.company.Lesson37;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 14.12.2016.
 *//* Удвой слова
1. Введи с клавиатуры 10 слов в список строк.
2. Метод doubleValues должен удваивать слова по принципу a,b,c -> a,a,b,b,c,c.
3. Используя цикл for выведи результат на экран, каждое значение с новой строки.
*/
public class Test02 {
    public static void main(String[] args) throws IOException {
        List<String> list2 = lust();
        System.out.println(doubleValues(list2));
    }

    public static List<String> lust() throws IOException {
        List<String> array = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            array.add(reader.readLine());
        }
        return array;
    }
    public static List<String> doubleValues(List<String> arr){
        List<String> array5 = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            array5.add(arr.get(i));
            array5.add(arr.get(i));
        }
        return array5;
    }
}
