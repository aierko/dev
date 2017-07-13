package com.company.Lesson68;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by user on 08.03.2017./* Удалить всех людей, родившихся летом
 * Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
 * Удалить из словаря всех людей, родившихся летом.
 */
public class Test02 {
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
        Map<String, Date> map1 = new HashMap<>();
        map1 = info(map);
        for (Map.Entry<String, Date> entry : map1.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

    }

    public static Map info(Map<String, Date> map) {
        Map<String, Date> resultMap = new HashMap<>();

        for (Map.Entry<String, Date> pair : map.entrySet()) {
            Date date = pair.getValue();

            if (date.getMonth() < 5 || date.getMonth() > 7) {
                resultMap.put(pair.getKey(), pair.getValue());
            }
        }
        return resultMap;
    }

    public static void info1(Map<String, Date> map) {
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Date> pair = iterator.next();
            Date date = pair.getValue();
            if (date.getMonth() > 4 && date.getMonth() < 8) {
                iterator.remove();
            }
        }
    }
}
