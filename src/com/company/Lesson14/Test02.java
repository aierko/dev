package com.company.Lesson14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user on 18.10.2016.
 */ // checkInterval 50 - 100 (true - "Число попало в диапазон", false - "Число не попало в диапазон").
public class Test02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        checkInterval(a);
    }

    public static void checkInterval(int a){
        if(a>50 && a<100){
            System.out.println("Число попало в диапазон");
        } else {
            System.out.println("Число не попало в диапазон");
        }
    }
}