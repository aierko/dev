package com.javarush.test.Denis;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Artyom on 04.10.2016.
 */
public class Alex13
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a;
        int sum = 0;


        do
        {
            a = Integer.parseInt(reader.readLine());
            sum = sum + a;
        }
        while (a != -1);
        System.out.println(sum);
    }
}
