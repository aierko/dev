package com.company.Lesson32;

/**
 * Created by user on 02.12.2016.
 */// создать массив на 10 чисел и заплонить его значениями от 10 до 1.
public class Massive {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = array.length - 1; i>=0 ; i--) {
            array[i] = 10-i;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}

