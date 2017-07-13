package com.company.Lesson18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user on 26.10.2016.
 *//* Массив из строчек в обратном порядке
1. Создать массив на 10 строчек.
2. Ввести с клавиатуры 5 строчек и сохранить их в массив.
3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.
*/
public class Test03 {
    public static void main(String[] args) throws IOException {
        String[] array = new String[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < array.length - 5; i++) {
            array[i] = reader.readLine();

        }
        for (int i = array.length - 1; i >= 0; i--) {// 9 9 >= 0 i--; 8 8 >= 0 i--; ... ; i = 0 0 >= 0 i--
            System.out.println(array[i]);
        }
    }
}
