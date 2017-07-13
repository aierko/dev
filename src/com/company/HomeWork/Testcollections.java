package com.company.HomeWork;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by user on 19.04.2017.
 */
public class Testcollections {
    // List l = human.subList(3, 5);
    public static void main(String[] args) {
        String[] words = {"Kolya", "Jora", "Vasya"};
        List<String> word = Arrays.asList(words);
        Collections.synchronizedList(word);
        System.out.println(word);
        Collections.reverse(word);
        System.out.println(word);
        Set<Integer> set1 = new TreeSet<>();
        Collections.addAll(set1, 7, 4, 2, 5, 6, 1, 9);
        System.out.println(set1);
        new TreeMap<>();
        Collections.unmodifiableList(word);
        List<String> list = new CopyOnWriteArrayList<>();
        list.add("triangle");
        list.add("crown");
        list.add("fish");
        for (String s : list) {
           list.remove(s);
        }

        System.out.println(list);

    }

}
