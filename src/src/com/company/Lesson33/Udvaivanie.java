package com.company.Lesson33;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 05.12.2016.
 *//* Удвой слова
1. Введи с клавиатуры 10 слов в список строк.
2. Метод doubleValues должен удваивать слова по принципу a,b,c -> a,a,b,b,c,c.
3. Используя цикл for выведи результат на экран, каждое значение с новой строки.
*/
public class Udvaivanie {
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            String a = reader.readLine();
            list.add(a);
        }
        list = doubleValues(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static List doubleValues(List<String> list1){
        List<String> arr = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            arr.add(list1.get(i));
            arr.add(list1.get(i));
        }
        return arr;
    }

}
