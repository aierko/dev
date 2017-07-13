package com.javarush.test.Denis;

/**
 * Created by Artyom on 28.09.2016.
 */
public class Alex06
{
    public static void main(String[] args)
    {
        closeToTen(11,8);
    }
    public static void closeToTen(int a, int b){
        int closeA = abs(a-10); // 1
        int closeB = abs(b-10); // 2
        if(closeA < closeB){
            System.out.println(a);
        }else {
            System.out.println(b);
        }
    }

    public static int abs(int a){
        if (a<0){
            return -a;
        }else return a;
    }

}
