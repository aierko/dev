package com.company.Lesson32;

/**
 * Created by user on 02.12.2016.
 * Woman -> name, age
 * Cat -> name, age, owner
 * Dog -> name, age, owner
 * Fish -> name, age, owner
 */
public class Classsscat {
    public static void main(String[] args) {
        Woman woman1 = new Woman("Cora", 22);
        Cat cat1 = new Cat("Sol", 3, woman1);
        Dog dog1 = new Dog("Dory", 5, woman1);
        Fish fish1 = new Fish("Stingy", 2, woman1);
        System.out.println(woman1.name + " " + woman1.age);
        System.out.println(cat1.name + " " + cat1.age + " " + cat1.owner.name);
        System.out.println(dog1.name + " " + dog1.age + " " + dog1.owner.name);
        System.out.println(fish1.name + " " + fish1.age + " " + fish1.owner.name);

    }

    public static class Woman {
        String name;
        int age;

        Woman(String n, int a) {
            this.name = n;
            this.age = a;
        }
    }

    public static class Cat {
        String name;
        int age;
        Woman owner;

        Cat(String n, int a, Woman o) {
            this.name = n;
            this.age = a;
            this.owner = o;
        }
    }

    public static class Dog {
        String name;
        int age;
        Woman owner;

        Dog(String n, int a, Woman o) {
            this.name = n;
            this.age = a;
            this.owner = o;
        }
    }

    public static class Fish {
        String name;
        int age;
        Woman owner;

        Fish(String n, int a, Woman o) {
            this.name = n;
            this.age = a;
            this.owner = o;
        }
    }

}



