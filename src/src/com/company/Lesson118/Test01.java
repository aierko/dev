package com.company.Lesson118;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by User on 18.09.2017.
 * /* Удалить людей, имеющих одинаковые имена
 * Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
 * Удалить людей, имеющих одинаковые имена.
 */
public class Test01 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        team(map);
        map = new HashMap<String, String>(deleteTheSameName(map));
        for (Map.Entry<String, String> stringStringEntry : map.entrySet()) {
            System.out.println(stringStringEntry);
        }
    }

    public static void team(Map<String, String> map) {
        map.put("Rooney", "Leo");
        map.put("Lloris", "Hugo");
        map.put("Messi", "Leo");
        map.put("Ronaldo", "Cristiano");
        map.put("Maldini", "Paolo");
        map.put("Indzaghi", "Pipo");
        map.put("Del Piero", "Alesandro");
        map.put("Balotelli", "Mario");
        map.put("Gotze", "Mario");
        map.put("Gomez", "Mario");
    }

    public static Map<String, String> deleteTheSameName(Map<String, String> map) {
        Map<String, String> map1 = new HashMap<>();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            int count = 0;
            for (Map.Entry<String, String> entry1 : map.entrySet()) {
                if (entry.getValue().equals (entry1.getValue())) {
                    count++;
                }
            }
            if (count == 1) {
                map1.put(entry.getKey(), entry.getValue());
            }
        }
        return map1;
    }
}
