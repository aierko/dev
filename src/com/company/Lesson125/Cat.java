package com.company.Lesson125;

/**
 * Created by User on 09.10.2017.
 */
public class Cat extends Pet {
    @Override
    public Cat getChild() {
        return new Cat();
    }
}
