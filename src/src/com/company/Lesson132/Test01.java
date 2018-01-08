package com.company.Lesson132;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by User on 10.11.2017.
 * найти количество различных элементов массива. Пример: для 1 4 5 1 1 3 ответ 4.
 */
public class Test01 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int[] array = {1, 4, 5, 1, 1, 3};
        System.out.println(sortFindeDifende(array));
    }

    public static int sortFindeDifende(int[] array) throws IOException {
        Arrays.sort(array);
        int count = 0;
        if (array.length >= 1) {
            count = 1;
            for (int i = 0; i < array.length - 1; i++) {

                if (array[i] != array[i + 1])
                    count++;
            }
            return count;

        }
        else return 0;
    }
}
