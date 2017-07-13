package com.company.Shpargalka;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 04.11.2016.
 *///ввести 5 строк с клавиатуры и вывести их на экран в обратном порядке
public class Test04 {
    public static void main(String[] args) throws IOException {
        List<String> array = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            array.add(reader.readLine());
        }
        for (int i = array.size()-1; i >=0; i--) {
            System.out.println(array.get(i));
        }
    }
}
