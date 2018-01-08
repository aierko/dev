package com.company.Lesson119;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by User on 24.09.2017.
 * /* Удалить людей, имеющих одинаковые имена
 Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
 Удалить людей, имеющих одинаковые имена.
 */
public class Test01 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        teamMap(map);
        map = deleteSurname(map);
//        for (Map.Entry<String, String> entry : map.entrySet()) {
//            System.out.println(entry);
//        }
        Iterator<Map.Entry<String, String>> iteratorForMap = map.entrySet().iterator();
        while (iteratorForMap.hasNext()){
            Map.Entry<String,String> entry = iteratorForMap.next();
            System.out.println(entry);
        }




//        String name = map.get("Lloris");
//        System.out.println(name);
    }
    public static Map<String, String> teamMap(Map<String,String> map){
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
        return map;
    }
    public static Map<String,String> deleteSurname(Map<String,String> map){
        Map<String,String> map1 = new HashMap<>();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            int count = 0;
            for (Map.Entry<String, String> entry1 : map.entrySet()) {
                if (entry.getValue().equals(entry1.getValue())){
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
