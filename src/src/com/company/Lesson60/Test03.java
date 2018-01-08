package com.company.Lesson60;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by user on 13.02.2017.
 * создать мар на три пары, заполнить и вывести из себя на экран!!
 */
public class Test03 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> map = new HashMap<>();
        map.put(reader.readLine(),reader.readLine());
        map.put(reader.readLine(),reader.readLine());
        map.put(reader.readLine(),reader.readLine());

        Iterator<Map.Entry<String, String>> iter1 = map.entrySet().iterator();
        while (iter1.hasNext()){
            Map.Entry<String,String> pair = iter1.next();
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }

    }
}
