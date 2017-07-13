package com.company.povtorenie;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user on 19.10.2016.
 * 5
 *
 * 8
 * 88
 * 888
 * 8888
 * 88888
 */
public class Test05 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());


        for (int i = 0; i < n  ; i++) {
            for (int j = 0; j <i ;  j++) {
                System.out.print(8);
            }
            System.out.println();
        }
    }
}
