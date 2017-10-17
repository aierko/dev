package com.company.Lesson127;

/**
 * Created by User on 16.10.2017.
 * /* Или «Корова», или «Кит», или «Собака», или «Неизвестное животное»
 * Написать метод, который определяет, объект какого класса ему передали, и возвращает результат – одно значение из: «Корова», «Кит», «Собака», «Неизвестное животное».
 */
public class Test01 {
    public static void main(String[] args) {
        Cow1 cow1 = new Cow1();
        Whale1 whale1 = new Whale1();
        Dog1 dog1 = new Dog1();
        Tiger tiger = new Tiger();
        System.out.println(isWhichAnimal(cow1));
        System.out.println(isWhichAnimal(whale1));
        System.out.println(isWhichAnimal(dog1));
        System.out.println(isWhichAnimal(tiger));
    }
    public static String isWhichAnimal(Object animal){
        if (animal instanceof Cow1){
            return " Cow ";
        }else if (animal instanceof Whale1){
            return " Whale ";
        }else if (animal instanceof Dog1){
            return " Dog ";
        }
        else return " X - animal ";

    }

}

class Cow1 {

}

class Whale1 {

}
class Dog1{

}
class Tiger{

}
