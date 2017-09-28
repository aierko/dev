package com.company.Lesson117;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by User on 17.09.2017.
 * /**
 * Created by User on 11.09.2017.
 * /
 * /* Создать классы Cat и Dog с параметрами name и speed                                                   1
 * Скрыть все внутренние переменные класса Cat и Dog.                                                       2
 * Также скрыть все методы, кроме тех, с помощью которых эти классы взаимодействуют друг с другом.          3
 * Создать метод isDogNear в классе Cat, который возвращает true, если скорость кота больше чем у собаки.   4
 * Создать метод isCatNear в классе Dog, который возвращает true, если скорость собаки больше чем у кота.   5
 */
public class Test01 {
     BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        Test01 test01 = new Test01();
        test01.n();
        Dog dog = new Dog("Franc", 20);
        Cat cat = new Cat("George1", 15);
        Cat cat1 = new Cat("George", 19);
        System.out.println(cat.getSpeed());
        System.out.println(cat1.getSpeed());

        if (dog.isCatNear(cat)){
            System.out.println(" Is " + dog.getName() + " faster near " +  cat.getName());
        } else {
            System.out.println(" Is " + cat.getName() + " faster near " + dog.getName());
        }
    }

    void n() throws IOException {
        reader.readLine();
    }

}
