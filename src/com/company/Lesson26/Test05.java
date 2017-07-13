package com.company.Lesson26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 16.11.2016.
 *///Разделение массива на два – чётных и нечётных чисел
public class Test05 {
    public static void main(String[] args) throws IOException {
        List<Integer> array = new ArrayList<>();
        List<Integer> array1 = new ArrayList<>();
        List<Integer> array2 = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) {
                break;
            } else {
                int a = Integer.parseInt(s);
                array.add(a);
            }
        }
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) % 2 == 0) {
                array1.add(array.get(i));
            } else {
                array2.add(array.get(i));
            }
        }

        for (int j = 0; j < array2.size(); j++) {
            System.out.println(array2.get(j));
        }
    }
}
