package com.company.Lesson13;

/**
 * Created by user on 14.10.2016.
 */
public class Test01 {
    public static void main(String[] args) {
        int a = 9;
        int b = 10;
        System.out.println(a + " " + b);
        swap(a,b);
    }
    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);
    }
}
