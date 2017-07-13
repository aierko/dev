package com.company.Lesson09;

/**
 * Created by user on 21.09.2016.
 */
public class Test03 {
    public static void main(String[] args) {
        int a = 5; // 8
        int b = 8; // 2
        int c = 2; // 5
        System.out.println(a + " " + b + " " + c);
        int temp = a; //5
        a = b; //8
        b = c; //2
        c = temp; //5
        System.out.println(a + " " + b + " " + c);
    }
}
