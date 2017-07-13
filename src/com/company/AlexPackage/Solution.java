package com.javarush.test.Denis;

/**
 * Created by Artyom on 05.07.2016.
 */
public class Solution
{
    public static void main(String[] args){
        convert(200);
        System.out.println(crunch(20));
    }
    public static void convert(double a){
        System.out.println(a*26.1 );
    }
    public static double crunch(double a){

        return(a * 0.1);
    }
}
