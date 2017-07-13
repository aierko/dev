package com.company.Lesson78;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user on 02.04.2017.
 * /* Пять наибольших чисел
 Создать массив на 10 чисел. Заполнить его числами с клавиатуры. Вывести пять наибольших чисел.
 */
public class Test01 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int [] massiv = new int [10];
        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = Integer.parseInt(reader.readLine());
        }
        bigly(massiv);
        for (int i = massiv.length - 5; massiv.length > i ; i++) {
            System.out.println(massiv[i]);
        }


    }
    public static void bigly(int [] mas){
        for (int i = 0; i < mas.length-1; i++) {
            for (int j = 0; j < mas.length-1; j++) {
                if (mas[j] > mas[j+1]){
                    int temp = mas[j];
                    mas[j] = mas[j+1];
                    mas[j+1] = temp;
                }
            }
        }
    }
}
