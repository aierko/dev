package com.company.Lesson06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user on 14.09.2016.
 */
public class Test02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine()); //23
        int b = Integer.parseInt(reader.readLine()); //45
        int c = Integer.parseInt(reader.readLine()); //12

        if(a > b && a > c){
            System.out.println(a);
        }
        if(b > a && b > c){
            System.out.println(b);
        }
        if(c > a && c > b){
            System.out.println(c);
        }
    }
}
