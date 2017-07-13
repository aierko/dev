package com.company.Lesson14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user on 18.10.2016.
 */
public class Test08 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());

        if(a<b){
            System.out.println(a);
        } else{
            System.out.println(b);
        }


    }
}
