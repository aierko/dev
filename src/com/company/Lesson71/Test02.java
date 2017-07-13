package com.company.Lesson71;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by user on 17.03.2017./* Set из котов
 * 1. Внутри класса создать public static класс кот – Cat.
 * 2. Реализовать метод createCats, он должен создавать множество (Set) котов и добавлять в него 3 кота.
 * 3. В методе main удалите одного кота из Set cats.
 * 4. Реализовать метод printCats, он должен вывести на экран всех котов, которые остались во множестве. Каждый кот с новой строки.
 */
public class Test02 {
    public static void main(String[] args) {
        Set<Cat> delete = new HashSet<>();
        createCats(delete);
        Iterator<Cat> iterator = delete.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
            break;
        }
         printCats(delete);
    }

    public static void printCats(Set<Cat> set1) {
        for (Cat c : set1) {
            System.out.println(c);
        }
    }

    public static class Cat {
        @Override
        public String toString() {
            return "Cat";
        }
    }

    public static void createCats(Set<Cat> cats) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
    }
}
