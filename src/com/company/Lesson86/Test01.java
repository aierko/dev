package com.company.Lesson86;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 05.05.2017.
 * /* Удалить людей, имеющих одинаковые имена
 Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
 Удалить людей, имеющих одинаковые имена.
 */
public class Test01 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        mapaImeni(map);
         map = nahojdenieDublya(map);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry);
        }
    }
    public static void mapaImeni (Map<String,String> map){
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
    public static Map<String,String> nahojdenieDublya(Map<String,String> map){
        Map<String,String> map1 = new HashMap<>();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            int count = 0;
            for (String s : map.values()) {
                if (entry.getValue().equals(s)){
                    count++;
                }
            }
            if (count == 1){
                map1.put(entry.getKey(), entry.getValue());
            }
        }
        return map1;
    }
}
