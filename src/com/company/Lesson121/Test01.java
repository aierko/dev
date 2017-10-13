package com.company.Lesson121;

import java.util.Arrays;

/**
 * Created by User on 01.10.2017.
 *  You have an array a containing positive numbers, in which n numbers occur twice and two other numbers occur only once and are distinct.
 * Find the two distinct numbers and return them in ascending order.
 * У Вас евть массив с позитивными числами, в котором n встречаются дважды и два других числа встречаются только однажды и уникальны.
 * Найдите два уникальных числа и верните их в возрастающем порядке.
 */
public class Test01 {
    public static void main(String[] args) {
        int[] array = new int[]{22,36,45,36,45,54,66,66};
        array = arrayNumbers(array);
        for (int i : array) {
            System.out.println(i);
        }
    }
    public static int[] arrayNumbers(int[] array){
        int [] arrayDistinctNumbers = new int[2];
        Arrays.sort(array);
        int index = 0;
        for (int number1 : array) {
            int count = 0;
            for (int number2 : array) {
                if (number1 == number2){
                    count++;
                }
            }
            if (count == 1){
                arrayDistinctNumbers[index] = number1;
                index ++;
            }
        }
        return arrayDistinctNumbers;
    }

}
