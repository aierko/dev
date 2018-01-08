package com.company.Lesson123;

/**
 * Created by User on 08.10.2017.
 */
public class Cat extends Pet{
    @Override
    public Cat getChild() {
        return new Cat();
    }
}
