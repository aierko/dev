package com.company.Lesson54;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by user on 30.01.2017.
 * /* HashMap из 4 пар
 Создать коллекцию HashMap<String, String>, занести туда 4 пары строк:
 арбуз - ягода, банан - трава, вишня - ягода, груша - фрукт
 Вывести содержимое коллекции на экран, каждый элемент с новой строки.
 Пример вывода (тут показана только одна строка):
 груша - фрукт
 */
public class Test01 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Арбуз","ягода");
        map.put("Банан","трава");
        map.put("Вишня","Ягода");
        map.put("Груша","фрукт");

        Iterator<Map.Entry<String, String>> map2 = map.entrySet().iterator();
        while (map2.hasNext()){
            Map.Entry<String, String> entry = map2.next();
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
