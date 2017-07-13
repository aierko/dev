package com.company.HomeWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user on 10.02.2017.
 * /* Один большой массив и два маленьких
 1. Создать массив на 10 чисел.
 2. Ввести в него значения с клавиатуры.
 3. Создать два массива на 5 чисел каждый.
 4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
 5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
 */
public class Work14 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int [] array = new int [10];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        int [] arr1 = new int[5];
        int [] arr2 = new int[5];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = array[i];
            arr2[i] = array[i+5];
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }




    }
}
