package com.company.Lesson117;

/**
 * Created by User on 17.09.2017.
 */
public class Cat {
   private String name;
   private int speed;

    Cat(String name, int speed){
        this.name = name;
        this.speed = speed;
    }
    public boolean isDogNear(Dog dog){
        if (this.speed > dog.getSpeed()){
            return true;
        }
       else return false;
    }
    public String getName(){
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
