package com.company.AlexPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Artyom on 04.09.2016.
 */

public class ClassTest
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String n = reader.readLine();
        int a = Integer.parseInt(n);

        switch(a){
            case 1 : kv(Integer.parseInt(reader.readLine())); break;
            case 2 : kv1(Integer.parseInt(reader.readLine())); break;
            case 3 : kv2(Integer.parseInt(reader.readLine())); break;
        }

    }


    public static void kv(int n)
    {
        System.out.println(n*n + 110);
    }

    public static void kv1(int n)
    {
        System.out.println(n+n);
    }

    public static void kv2(int n)
    {
        System.out.println(n*n);
    }

}
