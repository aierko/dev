package com.company.AlexPackage;

/**
 * Created by Artyom on 27.09.2016.
 */
public class ConstruktorCat
{
    public static void main(String[] args)
    {
        Cat cat1 = new Cat("Lysya", 5, "телко");
        Cat cat2 = new Cat("Sonic", 2.5, "скот");
        System.out.println(cat1.name + cat1.sex + cat1.age);
        System.out.println(cat2.name + cat2.sex + cat2.age);
    }


    public static class Cat{
        String name;
        double age;
        String sex;

        public Cat(String name, double age, String sex)
        {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }


    }
}
