package com.company.Lesson56;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by user on 03.02.2017.
 * три пары с клавиатуры и ввывод при помощи итератора.
 *
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> map = new HashMap<>();
        map.put(reader.readLine(),reader.readLine());
        map.put(reader.readLine(),reader.readLine());
        map.put(reader.readLine(),reader.readLine());

        Iterator<Map.Entry<String, String>> krol = map.entrySet().iterator();
        while (krol.hasNext()){
            Map.Entry<String,String> iter = krol.next();
            System.out.println(iter.getKey() + " - " + iter.getValue());
            }
        }
    }


