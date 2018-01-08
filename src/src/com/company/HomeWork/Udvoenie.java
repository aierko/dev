package com.company.HomeWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 25.01.2017.
 *//* Удвой слова
1. Введи с клавиатуры 10 слов в список строк.
2. Метод doubleValues должен удваивать слова по принципу a,b,c -> a,a,b,b,c,c.
3. Используя цикл for выведи результат на экран, каждое значение с новой строки.
*/
public class Udvoenie {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            String a = reader.readLine();
            arr.add(a);
        }
        List<String> list = doubleValues(arr);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
    public static List<String> doubleValues(List<String> list1){
        List<String> array = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            array.add(list1.get(i));
            array.add(list1.get(i));
        }
        return array;
    }
}


