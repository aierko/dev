package com.company.Lesson58;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 08.02.2017.
 * /* Коллекция HashMap из котов
 * Есть класс Cat с полем имя (name, String).
 * Создать коллекцию HashMap<String, Cat>.
 * Добавить в коллекцию 10 котов, в качестве ключа использовать имя кота из массива:
 * String[] cats = new String[] {"васька", "мурка", "дымка", "рыжик", "серый", "снежок", "босс", "борис", "визя", "гарфи"};
 * В качестве значения использовать экземпляр кота, с переданным именем из массива в конструктор.
 * В классе Cat метод toString() должен переводить переданное в конструктор имя в верхний регистр ( метод toUpperCase() )
 * Вывести результат на экран, каждый элемент с новой строки.
 * Вывести результат на экран в виде:
 * васька - ВАСЬКА
 * мурка - МУРКА
 * ...
 */
public class Test02 {
    public static void main(String[] args) {
        String[] cats = new String[]{"васька", "мурка", "дымка", "рыжик", "серый", "снежок", "босс", "борис", "визя", "гарфи"};
        Map<String, Cat> map = cat1(cats);
        for (Map.Entry<String, Cat> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    public static Map<String, Cat> cat1(String[] cats) {
        Map<String, Cat> arr = new HashMap<>();
        for (int i = 0; i < cats.length; i++) {
            arr.put(cats[i], new Cat(cats[i]));
        }
        return arr;

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


}
