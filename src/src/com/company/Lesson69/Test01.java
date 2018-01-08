package com.company.Lesson69;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 13.03.2017./* Удалить всех людей, родившихся летом
 * Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
 * Удалить из словаря всех людей, родившихся летом.
 */
public class Test01 {
    public static void main(String[] args) {
        Map<String, Date> map = new HashMap<>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Stallone1", new Date("JUNE 5 1999"));
        map.put("Stallone2", new Date("JUNE 13 1996"));
        map.put("Stallone3", new Date("JUNE 1 1980"));
        map.put("Stallone4", new Date("JUNE 1 1980"));
        map.put("Stallone5", new Date("JUNE 1 1980"));
        map.put("Stallone6", new Date("JUNE 1 1980"));
        map.put("Stallone7", new Date("JUNE 1 1980"));
        map.put("Stallone8", new Date("DECEMBER 1 1980"));
        map.put("Stallone9", new Date("MARCH 1 1980"));
        Map<String, Date> map2;
        map2 = book(map);
        for (Map.Entry<String, Date> e : map2.entrySet()) {
            System.out.println(e.getKey() + " - " + e.getValue());
        }
    }

    public static Map<String, Date> book(Map<String, Date> map) {
        Map<String, Date> map1 = new HashMap<>();
        for (Map.Entry<String, Date> pair : map.entrySet()) {
            Date time = pair.getValue();
            if (time.getMonth() < 5 || time.getMonth() > 7) {
                map1.put(pair.getKey(), pair.getValue());
            }
        }
        return map1;
    }
}
