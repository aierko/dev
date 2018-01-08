package com.company.HomeWork;

import java.util.*;

/**
 * Created by user on 25.03.2017.
 */
public class Work20 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("s1");
        list.add("s2");
        list.add("s3");

        Iterator<String> ittList = list.iterator();
        while (ittList.hasNext()) {
            String data = ittList.next();
            System.out.println(data);
        }

        System.out.println("555555");

        Set<String> set = new HashSet<>();
        set.add("s1");
        set.add("s2");
        set.add("s3");

        Iterator<String> ittSet = set.iterator();
        while (ittSet.hasNext()) {
            String data = ittSet.next();
            System.out.println(data);
        }

        System.out.println("5555555");

        Map<String, String> map = new HashMap<>();
        map.put("test1", "frog1");
        map.put("test2", "frog");
        map.put("test3", "frog2");

        Iterator<Map.Entry<String, String>> ittMap = map.entrySet().iterator();

        while (ittMap.hasNext()) {
            Map.Entry<String, String> entry = ittMap.next();
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
