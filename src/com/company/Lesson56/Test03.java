package com.company.Lesson56;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 03.02.2017.
 * for each
 */
public class Test03 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, Integer> map = new HashMap<>();
        map.put(Integer.parseInt(reader.readLine()),Integer.parseInt(reader.readLine()));
        map.put(Integer.parseInt(reader.readLine()),Integer.parseInt(reader.readLine()));
        map.put(Integer.parseInt(reader.readLine()),Integer.parseInt(reader.readLine()));

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
