package com.company.Lesson14;

/**
 * Created by user on 18.10.2016.
 * 0 - 9
 * 9 - 0
 */
public class Test05 {
    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i <a.length; i++) {
            a[i] = 9 - i;
            System.out.println(a[i]);

        }
    }
}
