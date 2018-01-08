package com.company.Lesson53_Collection;

import java.util.*;

/**
 * Created by user on 25.01.2017.
 *  -> 15 (10) (5) -> 23 (15) (8)
 * List - ArrayList, LinkedList, Vector(-)
 * Set  - HashSet ( множество - уникальные значения )
 * Map  - HashMap ( словарь   - набор пар ( ключ - значение ))
 */
public class Test02 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("text1");
        list.add("text1");
        list.add("text2");

        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("-----------------");

        Set<String> set = new HashSet<>();
        set.add("text1");
        set.add("text1");
        set.add("text2");
        set.add("text3");
        set.add("text4");
        set.add("text5");

        for (String s : set) {
            System.out.println(s);
        }
        System.out.println("-----------------");

        Map<String, String> map = new HashMap<>();
        map.put("UA", "Ukraine");
        map.put("UA", "Ukraine1");
        map.put("UA1", "Ukraine");
        map.put("PL", "Poland");
        map.put("USA", "United States");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
