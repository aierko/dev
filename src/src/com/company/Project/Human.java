package com.company.Project;

/**
 * Created by User on 27.12.2017.
 */
public class Human {
    private String name;
    private String second_name;
    private boolean female_male;
    private int old ;

    public Human(String name, String second_name, boolean female_male, int old) {
        this.name = name;
        this.second_name = second_name;
        this.female_male = female_male;
        this.old = old;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecond_name() {
        return second_name;
    }

    public void setSecond_name(String second_name) {
        this.second_name = second_name;
    }

    public boolean isFemale_male() {
        return female_male;
    }

    public void setFemale_male(boolean female_male) {
        this.female_male = female_male;
    }

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }
}
