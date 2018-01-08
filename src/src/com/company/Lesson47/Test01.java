package com.company.Lesson47;

/**
 * Created by user on 11.01.2017.
 */
public class Test01 {
    public static void main(String[] args) {
        int a = 5; // 7
        int b = 7; // 1
        int c = 1; // 5

        System.out.println(a + " " + b + " " + c);

        int temp = a;
        a = b;
        b = c;
        c = temp;

        System.out.println(a + " " + b + " " + c);
    }
}
