package com.company.Lesson113;

import java.util.Arrays;

/**
 * Created by User on 28.08.2017.
 *   You have an array a containing 2  n + 2 positive numbers,
 *   in which n numbers occur twice and two other numbers occur only once and are distinct.
 * Find the two distinct numbers and return them in ascending order.
 * У вас есть массив a, содержащий 2 n + 2 положительных числа,
   *, в котором n чисел встречаются дважды,
      а два других числа встречаются только один раз и различны.
   * Найдите два разных числа и верните их в порядке возрастания.
 */
public class Test01 {
    public static void main(String[] args) {
        int [] array = {2,23,45,23,45,6,76,76};
        array = returnArray(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
    public static int[] returnArray(int []array){
        Arrays.sort(array);
        int [] array1 = new int[2];
        int a = 0;
        for (int i : array) {
            int count = 0;
            for (int i1 : array) {
                if (i == i1){
                    count ++;
                }
            }
            if (count == 1){
                 array1[a] = i;
                 a++;
            }
        }
        return array1;
    }
}
