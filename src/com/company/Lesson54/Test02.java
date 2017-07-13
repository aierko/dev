package com.company.Lesson54;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by user on 30.01.2017.
 * /* Вывести на экран список ключей
 Есть коллекция HashMap<String, String>, туда занесли 3 различные строки.
 При помощи метода printKeys:
 Вывести на экран список ключей, каждый элемент с новой строки.
 *
 */
public class Test02 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("MIB", "KPI");
        map.put("Ktep", "KTEp");
        map.put("DBM", "KRTi");

        printKeys(map);
    }

    public static void printKeys(Map<String, String> map1) {
        Iterator<Map.Entry<String, String>> iter = map1.entrySet().iterator();
        while (iter.hasNext()){
            Map.Entry<String, String> entry = iter.next();
            System.out.println(entry.getKey());
        }
    }
}