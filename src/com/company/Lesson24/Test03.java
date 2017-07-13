package com.company.Lesson24;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 11.11.2016.
 */
public class Test03 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        int a = 6547;

        if (a % 2 == 0) System.out.println("even");
        else System.out.println("odd");

        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(Integer.parseInt(s));
        }

        for (Integer s : list) {
            System.out.println(s);
        }
    }
}
