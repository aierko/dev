package com.company.Lesson110;

/**
 * Created by User on 20.08.2017.
 */
public class Algorithms {

    void m1(){
        System.out.println("gkjrwegureng");
    }

}

class A extends Algorithms{

    @Override
    void m1() {
        System.out.println("wefweg");
    }
}

class B{
    public static void main(String[] args) {
        Algorithms algorithms = new A();

        algorithms.m1();
    }
}