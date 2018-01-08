package com.company.Lesson12;

/**
 * Created by user on 12.10.2016.
 */
public class Test03 {
    public static void main(String[] args) {
        int[] a = new int[10];
        a[2] = 50;
        a[3] = 5;
        a[9] = 214;
        a[7] = 63;
        a[4] = 57;

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);

        }
    }
}
