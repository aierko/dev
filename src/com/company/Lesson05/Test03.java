package com.company.Lesson05;

/**
 * Created by user on 13.09.2016.
 *//* Рисуем треугольник
Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
Пример:
8
88
888
...
*/
public class Test03 {
    public static void main(String[] args) {


    int n1 = 10;
    int n2 = 1;
    for (int i =0; i<n1; i++){
        for (int j = 0; j<n2; j++){
            System.out.print("8");
        }
        n2++;
        System.out.println();
    }
    }
}
