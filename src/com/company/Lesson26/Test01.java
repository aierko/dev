package com.company.Lesson26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 16.11.2016.
 *///Вводить с клавиатуры числа и добавлять их в список, пока пользователь не ввел пустую строку;
public class Test01 {
    public static void main(String[] args) throws IOException {
        List<Integer> array = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String a = reader.readLine();
            if (a.isEmpty()) break;
            else {
                int s = Integer.parseInt(a);
                array.add(s);
            }

        }
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }
    }
}
