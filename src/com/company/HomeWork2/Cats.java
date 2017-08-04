package com.company.HomeWork2;

import java.util.*;

/**
 * Created by User on 03.08.2017.
 * <p>
 * /**
 * Created by User on 14.07.2017./* Десять котов
 * Создать класс кот – Cat, с полем «имя» (String).
 * Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот». - createMap()
 * Получить из Map множество(Set) всех имен и вывести его на экран. - convertMapToSet(Map<String, Cat> map)
 */
public class Cats {
    public static void main(String[] args) {
        Map<String, Cat> map = new HashMap<>();
        crateMap(map);
        Set<String> set = convertMapToSet(map);
        for (String s : set) {
            System.out.println(s);
        }

    }


    public static class Cat {
        String name;

        public Cat(String n) {
            this.name = n;
        }

        @Override
        public String toString() {
            return "Cat" + this.name;
        }
    }

    public static void crateMap(Map<String, Cat> map) {
        map.put("Cat1", new Cat("Jorik"));
        map.put("Cat2", new Cat("Jorik"));
        map.put("Cat3", new Cat("Jorik"));
        map.put("Cat4", new Cat("Jorik"));
        map.put("Cat5", new Cat("Jorik"));
        map.put("Cat6", new Cat("Jorik"));
        map.put("Cat7", new Cat("Jorik"));
        map.put("Cat8", new Cat("Jorik"));
        map.put("Cat9", new Cat("Jorik"));
        map.put("Cat10", new Cat("Jorik"));
    }

    public static Set<String> convertMapToSet(Map<String, Cat> map) {
        Set<String> set = new HashSet<>();
        Iterator<Map.Entry<String, Cat>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            set.add(iterator.next().getKey());
        }
        return set;
    }


}
