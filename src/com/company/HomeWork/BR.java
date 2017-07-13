package com.company.HomeWork;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by user on 11.01.2017.
 */
public class BR {
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        int b = Integer.parseInt(reader.readLine());
        System.out.println(a + " захватит мир через " + b + " лет. Му-ха-ха!");
    }
}

