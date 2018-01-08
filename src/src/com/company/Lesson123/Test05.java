package com.company.Lesson123;

/**
 * Created by User on 08.10.2017.
 * * /* Или «Кошка», или «Собака», или «Птица», или «Лампа»
 * Написать метод, который определяет, объект какого класса ему передали, и выводит на экран одну из надписей: Кошка, Собака, Птица, Лампа.
 */
public class Test05 {
    public static void main(String[] args) {
        methd(new Cat1());
        methd(new Dog1());
        methd(new Bird());
        methd(new Lamp());
    }

    public static void methd(Object obj) {
        if (obj instanceof Cat1) {
            System.out.println(" Cat ");
        } else if (obj instanceof Dog1) {
            System.out.println(" Dog ");
        } else if (obj instanceof Bird) {
            System.out.println(" Bird ");
        } else if (obj instanceof Lamp) {
            System.out.println(" Lamp ");
        }
    }

}

class Cat1{}

class Dog1 {

}

class Bird {
}
class Lamp {
}
