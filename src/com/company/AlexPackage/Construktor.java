package com.javarush.test.Denis;

/**
 * Created by Artyom on 27.09.2016.
 */
public class Construktor
{
    public static void main(String[] args)
    {
        Dog dog1 = new Dog("Bars", 2, 3, 4);
        Dog dog2 = new Dog("Jack", 5, 6, 7);
        System.out.println(dog1.name + " " + dog1.weight);
        dog1.sleep();
        System.out.println(dog2.name + " " + dog2.weight);
        dog2.eat();
    }

    public static class Dog
    {
        String name;
        int age;
        int weight;
        int height;

        Dog(String n, int a, int w, int h)
        {
            this.name = n;
            this.age = a;
            this.weight = w;
            this.height = h;
        }

        void eat(){
            System.out.println("Eat");
        }

        void sleep(){
            System.out.println("Sleep");
        }
    }
}
