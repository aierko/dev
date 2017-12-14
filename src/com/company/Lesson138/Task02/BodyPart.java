package com.company.Lesson138.Task02;

/**
 * Created by User on 03.12.2017.
 */
public class BodyPart implements Alive {
    @Override
    public Object containseBones() {
        return "Yes";
    }
    String name = null;

    public BodyPart(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        if (containseBones().equals("Yes")) {
            return name + "содержит кости";
        }
        else
          return name + "не содержит кости";

        }
    }

