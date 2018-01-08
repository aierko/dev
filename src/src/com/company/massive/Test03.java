package com.company.massive;

/**
 * Created by user on 11.10.2016.
 */
public class Test03 {
    public static void main(String[] args) {
        int[] a = new int[10];
        a[3] = 10;
        a[7] = 10;
        int n = a.length;
        System.out.println(a[5]);
        System.out.println(n);
        for (int i = 0; i < a.length ; i++) {
            System.out.println(a[i]);
        }
    }
    }

