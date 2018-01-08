package com.company.Lesson101;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by User on 04.07.2017.
 * /* Множество всех животных
 * 1. Внутри класса Solution создать public static классы Cat, Dog.
 * 2. Реализовать метод createCats, котороый должен возвращать множество с 4 котами.
 * 3. Реализовать метод createDogs, котороый должен возвращать множество с 3 собаками.
 * 4. Реализовать метод join, котороый должен возвращать объединенное множество всех животных - всех котов и собак.
 * 5. Реализовать метод removeCats, котороый должен удалять из множества pets всех котов, которые есть в множестве cats.
 * 6. Реализовать метод printPets, котороый должен выводить на экран всех животных, которые в нем есть.
 * Каждое животное с новой строки
 */
public class Test02 {
    public static void main(String[] args) {
        Set<Cat> cats = new HashSet<>();
        Set<Dog> dogs = new HashSet<>();
        createCats(cats);
        createDog(dogs);
      Set<Object> animal = join(cats,dogs);
      catRemove(animal,cats);
      printCats(animal);


    }

    public static class Cat {
        @Override
        public String toString() {
            return ("Cat");
        }
    }

    public static void createCats(Set<Cat> cats) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);

    }

    public static class Dog {
        @Override
        public String toString() {
            return("Dog");
        }
    }

    public static void createDog(Set<Dog> dogs) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);

    }

    public static Set<Object> join(Set<Cat> dogs, Set<Dog> cats) {
        Set<Object> animal = new HashSet<>();
        animal.addAll(cats);
        animal.addAll(dogs);
        return animal;
    }

    public static void catRemove(Set<Object> animal, Set<Cat> cats) {
        animal.removeAll(cats);
    }

    public static void printCats(Set<Object> animal) {
        for (Object o : animal) {
            System.out.println(o);
        }
    }
}
