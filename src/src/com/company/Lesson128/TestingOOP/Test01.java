package com.company.Lesson128.TestingOOP;

/**
 * Created by User on 20.10.2017.
 * /* Или «Корова», или «Кит», или «Собака», или «Неизвестное животное»
 Написать метод, который определяет, объект какого класса ему передали,
 и возвращает результат – одно значение из: «Корова», «Кит», «Собака», «Неизвестное животное».
 */
public class Test01 {
    public static void main(String[] args) {
        Cow2 cow2 = new Cow2();
        Whale2 whale2 = new Whale2();
        Dog2 dog2 = new Dog2();
        Cat2 cat2 = new Cat2();
        isWichTheAnimal(cow2);
        isWichTheAnimal(whale2);
        isWichTheAnimal(dog2);
        isWichTheAnimal(cat2);
    }
    public static void isWichTheAnimal(Object object) {
        if (object instanceof Cow2) {
            System.out.println("Cow2");
        } else if (object instanceof Whale2) {
            System.out.println("Whale");
        } else if (object instanceof Dog2) {
            System.out.println("Dog2");
        } else System.out.println(" Неизвестное животное ");

    }
}
class Cow2{}
class Whale2{}
class Dog2{}
class Cat2{}
