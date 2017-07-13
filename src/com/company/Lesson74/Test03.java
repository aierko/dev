package com.company.Lesson74;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by user on 24.03.2017./* Множество всех животных
 * 1. Внутри класса Solution создать public static классы Cat, Dog.
 * 2. Реализовать метод createCats, котороый должен возвращать множество с 4 котами.
 * 3. Реализовать метод createDogs, котороый должен возвращать множество с 3 собаками.
 * 4. Реализовать метод join, котороый должен возвращать объединенное множество pets всех животных - всех котов и собак.
 * 5. Реализовать метод removeCats, котороый должен удалять из множества pets всех котов, которые есть в множестве cats.
 * 6. Реализовать метод printPets, котороый должен выводить на экран всех
 */
public class Test03 {
    public static void main(String[] args) {
        Set<Cat> cats = new HashSet<>();
        Set<Dog> dogs = new HashSet<>();
        createCats(cats);
        createDogs(dogs);
        Set<Object> pets = join(cats, dogs);
        removeCats(cats, pets);
        printPets(pets);
    }

    public static void removeCats(Set<Cat> set,Set<Object> pets){
     pets.removeAll(set);
//        Iterator<Object> it = pets.iterator();
//        while(it.hasNext()){
//            Object cat = it.next();
//            if(cat instanceof Cat){
//                it.remove();
//            }
//        }
    }
    public static void printPets(Set<Object> pets){
        for (Object pet : pets) {
            System.out.println(pet);
        }
    }

    public static class Cat {
        @Override
        public String toString() {
            return "Cat";
        }
    }

    public static class Dog {
        @Override
        public String toString() {
            return "Dog";
        }
    }

    public static void createCats(Set<Cat> set) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();
        set.add(cat1);
        set.add(cat2);
        set.add(cat3);
        set.add(cat4);

    }


    public static void createDogs(Set<Dog> set) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
        set.add(dog1);
        set.add(dog2);
        set.add(dog3);
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        Set<Object> pets = new HashSet<>();
        pets.addAll(cats);
        pets.addAll(dogs);
        return pets;
    }
}
