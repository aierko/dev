package com.company.Lesson36;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 12.12.2016.
 *//* Вывести числа в обратном порядке
Ввести с клавиатуры 10 чисел и заполнить ими список.
Вывести их в обратном порядке.
Использовать только цикл for.
*/
public class Revers {
    public static void main(String[] args) throws IOException {
        List<Integer> array = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            array.add(Integer.parseInt(reader.readLine()));
        }
        for (int i = array.size()-1; i > 0; i--) {
            System.out.println(array.get(i));
        }
    }
}
