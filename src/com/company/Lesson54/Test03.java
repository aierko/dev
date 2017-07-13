package com.company.Lesson54;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by user on 30.01.2017.
 * /* Вывести на экран список значений
 Есть коллекция HashMap<String, String>, туда занесли 10 различных строк.
 Вывести на экран список значений, каждый элемент с новой строки.
 *
 */
public class Test03 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("klo","klo");
        map.put("klo1","klo1");
        map.put("okko","okko");
        map.put("wog","wog");
        map.put("klo3","klo3");

        Iterator<Map.Entry<String,String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String> entry = iterator.next();
            System.out.println(entry.getValue());
        }
    }
}
