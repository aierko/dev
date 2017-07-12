package com.company.Lesson101;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by User on 04.07.2017.
 *//* Set из котов
1. Внутри класса создать public static класс кот – Cat.
2. Реализовать метод createCats, он должен создавать множество (Set) котов и добавлять в него 3 кота.
3. В методе main удалите одного кота из Set cats.
4. Реализовать метод printCats, он должен вывести на экран всех котов, которые остались во множестве. Каждый кот с новой строки.
*/
public class Test01 {
    public static void main(String[] args) {
        Set<Cat> set = new HashSet<>();
        createCats(set);
        Iterator<Cat> iterator = set.iterator();
        while (iterator.hasNext()){
            iterator.next();
            iterator.remove();
            break;
        }

        System.out.println(set);

    }

    public static class Cat {
        String name;

        public Cat(String n) {
            this.name = n;
        }

    }

    public static Set<Cat> createCats(Set<Cat> set) {
        Cat cat1 = new Cat("Barsik");
        Cat cat2 = new Cat("Murzik");
        Cat cat3 = new Cat("Chopa");
        set.add(cat1);
        set.add(cat2);
        set.add(cat3);
        return set;
    }

}
