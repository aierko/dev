package com.company.povtorenie;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user on 19.10.2016.
 */
public class Test03 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String a = reader.readLine();
        int b = Integer.parseInt(reader.readLine());

        for (int i = 0; i < b; i++) {
            System.out.println(a);
        }
    }
}
