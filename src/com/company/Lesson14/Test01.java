package com.company.Lesson14;

/**
 * Created by user on 18.10.2016.
 */
public class Test01 {
    public static void main(String[] args) {
        int a = 5;
        int b = 8;
        System.out.println(a + " " + b);
        swap(a, b);
    }
    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);


    }

}
