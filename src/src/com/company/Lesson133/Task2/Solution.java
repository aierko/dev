package com.company.Lesson133.Task2;

/**
 * Created by User on 14.11.2017.
 * Создай классы Building(здание) и School(здание школы).
 Расставь правильно наследование между Building и School.


 */
public class Solution {
    public static void main(String[] args) {
        Bilding bilding = getBilding();
        Bilding bilding1 = getSchool();
        System.out.println(bilding);
        System.out.println(bilding1);
    }

    public static Bilding getSchool() {
        return new School();
    }
    public static Bilding getBilding(){
        return new Bilding();
    }
}

