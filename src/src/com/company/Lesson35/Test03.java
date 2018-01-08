package com.company.Lesson35;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 09.12.2016.
 *//* Удвой слова
1. Введи с клавиатуры 10 слов в список строк.
2. Метод doubleValues должен удваивать слова по принципу a,b,c -> a,a,b,b,c,c.
3. Используя цикл for выведи результат на экран, каждое значение с новой строки.
*/
public class Test03 {
    public static void main(String[] args) throws IOException {
        List<String> list = doubleValues(getStringList());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
        public static List<String> getStringList () throws IOException {
            List<String> array2 = new ArrayList<>();
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            for (int i = 0; i < 10; i++) {
                array2.add(reader.readLine());
            }
            return array2;
        }


    public static List doubleValues (List<String> array0) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i <array0.size(); i++) {
            list.add(array0.get(i));
            list.add(array0.get(i));
        }
        return list;
        }

    }


