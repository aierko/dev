package com.company.Lesson57;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by user on 06.02.2017.
 * Создать три пары String, String.
 * Ввести с клавиатурыб заполнить и вывести на экран.
 */
public class Test03 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> map = new HashMap<>();
        map.put(reader.readLine(),reader.readLine());
        map.put(reader.readLine(),reader.readLine());
        map.put(reader.readLine(),reader.readLine());

        Iterator<Map.Entry<String, String>> iter = map.entrySet().iterator();
        while (iter.hasNext()){
            Map.Entry<String,String>  iter1 = iter.next();
            System.out.println(iter1.getKey() + " - " + iter1.getValue());
        }
    }
}
