package com.company.Lesson81;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 15.04.2017.
 * /* Удалить людей, имеющих одинаковые имена
 * Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
 * Удалить людей, имеющих одинаковые имена.
 */
public class Test04 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
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
        Map<String, String> map1;
        map1 = delete(map);
        for (Map.Entry<String, String> entry : map1.entrySet()) {
            System.out.println(entry);
        }
    }

    public static Map<String, String> delete(Map<String, String> surname) {
        Map<String, String> surname1 = new HashMap<>();
        for (Map.Entry<String, String> entry : surname.entrySet()) {
            int count = 0;
            for (String s : surname.values()) {
                if (entry.getValue().equals(s))
                    count++;
            }
            if (count == 1) {
                surname1.put(entry.getKey(), entry.getValue());
            }
        }
        return surname1;
    }
}
