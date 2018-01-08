package com.company.Lesson53_Collection;

/**
 * Created by user on 27.01.2017.
 * /* HashMap из 4 пар
 Создать коллекцию HashMap<String, String>, занести туда 4 пары строк:
 арбуз - ягода, банан - трава, вишня - ягода, груша - фрукт
 Вывести содержимое коллекции на экран, каждый элемент с новой строки.
 Пример вывода (тут показана только одна строка):
 груша - фрукт
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class Iterrator2 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("арбуз", "ягода");
        map.put("банан","трава");
        map.put("вишня","ягода");
        map.put("груша","фрукт");

        Iterator<Map.Entry<String, String>> map1 = map.entrySet().iterator();
        while (map1.hasNext()){
            Map.Entry<String,String> pair = map1.next();
            System.out.println(pair.getKey()+ " - " + pair.getValue());
        }
        System.out.println("_________________________________________________");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

    }

}
