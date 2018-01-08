package com.company.Lesson79;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
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
public class Test01 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        Map<String, String> map = new HashMap<>();
        map.put(reader.readLine(), reader.readLine());
        map.put(reader.readLine(), reader.readLine());
        map.put(reader.readLine(), reader.readLine());
        poiskGoroda(map);
    }
    public static void poiskGoroda(Map<String, String> map) throws IOException {
        Iterator<Map.Entry<String, String>> iter = map.entrySet().iterator();
        String name = reader.readLine();
        while(iter.hasNext()){
            Map.Entry<String, String> iter1 = iter.next();
            if (iter1.getKey().equals(name)){
                System.out.println(iter1.getKey() + "  -  " + iter1.getValue());
            }
        }
    }
}
