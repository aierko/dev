package com.company.Lesson24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 11.11.2016.
 */// Вводить числа, пока не ввели пустую строку, добавлять эти числа в список. С помощью цикла, удалить все чилса больше 5.
public class Test05 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();

        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(Integer.parseInt(s));
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > 5) {
                list.remove(i);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
