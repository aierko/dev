package com.company.Lesson20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user on 02.11.2016.в
 */ //создать массив на 5 чисел и заполнить его с консоли - найти минимальное значение в этом массиве.
public class Test01 {
    public static void main(String[] args) throws IOException {
        int[] array = new int[5];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i]<min){
                min = array[i];
            }
        }
        System.out.println(min);
    }
}
