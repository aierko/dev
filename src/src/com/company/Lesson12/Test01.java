package com.company.Lesson12;

/**
 * Created by user on 12.10.2016.
 */
public class Test01 {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
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
