package com.company.Lesson32;

/**
 * Created by user on 02.12.2016.
 * Cat -> name, age, weight
 */
public class Test01 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Sara", 20, 10);
        Cat cat2 = new Cat("Flora", 10, 10);
        System.out.println(cat1.name + " " + cat1.age + " " + cat1.weght);
        System.out.println(cat2.name + " " + cat2.age + " " + cat2.weght);

    }

    public static class Cat {
        String name;
        int age;
        int weght;

        Cat(String n, int a, int w) {
            this.name = n;
            this.age = a;
            this.weght = w;
        }
    }

}