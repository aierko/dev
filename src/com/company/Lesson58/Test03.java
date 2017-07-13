package com.company.Lesson58;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by user on 08.02.2017.
 * Создать МАР занести три пары по стандарту int int.
 * И вывести при помощзи аитератора.
 */
public class Test03 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, Integer> map = new HashMap<>();
        map.put(Integer.parseInt(reader.readLine()), Integer.parseInt(reader.readLine()));
        map.put(Integer.parseInt(reader.readLine()), Integer.parseInt(reader.readLine()));
        map.put(Integer.parseInt(reader.readLine()), Integer.parseInt(reader.readLine()));

        Iterator<Map.Entry<Integer, Integer>> iterator1 = map.entrySet().iterator();
        while (iterator1.hasNext()){
            Map.Entry<Integer,Integer> pair = iterator1.next();
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }
}
