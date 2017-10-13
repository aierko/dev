package com.company.Lesson122.Test03;

import com.company.Lesson122.Test02.Cow;

/**
 * Created by User on 02.10.2017.
 * Создать классы Pet, Cat, Dog.
 В классе Pet создать метод getChild(), который возвращает экземпляр класса Pet.
 Переопределить метод getChild в классах Cat(кот) и Dog(собака), чтобы кот порождал кота, а собака – собаку.
 */
public class ChildBorn {
    public static void main(String[] args) {
         Dog dog = new Dog();
         Cat cat = new Cat();
        Cow cow = new Cow();
        Cow cow1 = new Cow("Starushka");
        System.out.println(dog.getChild());
        System.out.println(cat.getChild());
        System.out.println(cow.getChild());
        System.out.println(cow1.getChild());
    }

}
