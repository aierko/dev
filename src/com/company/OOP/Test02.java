package com.company.OOP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by User on 11.09.2017.
 * /* Лошадь и пегас
 * Написать два класса: Horse (лошадь) и Pegas (пегас).          1
 * В классе Horse создать переменные name, flyable, runnable      2
 * Созать конструктор для всех переменных класса Horse            3
 * В классе Horse создать метод, который проверяет переменную flyable и выводит на экран следующее: 4
 * - если переменная true, My name is + this.name + , i can fly =)          4.1
 * - если переменная false, My name is + this.name + , i cant fly =(        4.2
 * Унаследовать пегаса от лошади.                                           5
 * В методе main создать два объекта: horse и pegas                         6
 * Подумать, какие значения присваивать переменным определенного класса.    7
 */
public class Test02 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int age = 10;
    static String name = "Jorik";

    public static void main(String[] args) throws IOException {
//        Horse horse = new Horse("Jorik", false, true);
//        Pegas pegas = new Pegas("Sedoy", true, true);
//        horse.fly();
//        pegas.fly();
//        Dog dog = new Dog();
//        System.out.println(dog.getName());
//        dog.setName("Igor");
//        System.out.println(dog.getName());
//
//        Test02 t1 = new Test02();
//        Test02 t2 = new Test02();
//        System.out.println(t1.age);
//        System.out.println(t2.age);
//        t1.age = 15;
//        System.out.println(t1.age);
//        System.out.println(t2.age);

//        System.out.println(Test02.name);
//        System.out.println(Test02.name);
//        Test02.name = "Text";
//        System.out.println(Test02.name);
//        System.out.println(Test02.name);
    }
}

class Horse {
    String name;
    boolean flyable;
    boolean runnable;

    Horse(String n, boolean f, boolean r) {
        this.name = n;
        this.flyable = f;
        this.runnable = r;
    }

    public void fly() {
        if (this.flyable) {
            System.out.println(" My name is " + this.name + " , i can fly =) ");
        } else {
            System.out.println("My name is " + this.name + ", i cant fly =(");
        }
    }

}

class Pegas extends Horse {

    Pegas(String n, boolean f, boolean r) {
        super(n, f, r);
    }
}