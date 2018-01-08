package com.company.Lesson73;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by user on 24.03.2017./* Set из котов
 * 1. Внутри класса создать public static класс кот – Cat.
 * 2. Реализовать метод createCats, он должен создавать множество (Set) котов и добавлять в него 3 кота.
 * 3. В методе main удалите одного кота из Set cats.
 * 4. Реализовать метод printCats, он должен вывести на экран всех котов, которые остались во множестве. Каждый кот с новой строки.
 */
public class Test02 {
    public static void main(String[] args) {
        Set<Cat> cats = new HashSet<>();
        createCats(cats);
        Iterator<Cat> catIterator;
        catIterator = cats.iterator();
        while (catIterator.hasNext()) {
            catIterator.next();
            catIterator.remove();
            break;
        }
        printCats(cats);
    }
    public static void printCats(Set<Cat> set){
        for (Cat cat1 : set) {
            System.out.println(cat1);
        }
    }

    public static class Cat {
        @Override
        public String toString() {
            return "Cat";
        }
    }

    public static void createCats(Set<Cat> set) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        set.add(cat1);
        set.add(cat2);
        set.add(cat3);


    }
}
