package com.company.AlexPackage;

/**
 * Created by Artyom on 07.10.2016.
 */
public class Alex22Array
{
    public static void main(String[] args)
    {
        int[] a = new int[30];

        for (int i = 0; i<=9; i++)
        {
            a[i] = 10-i;
        }
        for (int i = 0; i <a.length; i++)
        {
            System.out.println(a[i]);
        }
    }

    }

