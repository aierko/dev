package com.company.Lesson115;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by User on 04.09.2017./* Максимальное среди массива на 10 чисел
 1. В методе initializeArray():
 1.1. Создайте массив на 10 чисел
 1.2. Считайте с консоли 10 чисел и заполните ими массив
 2. Метод max(int[] array) должен находить максимальное число из элементов массива
 */
public class Test01 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        max(intializeArray());
    }
    public static int [] intializeArray() throws IOException {
        int [] arrray = new int[10];
        for (int i = 0; i <10; i++) {
            arrray[i] = Integer.parseInt(reader.readLine());
        }
        return arrray;
    }
    public static void max(int[]array){
        int a = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > a){
                a = array[i];
            }
        }
        System.out.println(a);

    }
}
