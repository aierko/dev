package com.company.Lesson32;

/**
 * Created by user on 02.12.2016.
 * Man -> name, age, wife
 * Woman -> name, age, husband
 */
public class Classes {
    public static void main(String[] args) {
         Man man1 = new Man("Carl", 25, null);
         Woman woman1 = new Woman("Cora", 20, man1);
         man1.wife = woman1;
        System.out.println(man1.name + " " + man1.age + " " + man1.wife.name);
        System.out.println(woman1.name + " " + woman1.age + " " + woman1.husband.name);
    }

    public static class Man {
        String name;
        int age;
        Woman wife;

        Man(String n, int a, Woman w) {
            this.name = n;
            this.age = a;
            this.wife = w;
        }

    }

    public static class Woman {
        String name;
        int age;
        Man husband;

        Woman(String n, int a, Man h) {
            this.name = n;
            this.age = a;
            this.husband = h;
        }
    }
}
