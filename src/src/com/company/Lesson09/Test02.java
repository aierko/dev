package com.company.Lesson09;

/**
 * Created by user on 21.09.2016.
 */
public class Test02 {
    public static void main(String[] args) {
        System.out.println(sum(250,500));
        umnojenie(300, 200);
        delenie(760000, 26.2);
        System.out.println(minus(50,21));
    }
    public static int sum (int a, int b){
        return (a+b);
    }
    public static void umnojenie (int a, int b){
        System.out.println (a * b);
    }
    public static void delenie(double b, double g){
        System.out.println(b / g);
    }
    public static int minus (int a, int b){
        return (a-b);
    }
}

