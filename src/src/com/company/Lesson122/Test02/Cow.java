package com.company.Lesson122.Test02;

import com.company.Lesson122.Test03.Pet;

/**
 * Created by User on 02.10.2017.
 */
public class Cow extends Pet {
    String name;

    public Cow() {

    }

    public Cow(String name) {
        this.name = name;
    }

    public String getName() {
        return " I am a Cow ";
    }

    @Override
    public Cow getChild() {
        return new Cow(" Zorka ");
    }
}
