package com.company.Lesson24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 11.11.2016.
 *///чётные числа добавляются в конец списка, нечётные – в начало.
public class Test04 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();

        while (true){
            String a = reader.readLine(); // 3 10 1
            if(a.isEmpty()) break;
            int s = Integer.parseInt(a); // 3 10 1
            if(s % 2 == 0) list.add(s);
            else list.add(0, s);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i)); // 3 10
        }

    }

}
