package com.company.Lesson02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user on 06.09.2016.
 */
public class Test02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int number1 = Integer.parseInt(reader.readLine());
        int number2 = Integer.parseInt(reader.readLine());

        if(number1<number2){
            System.out.println(" min is " + number1);

        }else if (number2<number1){
            System.out.println(" min is " + number2);
        }

    }
}
