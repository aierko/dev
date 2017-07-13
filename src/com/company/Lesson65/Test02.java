package com.company.Lesson65;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by user on 27.02.2017.
 * /* Одинаковые имя и фамилия
 * Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
 * Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
 */
public class Test02 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
     Map<String, String> map = new HashMap<>();
        creatMethod(map);
        System.out.println(poiskImeni(map));
        System.out.println(poiskFamilii(map));
    }

    public static void creatMethod(Map<String, String> map) throws IOException {

        map.put("Sim1", "Simn");
        map.put("Sim", "Tomn");
        map.put("Sim", "Arbusn");
        map.put("Baby", "Simn");
        map.put("Art", "Simn");
        map.put("Sim", "Dogn");
        map.put("Eat", "Eatn");
        map.put("Food", "Foodn");
        map.put("Gevey", "Geveyn");
        map.put("Hugs", "Hugsn");
    }

    public static int poiskImeni(Map<String, String> map) throws IOException {
        String name = reader.readLine();
        Iterator<Map.Entry<String, String>> name1 = map.entrySet().iterator();
        int count = 0;
        while (name1.hasNext()){
            Map.Entry<String, String> name2 = name1.next();
            if (name2.getValue().equals(name)){
               count ++;
            }
        }
        return count;
    }
    public static int poiskFamilii(Map<String,String> map) throws IOException {
        String name = reader.readLine();
        Iterator<Map.Entry<String, String>> name1 = map.entrySet().iterator();
        int count2 = 0;
        while (name1.hasNext()){
            Map.Entry<String, String> name2 = name1.next();
            if (name2.getKey().equals(name)){
                count2 ++;
            }
        }
        return count2;
    }
}

