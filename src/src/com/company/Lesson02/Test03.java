package com.company.Lesson02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user on 06.09.2016.
 */
public class Test03{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());


            int temp = 0;
            if (a>b){
            temp = a;
            System.out.println("temp is " + a);
        }else if (b>a){
            temp = b;
            System.out.println("temp is " + b);
        }

        if (temp>c){
            System.out.println("max is " + temp);
        }else if (c>temp){
            System.out.println("max is " + c);
        }

    }
}
