package com.company.Lesson12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user on 12.10.2016.
 */
public class Test07 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] a = new String[10];

        for (int i = 0; i <a.length ; i++) {
            a[i] = reader.readLine();
            System.out.println(a[i]);

        }
    }
}
