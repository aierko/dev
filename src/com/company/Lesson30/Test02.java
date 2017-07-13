package com.company.Lesson30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 28.11.2016.
 *//* Удвой слова
1. Введи с клавиатуры 10 слов в список строк.
2. Метод doubleValues должен удваивать слова по принципу a,b,c -> a,a,b,b,c,c.
3. Используя цикл for выведи результат на экран, каждое значение с новой строки.
abc
bcd
cde

abc
abc
bcd
bcd
cde
cde
*/
public class Test02 {
    public static void main(String[] args) throws IOException {
        List<String> array = new ArrayList<>();
        int list = 5;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            array.add(reader.readLine());
        }

        System.out.println(doubleValues(array));


    }

    public static List doubleValues(List<String> strings){
        List<String> list2 = new ArrayList<>();
        for (int i = 0; i < strings.size(); i++) {
            list2.add(strings.get(i));
            list2.add(strings.get(i));
        }

        return list2;
    }
}
