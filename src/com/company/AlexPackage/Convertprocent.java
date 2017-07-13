package com.javarush.test.Denis;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Artyom on 28.09.2016.
 */
public class Convertprocent {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double a = Double.parseDouble(reader.readLine());
        procent(a);
        System.out.println(convert(a*0.8));
    }


    public static double convert(double a) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        a = Double.parseDouble(reader.readLine());
        return (a * 25.9);
    }

    public static void procent(double a) {
        System.out.println(a*0.8);

    }


}
