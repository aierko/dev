package com.company.AlexPackage;

/**
 * Created by Artyom on 07.10.2016.
 */
public class Alex18
{
    public static void main(String[] args)
    {
        int a = 5;
        int b = 8;
        System.out.println(a + " " + b);
        swap(a, b);
    }

       public static void swap(int a, int b){
           int temp = a;
           a = b; // 8
           b = temp; // 5
           System.out.println(a + " " + b);
       }



}
