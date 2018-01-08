package com.company.Lesson76;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by user on 29.03.2017.
 * /* Множество всех животных
 1. Внутри класса Solution создать public static классы Cat, Dog.
 2. Реализовать метод createCats, котороый должен возвращать множество с 4 котами.
 3. Реализовать метод createDogs, котороый должен возвращать множество с 3 собаками.
 4. Реализовать метод join, котороый должен возвращать объединенное множество всех животных - всех котов и собак.
 5. Реализовать метод removeCats, котороый должен удалять из множества pets всех котов, которые есть в множестве cats.
 6. Реализовать метод printPets, котороый должен выводить на экран всех животных, которые в нем есть. Каждое животное с новой строки
 */
public class Test01 {
    public static void main(String[] args) {
        Set<Cat> catsSet = new HashSet<>();
        Set<Dog> dogsSet = new HashSet<>();
        createCats(catsSet);
        createDogs(dogsSet);
        Set<Object> pets =  join(catsSet,dogsSet);
        removeCats(catsSet,pets);
        printPets(pets);
    }
    public static class Cat{
        @Override
        public String toString() {
            return ("Cat");
        }
    }
    public static class Dog{
        @Override
        public String toString() {
            return ("Dog");
        }
    }
    public static void createCats(Set<Cat> set){
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();
        set.add(cat1);
        set.add(cat2);
        set.add(cat3);
        set.add(cat4);
    }

    public static void createDogs(Set<Dog> set1) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
        set1.add(dog1);
        set1.add(dog2);
        set1.add(dog3);
    }
    public static Set<Object> join(Set<Cat> set, Set <Dog> set1){
       Set<Object> pets = new HashSet<>();
        pets.addAll(set);
        pets.addAll(set1);
        return pets;
    }
    public static void removeCats(Set<Cat> set, Set<Object> pets){
        pets.removeAll(set);
    }
    public static void printPets(Set<Object> pets){
        for (int i = 0; i < pets.size(); i++) {

        }
    }
}

