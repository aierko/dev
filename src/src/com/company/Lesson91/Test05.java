package com.company.Lesson91;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 17.05.2017.
 * /* Исключение при работе с коллекциями Map
 Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
 Map<String, String> map = new HashMap<String, String>(null);
 map.put(null, null);
 map.remove(null);
 */
public class Test05 {
    public static void main(String[] args) {
        try {
            Map<String, String> map = new HashMap<String, String>(null);
            map.put(null, null);
            map.remove(null);
        }
        catch (NullPointerException e){
            System.out.println(" close");
        }
    }
}
