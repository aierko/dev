package com.company.Lesson126.oop;

/**
 * Created by User on 13.10.2017.
 * /* Или «Корова», или «Кит», или «Собака», или «Неизвестное животное»
 Написать метод, который определяет, объект какого класса ему передали, и возвращает результат – одно значение из: «Корова», «Кит», «Собака», «Неизвестное животное».
 */
public class Test02 {
    public static void main(String[] args) {
        Cow cow = new Cow();
        Whale whale = new Whale();
        Dog dog = new Dog();
        Dog1 dog1 = new Dog1();
        findClassObject(cow);
        findClassObject(whale);
        findClassObject(dog);
        findClassObject(dog1);

    }
    public static void findClassObject(Object object){
        if (object instanceof Cow){
            System.out.println("Cow");
        }else if (object instanceof Whale){
            System.out.println("Whale");
        }else if (object instanceof  Dog){
            System.out.println("Dog");
        }else{
            System.out.println("Xanimal");
        }
    }
}
class Cow{}
class Whale{}
class Dog{}
class Dog1{}
