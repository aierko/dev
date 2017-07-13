package com.company.Lesson55;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by user on 01.02.2017.
 * Создать и заполнить Мар на три пары и вывести на экран.
 */

public class Test02 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Strong", "Strong1");
        map.put("Strong3", "Strong3");
        map.put("Strong2", "Strong2");

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String> para = iterator.next();
            System.out.println(para.getKey() + " - " + para.getValue());
        }
    }
}
