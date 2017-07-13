package com.javarush.test.Denis;

/**
 * Created by Artyom on 05.10.2016.
 */
public class Alex17
{
    public static void main(String[] args)
    {
        convert(300);
        System.out.println(procent(500));
    }

    public static void convert(int a)
    {
        System.out.println(a * 26.1);
    }

    public static double procent(double a)
    {
        return (a * 0.1);

    }

}
