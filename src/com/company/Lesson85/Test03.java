package com.company.Lesson85;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 03.05.2017.
 * /* Удалить людей, имеющих одинаковые имена
 * Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
 * Удалить людей, имеющих одинаковые имена.
 */
public class Test03 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        italy(map);
        map = poisk(map);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry);
        }

    }

    public static void italy(Map<String, String> map) {
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

    public static Map<String, String> poisk(Map<String, String> map) {
        Map<String, String> map1 = new HashMap<>();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            int count = 0;
            for (String s : map.values()) {
                if (entry.getValue().equals(s)) {
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
