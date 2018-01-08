package com.company.Lesson122.Test01;

/**
 * Created by User on 02.10.2017.
 */
public class Dog {
    private String name;
    private int speed;

    Dog(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isDogFasterNearCat(Cat cat) {
        if (this.speed > cat.getSpeed()) {
            return true;
        } else return false;
    }
}
