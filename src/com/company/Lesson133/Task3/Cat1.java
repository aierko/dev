package com.company.Lesson133.Task3;

/**
 * Created by User on 14.11.2017.
 */
public class Cat1 {
    private String name;
        Cat1(String name){
            this.name = name;
        }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "I am a cat of street" + getName();
    }
}
