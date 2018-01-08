package com.company.Lesson16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user on 21.10.2016.
 * 100 - 200 checkInterval
 * 157 -> Number in interval
 * 78 -> Number does not in interval
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        checkInterval(a);

    }
    public static void checkInterval( int a){
        if(a>100 && a<200){
            System.out.println("Number in interval");
        }
        else{
            System.out.println("Number does not in interval");

        }
    }
}
