package com.company.Lesson19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user on 28.10.2016.
 *//* 2 массива
1. Создать массив на 10 строк.
2. Создать массив на 10 чисел.
3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
4. В каждую ячейку массива чисел записать длину строки из массива строк,
 индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.
 Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.
*/
public class Test04 {
    public static void main(String[] args) throws IOException {
        String[] array = new String[5];
        int[] arr = new int[5];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < array.length; i++) {
            array[i] = reader.readLine();

        }
        for (int i = 0; i <arr.length; i++) {
            arr[i] = array[i].length();
        }
        for (int i = 0; i <arr.length; i++) {
            System.out.println(arr[i] + "-" + array[i]);
        }
        }
}
