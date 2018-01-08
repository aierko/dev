package com.company.Lesson80;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 07.04.2017.
 * /* Удалить людей, имеющих одинаковые имена
 Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
 Удалить людей, имеющих одинаковые имена.
 */
public class Test01 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
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
        udalenieImeni(map);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry);
        }


    }
    public static Map<String, String> udalenieImeni(Map<String,String> map) {
        Map<String, String> map1 = new HashMap<>();
        int count = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            for (Map.Entry<String, String> stringStringEntry : map1.entrySet()) {
                if (entry.getValue().equals(stringStringEntry.getValue())) {
                }
                count++;
            }
            if (count == 1) {
                map1.put(entry.getKey(), entry.getValue());
            }
            else map1.remove(entry.getKey(), entry.getValue());

        }
        return map1;
    }

}
