package com.company.Lesson115;

/**
 * Created by User on 04.09.2017.
 *   You have an array a containing 2 n + 2 positive numbers,
 *   in which n numbers occur twice and two other numbers occur only once and are distinct.
 * Find the two distinct numbers and return them in ascending order.
 */
public class Test03 {
    public static void main(String[] args) {
        int [] array = {2,23,45,23,45,6,76,76};
        array = findeDistinctNumbers(array);

        for (int i : array) {
            System.out.println(i);
        }
    }
    public static int[] findeDistinctNumbers(int[] array){
        int [] array1 = new int[2];
        int a = 0;

        for (int i = 0; i <array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]){
                    count ++;
                }
            }
            if (count == 1){
                array1[a] = array[i];
                a++;
            }
        }
        return array1;
    }
}
