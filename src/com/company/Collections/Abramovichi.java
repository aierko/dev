package com.company.Collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by user on 01.05.2017.
 * /**
 * Created by user on 05.04.2017./*
 * Задача: Программа определяет, какая семья (фамилию) живёт в указанном городе.
 * Пример ввода:
 * Москва
 * Ивановы
 * Киев
 * Петровы
 * Лондон
 * Абрамовичи
 * <p>
 * Лондон
 * <p>
 * Пример вывода:
 * Абрамовичи
 */
public class Abramovichi {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
          met();
    }

    public static void met() throws IOException {
        Map<String, String> map = new HashMap<>();
        bazaDannikh(map);
        poisk(map);
    }

    public static void bazaDannikh(Map<String, String> map) throws IOException {
        map.put(reader.readLine(), reader.readLine());
        map.put(reader.readLine(), reader.readLine());
        map.put(reader.readLine(), reader.readLine());
    }


    public static void poisk(Map<String, String> map) throws IOException {
        Iterator<Map.Entry<String, String>> para = map.entrySet().iterator();
        String name = reader.readLine();
        while (para.hasNext()) {
            Map.Entry<String, String> iter = para.next();
            if (iter.getKey().equals(name)) {
                System.out.println(iter.getKey() + " " + iter.getValue());
            }
        }
    }
}
