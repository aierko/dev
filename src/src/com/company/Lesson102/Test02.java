package com.company.Lesson102;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by User on 09.07.2017.
 * /* Пять наибольших чисел
 Создать массив на 10 чисел. Заполнить его числами с клавиатуры. Вывести пять наибольших чисел.
 */
public class Test02 {
  static  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int [] chisla = new int[10];
         ten(chisla);
         putNumbers(chisla);
        for (int i = 5; i <chisla.length ; i++) {
            System.out.println(chisla[i]);
        }
    }
    public static void ten(int [] chisla) throws IOException {
        for (int i = 0; i < 10; i++) {
            chisla[i] = Integer.parseInt(reader.readLine());
        }
    }
    public static void putNumbers(int [] chisla){
        for (int i = 0; i < chisla.length-1; i++) {
            int temp = 0;
            for (int j = 0; j <chisla.length-1-i ; j++) {
                if (chisla[j] > chisla[j+1]){
                    temp = chisla[j];
                    chisla[j] = chisla[j+1];
                    chisla[j+1] = temp;
                }
            }
        }
    }
}
