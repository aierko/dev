package com.company.Lesson115;

import java.util.Arrays;

/**
 * Created by User on 04.09.2017.
 * <p>
 * * You are given a list of n-1 integers and these integers are in the range of 1 to n.
 * There are no duplicates in list. One of the integers is missing in the list. Write an efficient code to find the missing integer.
 * Example:
 * I/P    [0, 1, 2, 4, ,6, 3, 7, 8]
 * O/P    5
 */
public class Test02 {
    public static void main(String[] args) {
        int[] array = new int[]{0, 1, 2, 4, 6, 3, 7, 8, 5, 9, 10};
        System.out.println(findeNumber(array));
    }
    public static int findeNumber(int[] array) {
        Arrays.sort(array);
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] + 1 != array[i + 1]){
                return array[i] +1;
            }
        }
        return array.length;
    }
}
