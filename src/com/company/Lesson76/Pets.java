package com.company.Lesson76;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by user on 31.03.2017. 1. Внутри класса Solution создать public static классы Tiger, Manky.
 2. Реализовать метод createTiger, котороый должен возвращать множество с 4 котами.
 3. Реализовать метод createManky, котороый должен возвращать множество с 3 собаками.
 4. Реализовать метод join, котороый должен возвращать объединенное множество всех животных - всех котов и собак.
 5. Реализовать метод removeCats, котороый должен удалять из множества pets всех котов, которые есть в множестве cats.
 6. Реализовать метод printPets, котороый должен выводить на экран всех животных, которые в нем есть. Каждое животное с новой строки.
 */
public class Pets {
    public static void main(String[] args) {
        Set<Tiger> tigers = new HashSet<>();
        Set<Manky> mankies = new HashSet<>();
        createTiger(tigers);
        createManky(mankies);

    }
    public static class Tiger{
        @Override
        public String toString() {
            return("Tiger");
        }
    }
    public static class Manky{
        @Override
        public String toString() {
            return("Manky");
        }
    }
    public static void createTiger(Set<Tiger> set){
        Tiger tiger1 = new Tiger();
        Tiger tiger2 = new Tiger();
        Tiger tiger3 = new Tiger();
        Tiger tiger4 = new Tiger();
        set.add(tiger1);
        set.add(tiger2);
        set.add(tiger3);
        set.add(tiger4);
    }
    public static void createManky(Set<Manky> set1){
        Manky manky1 = new Manky();
        Manky manky2 = new Manky();
        Manky manky3 = new Manky();
        set1.add(manky1);
        set1.add(manky2);
        set1.add(manky3);
    }
    public static Set<Object> join(Set<Tiger> set,  Set<Manky> set1){
        Set<Object> pets = new HashSet<>();
        pets.addAll(set);
        pets.addAll(set1);
        return pets;
    }
}
