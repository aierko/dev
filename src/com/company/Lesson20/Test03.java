package com.company.Lesson20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user on 02.11.2016.
 *//* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/
public class Test03 {
    public static void main(String[] args) throws IOException {
        int[] array = new int[10]; // [0][1][2][3][4][5][6][7][8][9]
        int[] arr1 = new int[5]; // 0-4 [0][1][2][3][4]
        int[] arr2 = new int[5]; // 5-9 [0][1][2][3][4]
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < array.length; i++) {
             array[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = array[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = array[i+5];
            System.out.println(arr2[i]);
        }


    }
}
