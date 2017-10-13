package com.company.Lesson122.Test01;

/**
 * Created by User on 02.10.2017.
 * /* Создать классы Cat и Dog с параметрами name и speed
 Скрыть все внутренние переменные класса Cat и Dog.
 Также скрыть все методы, кроме тех, с помощью которых эти классы взаимодействуют друг с другом.
 Создать метод isDogNear в классе Cat, который возвращает true, если скорость кота больше
 Создать метод isCatNear в классе Dog, который возвращает true, если скорость собаки больше
 */
public class Animals {
    public static void main(String[] args) {
        Dog dog = new Dog(" Sharik ",20 );
        Cat cat = new Cat(" Sonik ", 25);
        if (dog.isDogFasterNearCat(cat)){
            System.out.println(" Is " + dog.getName() + " faster near " + cat.getName());
        }else System.out.println(" is " + cat.getName() + "faster near " + dog.getName());

    }


}
