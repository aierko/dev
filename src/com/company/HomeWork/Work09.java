package com.company.HomeWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user on 30.01.2017.
 * /* Массив из строчек в обратном порядке
 1. Создать массив на 10 строчек.
 2. Ввести с клавиатуры 8 строчек и сохранить их в массив.
 3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.
 */
public class Work09 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[10];
        for (int i = 0 ; i < array.length - 2; i++) {
            array[i] = reader.readLine();
        }
        for (int i = array.length-1; i >= 0 ; i--) {
            System.out.println(array[i]);
        }

    }
}