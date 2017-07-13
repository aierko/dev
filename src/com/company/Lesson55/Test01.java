package com.company.Lesson55;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by user on 01.02.2017.
 * String, Integer
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> map = new HashMap<>();
        map.put(reader.readLine(), Integer.parseInt(reader.readLine()));
        map.put(reader.readLine(), Integer.parseInt(reader.readLine()));
        map.put(reader.readLine(), Integer.parseInt(reader.readLine()));

        Iterator<Map.Entry<String, Integer>> part = map.entrySet().iterator();
        while (part.hasNext()) {
            Map.Entry<String, Integer> it = part.next();
            System.out.println(it.getKey() + " - " + it.getValue());
        }
    }
}
