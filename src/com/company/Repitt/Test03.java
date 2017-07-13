package com.company.Repitt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 20.02.2017./* Удвой слова
 1. Введи с клавиатуры 10 слов в список строк.
 2. Метод doubleValues должен удваивать слова по принципу a,b,c -> a,a,b,b,c,c.
 3. Используя цикл for выведи результат на экран, каждое значение с новой строки.
 *

 */
public class Test03 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }
        list = doubleValues(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
    public static List doubleValues(List<String> arr){
        List<String> array = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            array.add(arr.get(i));
            array.add(arr.get(i));
        }
        return array;
    }
}
