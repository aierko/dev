package com.company.Lesson01;

/**
 * Created by user on 04.09.2016.
 */
public class Test03 {
    public static void main(String[] args) {
        int a = 5; // 6
        int b = 6; // 2
        int c = 2; // 5

        int d = a;
        a = b;
        b = c;
        c = d;

        System.out.println(a + " " + b + " " + c );
    }
}
