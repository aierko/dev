package com.company.Lesson41;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 23.12.2016.
 *//* Переставить M первых строк в конец списка
Ввести с клавиатуры 2 числа N  и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.
*/
public class Test01 {
    public static void main(String[] args) throws IOException {
        List<String> arr1 = getString();
        for (int i = 0; i <arr1.size(); i++) {
            System.out.println(arr1.get(i));
        }
    }
    public static List<String> getString() throws IOException {
          List<String> array = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        for (int i = 0; i < n; i++) {
             array.add(reader.readLine());
        }
        int m = Integer.parseInt(reader.readLine());
        for (int i = 0; i < m; i++) {
            array.add(array.remove(0));
        }
        return array;
    }
}
