package com.company.HomeWork;

import com.company.Lesson57.Test02;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 24.04.2017.
 */
public class Work21 {
    public static void main(String[] args) {
        String[] cats = new String[]
                {"васька", "мурка", "дымка", "рыжик", "серый", "снежок", "босс", "борис", "визя", "гарфи"};
        cat(cats);
        System.out.println(cat(cats));
    }

    public static class Cat {
        String name;

        public Cat(String n) {
            this.name = n;
        }


        @Override
        public String toString() {
            return (name.toUpperCase());
        }
    }

    public static Map cat(String[] array) {
        Map<String, Test02.Cat> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            map.put(array[i], new Test02.Cat(array[i]));
        }
        return map;
    }
}
