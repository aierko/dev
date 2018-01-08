package com.company.Lesson67;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 06.03.2017.
 * /* Удалить всех людей, родившихся летом
 * Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
 * Удалить из словаря всех людей, родившихся летом.
 */
public class Test01 {
    public static void main(String[] args) {
        Map<String, Date> map = new HashMap<>();
        spisok(map);
        map = clearDate(map);
        for (Map.Entry<String, Date> stringDateEntry : map.entrySet()) {
            System.out.println(stringDateEntry);
        }
    }

    public static void spisok(Map<String, Date> map) {
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
    }

    public static Map clearDate(Map<String, Date> map) {
        Map<String, Date> map1 = new HashMap<>();
        for (Map.Entry<String, Date> entry : map.entrySet()) {
            if (entry.getValue().getMonth() >= 5 && entry.getValue().getMonth() <= 7) {
            } else map1.put(entry.getKey(), entry.getValue());
        }
        return map1;
    }
}
