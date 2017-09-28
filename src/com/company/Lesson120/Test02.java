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
                12, 36, 12, 45, 78, 45, 78, 34};
        array = findeTheNumber(array);
        for (int i : array) {
            System.out.println(i);
        }
    }

    public static int[] findeTheNumber(int[] array) { // 0[34] 1[0]
        int[] array1 = new int[2];
        Arrays.sort(array);
        int a = 0;

        for (int i : array) {
            int count = 0;
            for (int i1 : array) {
                if (i == i1) {
                    count++;
                }
            }
            if (count == 1) {
                array1[a] = i;
                a++;
            }
        }
        return array1;
    }


}
