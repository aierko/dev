package com.javarush.test.Denis;

/**
 * Created by Artyom on 30.09.2016.
 */
public class Temp
{
    public static void main(String[] args)
    {
        swap(126, 286);
    }
    public static void swap( int a, int b){
        int temp = b;
        b = a;
        a = temp;
        System.out.println(a + " " + b);
    }
}
