package com.company.Lesson122.Test02;

/**
 * Created by User on 02.10.2017.
 * /*
 Создать 2 класса Сow и Whale.
 В классе Cow создать метод getName(), который возвращает строку "Я - корова".
 Унаследовать Whale от Cow.
 Переопределить метод getName в классе Whale(Кит), чтобы программа выдавала:
 Я не корова, Я - кит.
 */
public class Whale extends Cow {
    String name;

    Whale(String name) {
        super(name);
    }

    public static void main(String[] args) {
        Flyable bird = new A();
        bird.move();
    }
}

interface Flyable{
    public abstract void fly();
                    void move();
                    void jump();

}

abstract class Bird implements Flyable{

   public abstract void jump();

}

class A extends Bird{
    @Override
    public void jump() {

    }

    @Override
    public void fly() {

    }
    @Override
    public void move() {

    }
}








