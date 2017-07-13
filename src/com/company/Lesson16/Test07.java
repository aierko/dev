package com.company.Lesson16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user on 21.10.2016.
 *//* Массив из строчек в обратном порядке
1. Создать массив на 10 строчек.
2. Ввести с клавиатуры 8 строчек и сохранить их в массив.
3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.
*/
public class Test07 {
    public static void main(String[] args) throws IOException {
       String[]a = new String [10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        for (int i = 0; i < a.length-2; i++) {
            a[i] = reader.readLine();

        }
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.println(a[i]);
        }
    }

}
