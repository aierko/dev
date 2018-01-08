package com.company.Lesson59;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by user on 10.02.2017.
 * Создать МАР на три пары и пройтись по нему итератором.
 */
public class Test03 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> map = new HashMap<>();
        map.put(reader.readLine(), reader.readLine());
        map.put(reader.readLine(), reader.readLine());
        map.put(reader.readLine(), reader.readLine());

        Iterator<Map.Entry<String,String>> iter = map.entrySet().iterator();
        while (iter.hasNext()){
            Map.Entry<String,String> pair = iter.next();
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }
}
