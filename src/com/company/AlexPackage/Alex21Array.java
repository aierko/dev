package com.javarush.test.Denis;

/**
 * Created by Artyom on 07.10.2016.
 */
public class Alex21Array
{
    public static void main(String[] args)
    {
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++)
        {

            System.out.println(a[i]);
            a[i] = i + 1;
        }
    }
}
