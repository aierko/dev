package com.company.Lesson13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user on 14.10.2016.
 */
public class Test05 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] a = new int[5];

        for (int i = 0; i <a.length; i++) {
            a[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 0; i <a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
