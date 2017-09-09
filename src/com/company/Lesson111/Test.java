package com.company.Lesson111;

import java.util.Arrays;

/**
 * Created by User on 27.08.2017. У вас есть массив a, содержащий 2 n + 2 положительных числа,
 *   *, В котором n чисел встречаются дважды, а два других числа встречаются только один раз и различны.
 *   * Найдите два разных числа и верните их в порядке возрастания.
 */
public class Test {
    public static void main(String[] args) {
        int[] array = {12000, 23000, 34000, 12000, 10000, 34000, 28, 234, 28, 234, 1, 5, 1, 10000}; //1,12,12,23,34,34;
        array = uniqueNumber(array);
        for (int i : array) {
            System.out.println(i);
        }
    }

    public static int[] uniqueNumber(int[] array) {
        int[] resultArray = new int[2]; // обьявляем
        Arrays.sort(array);             // сортируем
        int k = 0;                      // инициализируем
        for (int number : array) {      // проходимся по массиву
            int count = 0;              // объявляем счетчик
            for (int i1 : array) {      // проходимся по массиву
                if (number == i1) {     //
                    count++;
                }
            }
            if (count == 1) {
                resultArray[k] = number;
                k++;
            }
        }
        return resultArray;
    }
}
