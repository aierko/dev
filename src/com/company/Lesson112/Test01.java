package com.company.Lesson112;

import java.util.Arrays;

/**
 * Created by User on 27.08.2017.
 * * You are given a array of n-1 integers and these integers are in the range of 0 to n.
 * There are no duplicates in array. One of the integers is missing in the array. Write an efficient code to find the missing integer.
 * Example:
 * I/P    [0, 1, 2, 4, 6, 3, 7, 8]
 * O/P    5
 * Вам задан массив из n-1 целых чисел, и эти целые числа находятся в диапазоне от 0 до n.
 *   * В массиве нет дубликатов. В массиве отсутствует одно из целых чисел. Напишите эффективный код, чтобы найти недостающее целое число.
 */
public class Test01 {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 4, 5, 6, 3, 7, 8, 9, 10}; // 0,1,2,3,4,5,6,7,8;
        System.out.println(returnArrayNumber(array));
    }


    public static int returnArrayNumber(int[] a) {
        Arrays.sort(a);
        for (int i = 0; i < a.length-1; i++) { //0 7    9
            if (a[i] + 1 != a[i + 1]){
                return a[i] + 1;
            }
        }
        return a.length;
    }

}
