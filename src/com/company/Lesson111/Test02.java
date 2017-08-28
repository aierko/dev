package com.company.Lesson111;

import java.util.Arrays;

/**
 * Created by User on 21.08.2017.
 *  You have an array a containing 2  n + 2 positive numbers,
 *  in which n numbers occur twice and two other numbers occur only once and are distinct.
 * Find the two distinct numbers and return them in ascending order.
 * У вас есть массив a, содержащий 2 n + 2 положительных числа,
   *, В котором n чисел встречаются дважды, а два других числа встречаются только один раз и различны.
   * Найдите два разных числа и верните их в порядке возрастания.
 */
public class Test02 {
    public static void main(String[] args) {
       int [] array = {1, 4,4, 32, 54, 54, 23, 21,1};
        Arrays.sort(array);
        findeUnique(array);
    }


    public static void findeUnique(int[] a){
        for (int i = 0; i < a.length; i++) {
            boolean isunique = false;
            for (int j = 0; j < i; j++) {
                if (a[i]== a[j]){
                    isunique = true;
                    break;
                }
            }
            if (!isunique){
                System.out.println(a[i] + " ");
            }
        }
        
    }
}
