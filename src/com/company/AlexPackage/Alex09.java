package com.javarush.test.Denis;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Artyom on 30.09.2016.
 */
public class Alex09 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            int a = Integer.parseInt(reader.readLine());
            sum = sum + a;
        }
        System.out.println(sum);

    }
}
