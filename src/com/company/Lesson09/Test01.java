package com.company.Lesson09;

/**
 * Created by user on 21.09.2016.
 */
public class Test01 {
    public static void main(String[] args) {

        int a = 5;
        int b = 6;
        int c = 7;

        System.out.println(a + " " + b + " " + c);

        a = 6;
        b = 7;
        c = 8;

        System.out.println(a + " " + b + " " + c);

        a = a + b;
        b = b + c;
        c = a + b;
        System.out.println(a +" " + b + " " + c);

    }

}
