package com.company.Lesson122.Test03;

/**
 * Created by User on 02.10.2017.
 */
public class Cat extends Pet{
    @Override
    public Cat getChild() {
        return new Cat();
    }
}
