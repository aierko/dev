package com.company.Lesson29_lists;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by user on 25.11.2016.
 *//* Переставить M первых строк в конец списка
Ввести с клавиатуры 2 числа N  и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.
N = 5
M = 2

text1
2
3
4
5

3
4
5
text1
2
*/
public class Test07 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < n; i++)
            list.add(reader.readLine());

        for (int i = 0; i < m; i++) {
            String s = list.get(0);
            list.remove(0);
            list.add(s);
        }
        for (String s : list) System.out.println(s);
    }
}
