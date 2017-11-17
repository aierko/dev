package com.company.Lesson133;

/**
 * Created by User on 14.11.2017.
 *
 */
public class Test01 {
    public static void main(String[] args) {
        //System.out.println(isIntegerOrElse(3));
        Pet pet1 = new Pet();
        Pet pet2 = new Cat();
        System.out.println(pet2 instanceof Pet);
        System.out.println(pet2 instanceof Moveable);
        System.out.println(pet1 instanceof Cat);
        System.out.println(pet1 instanceof Moveable);
    }
    public static boolean isIntegerOrElse(Object o){
        boolean isInt = o instanceof Integer;
        //System.out.println(isInt);
        return isInt;
    }
}
