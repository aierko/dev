package com.company.Lesson117;

/**
 * Created by User on 17.09.2017.
 */
public class Dog {
   private String name;
   private static int speed;
    Dog(String name, int speed){
        this.name = name;
        Dog.speed = speed;
    }
    public boolean isCatNear(Cat cat){
        if (this.speed > cat.getSpeed()){
            return true;
        }
        else return false;
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
}
