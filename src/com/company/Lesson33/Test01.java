package com.company.Lesson33;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user on 05.12.2016.
 *///заполните массив на 10 чисел и найти максимальное значение в этом массиве.
public class Test01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        int a = array[0];
        for (int i = 0; i < array.length; i++) {
                if(a<array[i]){
                    a = array[i];
                }
        }

            System.out.println(a);

    }
}
