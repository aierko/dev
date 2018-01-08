package com.company.procents;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user on 20.09.2016.
 */
public class Convert {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       int d = Integer.parseInt(reader.readLine());
        System.out.println(convert(d));    }

    public static double convert(double a) {
        double d = a * 27.2;
        return d;
    }

}
