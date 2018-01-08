package com.company.Lesson17;

/**
 * Created by user on 25.10.2016.
 */
public class ClassTest01 {

    public static void main(String[] args) {
        Woman woman1 = new Woman();
        Cat cat1 = new Cat(woman1);
        Dog dog1 = new Dog(woman1);
        Fish fish1 = new Fish(woman1);
        // cat1.owner = woman1;
        // dog1.owner = woman1;
        // fish1.owner = woman1;
    }

    public static class Cat {

        public Woman owner;

        Cat(Woman ow) {
            this.owner = ow;
        }
    }

    public static class Dog {
        public Woman owner;

        public Dog(Woman owner) {
            this.owner = owner;
        }
    }

    public static class Fish {
        public Woman owner;

        public Fish(Woman owner) {
            this.owner = owner;
        }
    }

    public static class Woman {

    }

}
