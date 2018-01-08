package com.company.Lesson25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 15.11.2016.
 */
public class Test02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        int b = 6;
        if (b % 2 == 0) {
            System.out.println("Чётное");
        } else {
            System.out.println("Not");
        }


        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) {
                break;
            } else {
                int a = Integer.parseInt(s);
                list.add(a);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
