package com.company.Lesson46;

/**
 * Created by user on 09.01.2017.
 *//* Таблица умножения
Выведи на экран таблицу умножения 10 на 10 в следующем виде:
1 2 3 …
2 4 6 …
3 6 9
*/
public class Test01 {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            for (int j = 1; j <11; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}
