package com.javarush.test.Denis;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Artyom on 27.09.2016.
 */
public class Diapazon
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        if (a>50 && a<100){
            System.out.println("число попало в диапазон");
        }else{
            System.out.println("не попало");
        }





    }
}
