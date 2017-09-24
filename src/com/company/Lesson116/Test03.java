package com.company.Lesson116;

/**
 * Created by User on 10.09.2017.
 * You have an array a containing 2  n + 2 positive numbers, in which n numbers occur twice and two other numbers occur only once and are distinct.
 * Find the two distinct numbers and return them in ascending order.
 */
public class Test03 {
    public static void main(String[] args) {
        int[] array = new int[]{23, 45, 78, 56, 23, 45, 78, 34};

    }

    public static int[] findeDistinctNumbers(int[]array) {
        int [] arr = new int[2];
        int count = 0;
        int a  = 0;
        for (int i : array) {
            for (int i1 : array) {
                if (i == i1){
                    count++;
                }
            }
            if (count == 1){
                arr[a] = i;
            }
        }
        return arr;
    }
}
