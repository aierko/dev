package com.company.Lesson36;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 12.12.2016.
 *//* Удвой слова
1. Введи с клавиатуры 10 слов в список строк.
2. Метод doubleValues должен удваивать слова по принципу a,b,c -> a,a,b,b,c,c.
3. Используя цикл for выведи результат на экран, каждое значение с новой строки.
*/
public class DoubleValues {
    public static void main(String[] args) throws IOException {
        List<String> list = getStringList();
        doubleValues(list);
        System.out.println(list);
    }
    public static List<String> getStringList() throws IOException {
        List<String> array = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            String d = reader.readLine();
            array.add(d);
        }
        return array;
    }
    public static void doubleValues(List<String> array){
        for (int i = 0; i < array.size(); ){
           array.add(i+1, array.get(i));
           array.add(i+2, array.get(i));
            i+=3;
        }
    }

}
