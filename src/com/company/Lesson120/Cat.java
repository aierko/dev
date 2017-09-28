package com.company.Lesson120;

/**
 * Created by User on 25.09.2017.
 */
public class Cat {
    private String name;
    private int speed;

    Cat(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public boolean isCatNearDog(int speed) {
        if (this.speed > speed) {
            return true;
        } else return false;
    }

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getSpeed(){
        return speed;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
}
