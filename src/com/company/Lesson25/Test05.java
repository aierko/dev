package com.company.Lesson25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 15.11.2016.
 */
public class Test05 {
    public static void main(String[] args) throws IOException {
        List<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String a = reader.readLine(); // 45 56
            if (a.isEmpty()) break;
            int s = Integer.parseInt(a); // 45 56
            if (s % 2 == 0) list.add(s);
            else list.add(0, s);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
