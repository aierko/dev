package com.company.Lesson12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user on 12.10.2016.
 */
public class Test08 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        long[] a = new long[10];
        for (int i = 0; i <a.length ; i++) {
            a[i] = Long.parseLong(reader.readLine());
            System.out.println(a[i]);

        }

    }
}
