package com.company.Lesson138.Task02;

/**
 * Created by User on 03.12.2017.
 */
public class Finger extends BodyPart {
    boolean isWhole;

    public Finger(String name, boolean isWhole) {
        super(name);
        this.isWhole = isWhole;
    }

    @Override
    public Object containseBones() {
        if (super.containseBones().equals("Yes") && isWhole) {
            return "Yes";
        } else return "No";
    }
}

