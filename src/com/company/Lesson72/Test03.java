package com.company.Lesson72;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by user on 21.03.2017./* Одинаковые имя и фамилия
 Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
 Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
 */
public class Test03 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> map = new HashMap<>();
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
        System.out.println(chekingName(map));
        System.out.println(chekingSurname(map));
    }
    public static int chekingName(Map<String,String> map) throws IOException {
        Iterator<Map.Entry<String, String>> pair  = map.entrySet().iterator();
        int count1 = 0;
        String name = reader.readLine();
        while (pair.hasNext()){
            if (pair.next().getValue().equals(name)){
                count1 ++;
            }
        }
        return count1;
    }
    public static int chekingSurname(Map<String,String> map) throws IOException {
        Iterator<Map.Entry<String,String>> pair = map.entrySet().iterator();
        int count2 = 0;
        String surname = reader.readLine();
        while (pair.hasNext()){
            if (pair.next().getKey().equals(surname)){
                count2 ++;
            }
        }
        return count2;
    }




}
