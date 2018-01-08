package com.company.Lesson77;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by user on 31.03.2017.
 * /* Номер месяца
 * Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
 * Используйте коллекции.
 */
public class Test02 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        Map<String, Integer> map = year();
        poisk(map);
    }


    public static Map<String, Integer> year() {
        Map<String, Integer> map = new HashMap<>();
        map.put("January", 1);
        map.put("February", 2);
        map.put("March", 3);
        map.put("April", 4);
        map.put("May", 5);
        map.put("June", 6);
        map.put("July", 7);
        map.put("August", 8);
        map.put("September", 9);
        map.put("October", 10);
        map.put("November", 11);
        map.put("December", 12);
        return map;
    }

    public static void poisk(Map<String, Integer> map) throws IOException {
        Iterator<Map.Entry<String, Integer>> mapIterator = map.entrySet().iterator();
        String a = reader.readLine();
        while (mapIterator.hasNext()) {
            Map.Entry<String, Integer> iter = mapIterator.next();
            if (iter.getKey().equals(a)) {
                System.out.println("«" + iter.getKey() + " is " + iter.getValue() + " month»");
            }
        }
    }

}
