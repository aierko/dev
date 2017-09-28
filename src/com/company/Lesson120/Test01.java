package com.company.Lesson120;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by User on 25.09.2017.
 * /* Создать классы Cat и Dog с параметрами name и speed
 * Скрыть все внутренние переменные класса Cat и Dog.
 * Также скрыть все методы, кроме тех, с помощью которых эти классы взаимодействуют друг с другом.
 * Создать метод isDogNear в классе Cat, который возвращает true, если скорость кота больше
 * Создать метод isCatNear в классе Dog, который возвращает true, если скорость собаки больше
 */
public class Test01 {
    static  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        Cat cat = new Cat("Sonik",Integer.parseInt(reader.readLine()));
        Dog dog = new Dog("Zlyuka", Integer.parseInt(reader.readLine()));
        cat.isCatNearDog(dog.getSpeed());
        dog.isDogNearCat(cat.getSpeed());
        if (cat.isCatNearDog(dog.getSpeed())) {
            System.out.println(" Is " + cat.getName() + " faster near " + dog.getName());
        } else System.out.println(" Is " + dog.getName() + " faster near " + cat.getName());
    }


}
