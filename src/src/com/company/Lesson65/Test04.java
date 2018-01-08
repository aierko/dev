package com.company.Lesson65;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user on 27.02.2017.
 * tree chisla i nakhojdenie minimalnogo;
 */
public class Test04 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if (a < b && a < c) {
            System.out.println(a);
        }
        if (b < a && b < c) {
            System.out.println(b);
        }
        if (c < a && c < b) {
            System.out.println(c);
        }
    }
}
