package com.company.Lesson01;

/**
 * Created by user on 04.09.2016.
 */
public class Test01 {
    public static void main(String[] args) {
        print4("TEST");
        System.out.println(precent(45));
        System.out.println( "Chislo is " + plusSto(100) );
    }
    public static int plusSto( int a) {
        return a + 100;
    }
    public static double precent(double a){
        return a + a * 0.1;
    }
    public static void print4(String a){
        System.out.println(a);
        System.out.println(a);
        System.out.println(a);
        System.out.println(a);
    }
}
