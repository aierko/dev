package com.company.Lesson79;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by user on 06.04.2017./**
 * Created by user on 05.04.2017./*
 Задача: Программа определяет, какая семья (фамилию) живёт в указанном городе.
 Пример ввода:
 Москва
 Ивановы
 Киев
 Петровы
 Лондон
 Абрамовичи

 Лондон

 Пример вывода:
 Абрамовичи
 */
public class Tesst03 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        Map<String,String> map = new HashMap<>();
        map.put(reader.readLine(), reader.readLine());
        map.put(reader.readLine(), reader.readLine());
        map.put(reader.readLine(), reader.readLine());
        shukachkaSepariv(map);
    }
    public static void shukachkaSepariv(Map<String, String> map) throws IOException {
        Iterator<Map.Entry<String, String>> inter = map.entrySet().iterator();
        String name = reader.readLine();
        while (inter.hasNext()){
           Map.Entry<String,String> name1 = inter.next();
            if (name1.getKey().equals(name)){
                System.out.println(name1.getKey() + " = " + name1.getValue());
            }
        }
    }
}



