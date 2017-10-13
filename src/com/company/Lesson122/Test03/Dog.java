package com.company.Lesson122.Test03;

/**
 * Created by User on 02.10.2017.
 */
public class Dog extends Pet {
    @Override
    public Dog getChild() {
        return new Dog();
    }
}
