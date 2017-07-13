package com.company.Lesson65;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by user on 27.02.2017.
 * /* Удалить всех людей, родившихся летом
 * Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
 * Удалить из словаря всех людей, родившихся летом.
 */
public class Test05 {
    public static void main(String[] args) {
        Map<String, Date> map = new HashMap<>();
        book(map);
        map = removePairFromMap(map);
        System.out.println(map);
    }

    public static void book(Map<String, Date> map) {
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Stallone1", new Date("JUNE 5 1999"));
        map.put("Stallone2", new Date("JUNE 13 1996"));
        map.put("Stallone3", new Date("JUNE 1 1980"));
        map.put("Stallone4", new Date("JULY 1 1980"));
        map.put("Stallone5", new Date("AUGUST 1 1980"));
        map.put("Stallone6", new Date("JUNE 1 1980"));
        map.put("Stallone7", new Date("JUNE 1 1980"));
        map.put("Stallone8", new Date("DECEMBER 1 1980"));
        map.put("Stallone9", new Date("MARCH 1 1980"));
    }

    public static Map removePairFromMap(Map<String, Date> map) {
        Iterator<Map.Entry<String, Date>> surname = map.entrySet().iterator();
        while (surname.hasNext()) {
            Map.Entry<String, Date> pair = surname.next();
            int month = pair.getValue().getMonth();
            if (month >= 5 && month <= 7) {
                surname.remove();
            }
        }
        return map;
    }
}

