package com.company.Lesson123;

/**
 * Created by User on 08.10.2017.
 */
public class Dog extends Pet {

    @Override
    public Dog getChild() {
        return new Dog();
    }
}
