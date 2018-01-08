package com.company.massive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user on 11.10.2016.
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter $");
        double f = Double.parseDouble(reader.readLine());
        System.out.println(convert(f));
//        int a = 5;
//        int b = 8;
//        System.out.println(a + " " + b);
//        swap(a,b);

    }
        public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);}



        public static double convert(double a){
            return(a*26.1);
        }

}
