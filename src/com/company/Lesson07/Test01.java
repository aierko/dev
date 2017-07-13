package com.company.Lesson07;

/**
 * Created by user on 16.09.2016.
 */
// Надо пройтись по всем єлементам массива и сравнить каждій єлемент с переменной МИН,
// если єлемент меньше чем МИН, то МИН становится єтим єлементом
public class Test01 {
    public static void main(String[] args) {
        int[] arr = {5, 2, -3, 7, -44, 31, -10};
        int min = 0;

        for (int i = 0; i < arr.length; i++){  // 1 -
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("min is " + min);

    }
}
