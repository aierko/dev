package com.company.Shpargalka;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user on 04.11.2016.
 *///ввести 5 строк с клавиатуры и вывести их на экран в обратном порядке
public class Test03 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = reader.readLine();
        }
        for (int i = array.length-1; i >=0; i--) {
            System.out.println(array[i]);
        }
    }
}
