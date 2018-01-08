package com.company.Lesson120;

import java.util.Arrays;

/**
 * Created by User on 25.09.2017.
 * You have an array a containing positive numbers, in which n numbers occur twice and two other numbers occur only once and are distinct.
 * Find the two distinct numbers and return them in ascending order.
 * У Вас евть массив с позитивными числами, в котором n встречаются дважды и два других числа встречаются только однажды и уникальны.
 * Найдите два уникальных числа и верните их в возрастающем порядке.
 */
public class Test02 {
    public static void main(String[] args) {
        int[] array = new int[]{
                12, 36, 12, 45, 78, 45, 78, 34, 23}; // 12 12 34 36 45 45 78 78
        array = findeTheNumber(array);
        for (int i : array) {
            System.out.println(i);
        }
    }

    public static int[] findeTheNumber(int[] array) {
        int[] array1 = new int[3];
        Arrays.sort(array);
        int index = 0;

        for (int number1 : array) { // 34
            int count = 0;          // 1
            for (int number2 : array) { // 12
                if (number1 == number2) { // 34 == 34
                    count++;
                }
            }
            if (count == 1) { // a = 0 ---- 0[34] 1[36]
                array1[index] = number1;
                index++;
            }
        }
        return array1;
    }


}
