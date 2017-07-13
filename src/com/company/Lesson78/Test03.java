package com.company.Lesson78;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by user on 02.04.2017.Задача: Программа определяет, какая семья (фамилию) живёт в указанном городе.
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

  0[] 1[] 2[] 3[]
 []-[]-[]-[]-[]-[]
 */
public class Test03 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        Map<String, String> map = new HashMap<>();
        map.put("Москва", "Ивановы");
        map.put("Киев", "Петровы");
        map.put("Лондон", "Абрамовичи");
        poiskGoroda(map);

    }
    public static void poiskGoroda(Map<String,String> map) throws IOException {
        Iterator<Map.Entry<String,String>> iter = map.entrySet().iterator();
        String city = reader.readLine();
        while (iter.hasNext()){
            Map.Entry<String,String> iter2 = iter.next();
            if (iter2.getKey().equals(city)){
                System.out.println(iter2.getValue());
            }
        }
    }
}
