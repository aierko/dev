package com.company.Lesson125;

/**
 * Created by User on 09.10.2017.
 */
public class Dog extends Pet {
    @Override
    public Dog getChild() {
        return new Dog();
    }
}
