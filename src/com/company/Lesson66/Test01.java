package com.company.Lesson66;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by user on 01.03.2017./* Одинаковые имя и фамилия
 * Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
 * Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
 */
public class Test01 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        Map<String, String> map = new HashMap<>();
        initializeMap(map);
        System.out.println(sovpadenieName(map));
        System.out.println(sovpadenieSurname(map));
    }

    public static void initializeMap(Map<String, String> map) {
        map.put("Sim1", "Simn");
        map.put("Simn", "Tomn");
        map.put("Simn", "Arbusn");
        map.put("Baby", "Simn");
        map.put("Art", "Simn");
        map.put("Sim", "Dogn");
        map.put("Eat", "Eatn");
        map.put("Food", "Foodn");
        map.put("Gevey", "Geveyn");
        map.put("Hugs", "Hugsn");
    }

    public static int sovpadenieName(Map<String, String> map) throws IOException {
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        String name = reader.readLine();
        int count = 0;
        while (iterator.hasNext()) {
            Map.Entry<String, String> pair = iterator.next();
            if (pair.getValue().equals(name)) {
                count++;
            }
        }
        return count;
    }

    public static int sovpadenieSurname(Map<String, String> map) throws IOException {
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        String surname = reader.readLine();
        int count = 0;
        while (iterator.hasNext()) {
            Map.Entry<String, String> pair = iterator.next();
            if (pair.getKey().equals(surname)) {
                count++;
            }
        }
        return count;
    }
}
