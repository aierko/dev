package com.company.Lesson82;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by user on 24.04.2017.
 * Задача: Программа определяет, какая семья (фамилию) живёт в указанном городе.
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
public class Test04 {
   static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        Map<String, String> map = new HashMap<>();
        map.put(reader.readLine(), reader.readLine());
        map.put(reader.readLine(), reader.readLine());
        map.put(reader.readLine(), reader.readLine());
        nakhojdenieDannikh(map);
    }
    public static void nakhojdenieDannikh(Map<String, String> imya) throws IOException {
        Iterator<Map.Entry<String, String>> para = imya.entrySet().iterator();
        String name = reader.readLine();
        while (para.hasNext()){
            Map.Entry<String, String> iter2 = para.next();
            if (iter2.getKey().equals(name)){
                System.out.println(iter2.getKey() + " " + iter2.getValue());
            }

        }

    }

}
