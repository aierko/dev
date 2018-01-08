package com.company.OOP;

/**
 * Created by User on 11.09.2017.
 * /
 * /* Создать классы Cat и Dog с параметрами name и speed                                                   1
 * Скрыть все внутренние переменные класса Cat и Dog.                                                       2
 * Также скрыть все методы, кроме тех, с помощью которых эти классы взаимодействуют друг с другом.          3
 * Создать метод isDogNear в классе Cat, который возвращает true, если скорость кота больше чем у собаки.   4
 * Создать метод isCatNear в классе Dog, который возвращает true, если скорость собаки больше чем у кота.   5
 */
public class Test04 {
    public static void main(String[] args) {
        Cat1 cat1 = new Cat1("Tori", 20);
        Dog1 dog1 = new Dog1("Drisch", 18);
        System.out.println(cat1.isDogNear(dog1));
        dog1.setSpeed(22);
        System.out.println(cat1.isDogNear(dog1));
    }
}

class Cat1 {
    protected String name;
    int speed;

    Cat1(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isDogNear(Dog1 dog1) {
        if (this.speed > dog1.getSpeed()) {
            return true;
        } else return false;
    }
}

class Dog1 {
    private String name;
    private int speed;

    Dog1(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isCatNear(Cat1 cat1) {
        if (this.speed > cat1.getSpeed()) {
            return true;
        } else return false;
    }
}
