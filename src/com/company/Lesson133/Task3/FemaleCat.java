package com.company.Lesson133.Task3;

/**
 * Created by User on 14.11.2017.
 */
public class FemaleCat extends Cat1 {
    FemaleCat(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "I am SWEET CATY" + getName();
    }
}
