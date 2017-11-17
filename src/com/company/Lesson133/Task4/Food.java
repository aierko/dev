package com.company.Lesson133.Task4;

/**
 * Created by User on 14.11.2017.
 */
public class Food implements Selectable{
    public void eat(){
        System.out.println(" food is eaten");
    }

    @Override
    public void onSelect() {
        System.out.println("food is selected");
    }
}

