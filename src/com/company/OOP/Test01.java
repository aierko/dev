package com.company.OOP;

/**
 * Created by User on 11.09.2017.
 */
public class Test01 {

    public static void main(String[] args) {
//        Cat cat = new Cat();
//        cat.move();
//        cat.age = 10;

        Bird bird = new Parrot();
        bird.move();
        bird.m();

    }

}

class Animal{
    int age;

    void move(){
        System.out.println("Move");
    }
}

class Cat extends Animal{
    int age;

    void voice(){
        System.out.println("Myau");
    }
}

class Bird extends Animal{
    @Override
    void move() {
        super.move();
        System.out.println("Fly");
    }

    void m(){
        System.out.println("M");
    }
}

class Parrot extends Bird{
    @Override
    void move() {
        System.out.println("Parrot");
    }
}