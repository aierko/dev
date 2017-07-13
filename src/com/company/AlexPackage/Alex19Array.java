package com.javarush.test.Denis;

/**
 * Created by Artyom on 07.10.2016.
 */
public class Alex19Array
{
    public static void main(String[] args)
    {
        int[] array = new int[5];
        String[] arr = new String[5];

        array[0] = 54;
        array[4] = 23;

        for (int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }
    }
}
