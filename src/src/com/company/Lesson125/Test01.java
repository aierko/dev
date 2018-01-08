package com.company.Lesson125;

/**
 * Created by User on 09.10.2017.Создать классы Pet, Cat, Dog
 В классе Pet создать метод getChild(), который возвращает экземпляр класса Pet.
 Переопределить метод getChild в классах Cat(кот) и Dog(собака), чтобы кот порождал кота, а собака – собаку.
 */
public class Test01 {
    public static void main(String[] args) {
          Cat cat = new Cat();
          Dog dog = new Dog();
        System.out.println(dog.getChild());
        System.out.println(cat.getChild());
    }

}
