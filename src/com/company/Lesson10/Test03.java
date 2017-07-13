package com.company.Lesson10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user on 23.09.2016.
 */
public class Test03 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        System.out.println(" enter number ");
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if (a>b && a>c){
            System.out.println("max is " + a);
        } else if(b>a && b>c){
            System.out.println("max is " + b);
        } else if(c>a && c>b){
            System.out.println("max is " + c);
        }else {
            System.out.println("numbers is equals");
        }


    }
}
