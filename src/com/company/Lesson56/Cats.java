package com.company.Lesson56;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 03.02.2017.
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
public class Cats {
    public static void main(String[] args) {
        String[] cats = new String[]
                {"васька", "мурка", "дымка", "рыжик", "серый", "снежок", "босс", "борис", "визя", "гарфи"};
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

    public static Map cat(String[] arr) {
        Map<String, Cat> cat1 = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            cat1.put(arr[i], new Cat(arr[i]));
        }
        return cat1;
    }


}
