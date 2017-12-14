package com.company.Lesson137.Task02;

/**
 * Created by User on 28.11.2017.
 */
public class Tiger extends Cat implements HasWeight, HasSize {

    @Override
    public int getValue() {
        return 0;
    }
    public String getName() {
        return "Tiger";
    }

    public Tiger getParent() {
        return (Tiger) this.parent;
    }
}
