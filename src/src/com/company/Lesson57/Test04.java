package com.company.Lesson57;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by user on 06.02.2017.
 * создать по одной коллекции типа List, Set, Map.
 * Заполняем их и выводим на экран, выводим при помощи итератора каждый элемент.
 */
public class Test04 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> array = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            array.add(reader.readLine());
        }
        Iterator<String> array1 = array.iterator();
        while (array1.hasNext()) {
            String s = array1.next();
            System.out.println(s);
        }
        Set<String> set = new HashSet();
         set.add(reader.readLine());
        Iterator<String> set1 = set.iterator();
        while (set1.hasNext()){
            String d = set1.next();
            System.out.println(d);
        }
        Map<String,String> map = new HashMap<>();
        map.put(reader.readLine(),reader.readLine());
        map.put(reader.readLine(),reader.readLine());
        map.put(reader.readLine(),reader.readLine());

        Iterator<Map.Entry<String,String>> iter = map.entrySet().iterator();
        while (iter.hasNext()){
            Map.Entry<String,String> iter2 = iter.next();
            System.out.println(iter2.getKey() + " - " + iter2.getValue());
        }

    }       
}
