package com.javarush.test.Denis;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Artyom on 05.10.2016.
 */
public class Alex16
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String a = reader.readLine();
        int b = Integer.parseInt(reader.readLine());

        for (int i = 0; i < b; i++)
        {
            System.out.println(a);
        }

    }

}
