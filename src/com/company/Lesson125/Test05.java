package com.company.Lesson125;


/**
 * Created by User on 09.10.2017.
 * /* Или «Корова», или «Кит», или «Собака», или «Неизвестное животное»
 Написать метод, который определяет, объект какого класса ему передали, и возвращает результат – одно значение из:
 «Корова», «Кит», «Собака», «Неизвестное животное».
 */
public class Test05 {
    public static void main(String[] args) {
       determiningMethod(new Cow1());
       determiningMethod(new Whale1());
       determiningMethod(new Dog1());
       determiningMethod(new Cat());
    }
    public static void determiningMethod(Object pet){
        if (pet instanceof Cow1){
            System.out.println(" Cow1 ");
        }else if (pet instanceof Whale1){
            System.out.println(" Whale1 ");
        }else if (pet instanceof Dog1){
            System.out.println(" Dog1 ");
        }else {
            System.out.println(" Unknown animal ");
        }
    }
}
class Cow1{}
class Whale1{}
class Dog1{}

