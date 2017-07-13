package com.javarush.test.Denis;

/**
 * Created by Artyom on 27.09.2016.
 */
public class Owner
{
    public static void main(String[] args)
    {
        Woman woman1 = new Woman("Stervo", 31);
        Cat cat1 = new Cat("Lun",2,woman1);
        Dog dog1 = new Dog("Cash", 3, woman1);
        Fish fish1 = new Fish("Blu", 1, woman1);
        System.out.println(cat1.name + " " + cat1.age + " " + cat1.owner.name);
        System.out.println(dog1.name + " " + dog1.age + " " + dog1.owner.name);
        System.out.println(fish1.name + " " + fish1.age + " " + fish1.owner.name);



    }

    public static class Woman
    {
        String name;
        int age;

        Woman(String n, int a)
        {
            this.name = n;
            this.age = a;
        }
    }

    public static class Cat
    {
        String name;
        int age;
        Woman owner;

        Cat(String n, int a, Woman o)
        {
            this.name = n;
            this.age = a;
            this.owner = o;
        }

    }

    public static class Dog
    {
        String name;
        int age;
        Woman owner;

        Dog(String n, int a, Woman o)
        {
            this.name = n;
            this.age = a;
            this.owner = o;
        }
    }

    public static class Fish
    {
        String name;
        int age;
        Woman owner;

        Fish(String n, int a, Woman o)
        {
            this.name = n;
            this.age = a;
            this.owner = o;
        }

    }

}
