package com.company.Lesson59;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 10.02.2017./* Коллекция HashMap из котов
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
        String[] cats = new String[]
                {"васька", "мурка", "дымка", "рыжик", "серый", "снежок", "босс", "борис", "визя", "гарфи"};
        System.out.println(metod(cats));

    }

    public static Map metod(String[] cats) {
        Map<String, Cat> map = new HashMap<>();
        for (int i = 0; i < cats.length; i++) {
            map.put(cats[i], new Cat(cats[i]));
        }
        return map;
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



