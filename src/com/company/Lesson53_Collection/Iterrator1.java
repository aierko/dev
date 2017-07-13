package com.company.Lesson53_Collection;

import java.util.*;

/**
 * Created by user on 27.01.2017.
 */
public class Iterrator1 {
    public static void main(String[] args) {
        List<String> array = new ArrayList<>();
        array.add("clon1");
        array.add("clon2");
        array.add("clon3");

        Iterator<String> arr = array.iterator();
        while (arr.hasNext()){
            String a = arr.next();
            System.out.println(a);
        }
        System.out.println("_______________________________________");

        Set<String> set = new HashSet<>();
        set.add("close1");
        set.add("close2");
        set.add("close3");

        Iterator<String> set1 = set.iterator();
        while (set1.hasNext()){
            String d = set1.next();
            System.out.println(d);
        }
        System.out.println("_________________________________________");

        Map<String, String> map = new HashMap<>();
        map.put("clon", "key");
        map.put("clon1", "key1");
        map.put("clon2", "key2");
        System.out.println(map.get("clon"));
        Iterator<Map.Entry<String, String>> iterator1 = map.entrySet().iterator();

        while (iterator1.hasNext()){
            Map.Entry<String, String> pair = iterator1.next();
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }


}
