package com.company.Lesson53_Collection;

import java.util.*;

/**
 * Created by user on 25.01.2017.
 * Создать лист заполнить на три значения и вывести на экран
 * Создать множество заполнить на три значения и вывести на экран
 * Создать словарь заполнить на три значения и вывести на экран
 */
public class Collections {
    public static void main(String[] args) {
        List<String> arr = insert();
        System.out.println(arr);
        Set<String> set = arr();
        System.out.println(set);
        Map<String, String> map = map();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
    public static List<String> insert(){
        List<String> array1 = new ArrayList<>();
        array1.add("for");
        array1.add("for1");
        array1.add("for2");
        return array1;
    }
    public static Set<String> arr(){
        Set<String> set = new HashSet<>();
        set.add("Stronger");
        set.add("Stronger1");//фУрыч)
        set.add("Stronger2");
        return set;
    }
    public static Map<String, String> map(){
        Map<String, String> map1 = new HashMap<>();
        map1.put("Flash3", "Back");
        map1.put("Flash2", "Back1");
        map1.put("Flash1", "Back");
        return map1;
    }


}

