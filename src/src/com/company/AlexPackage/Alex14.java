package com.company.AlexPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Artyom on 04.10.2016.
 */
public class Alex14
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String a = reader.readLine();
        int b = Integer.parseInt(reader.readLine());

        int c = 0;
        while (c<b){
            System.out.println(a);
            c++;
        }
    }
}
