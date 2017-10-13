package com.company.Lesson123;


/**
 * Created by User on 08.10.2017.
 */
public class Whale extends Cow{
    String name;
    Whale(String name) {
        super();
        this.name = name;
    }
    @Override
    public String getName() {
        return " Я не корова, Я - кит " + name;
    }
}
