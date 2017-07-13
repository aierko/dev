package com.company.Lesson70;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * /* Удалить всех людей, родившихся летом
 Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
 Удалить из словаря всех людей, родившихся летом.
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
        clearFIO(map);
        for (Map.Entry<String, Date> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

    }
    public static void clearFIO(Map<String, Date> map){
        Iterator<Map.Entry<String, Date>> iter = map.entrySet().iterator();
        while (iter.hasNext()){
            Map.Entry<String,Date> para = iter.next();
            Date time1 = para.getValue();
            if (time1.getMonth() > 4 && time1.getMonth() < 8){
                iter.remove();
            }
        }
    }
}
