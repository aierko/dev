package com.company.Lesson40;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 21.12.2016.
 *//* Переставить M первых строк в конец списка
Ввести с клавиатуры 2 числа N  и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.
*/
public class Test03 {
    public static void main(String[] args) throws IOException{
        List<String> list = chislo();

        for (String s : list) {
            System.out.println(s);
        }
    }
    public static List<String> chislo() throws IOException {
        List<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        for (int i = 0; i < n; i++) {
            list.add(reader.readLine());
        }
        int m = Integer.parseInt(reader.readLine());
        for (int i = 0; i < m; i++) {
            list.add(list.remove(0));
        }
        return list;
    }
}
