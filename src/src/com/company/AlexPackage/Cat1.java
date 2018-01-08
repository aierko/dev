package com.company.AlexPackage;

/**
 * Created by Artyom on 30.09.2016.
 */
public class Cat1
{
    public static void main(String[] args)
    {
        Cat cat1 = new Cat("Zlo", 2, 75);
        Cat cat2 = new Cat("Cote", 3, 81);
        if (cat1.fight(cat2)){
            System.out.println(cat1.name + " winner");
        }
        else System.out.println(cat2.name + " winner");
    }

    public static class Cat
    {
        String name;
        int age;
        int power;

        Cat(String n, int a, int p)
        {
            this.name = n;
            this.age = a;
            this.power = p;
        }

        public boolean fight(Cat anotherCat)
        {
            return (this.power > anotherCat.power);
        }
    }
}
