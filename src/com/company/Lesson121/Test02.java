package com.company.Lesson121;

import java.util.Arrays;

/**
 * Created by User on 01.10.2017.
 * * You are given a list of n-1 integers and these integers are in the range of 1 to n.
 * There are no duplicates in list. One of the integers is missing in the list. Write an efficient code to find the missing integer.
 * Вам дан список с n-1 числами и эти числа находятся от 1 до n.
 * В этом списке нет дубликатов. Одно из этих чисел пропущено. Запишите эффективный код и найдите пропущенное число.
 * Example:
 * I/P    [0, 1, 2, 4, ,6, 3, 7, 8]
 * O/P    5
 */
public class Test02 {
    public static void main(String[] args) {
        int[] array = new int[]{0, 1, 2, 4, 6, 3, 7, 8, 5};
        System.out.println(arrayMissingNumbers(array));
    }

    public static int arrayMissingNumbers(int[] array) {
        Arrays.sort(array);
        for (int i = 0; i < array.length -1; i++) {
            if (array[i] + 1 != array[i + 1]) {
                return array[i]+1;
            }
        }
        return array.length;
    }

}
