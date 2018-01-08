package com.company.Lesson56;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by user on 03.02.2017.
 * Integer, Integer.
 */
public class Test02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, Integer> map = new HashMap<>();
        map.put(Integer.parseInt(reader.readLine()), Integer.parseInt(reader.readLine()));
        map.put(Integer.parseInt(reader.readLine()), Integer.parseInt(reader.readLine()));
        map.put(Integer.parseInt(reader.readLine()), Integer.parseInt(reader.readLine()));

        Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer,Integer> iter = iterator.next();
            System.out.println(iter.getKey() + " - " + iter.getValue());
        }
    }
}
