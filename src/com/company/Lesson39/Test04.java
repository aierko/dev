package com.company.Lesson39;

/**
 * Created by user on 19.12.2016.
 *//*
Создать класс Cat с параметрами: name, age, power
Реализовать метод boolean fight(Cat anotherCat):
реализовать механизм драки котов в зависимости от силы.
Метод должен определять, выиграли ли мы (this) бой или нет,
т.е. возвращать true, если выиграли и false - если нет.
Должно выполняться условие:
если cat1.fight(cat2) = true , то cat2.fight(cat1) = false
*/
public class Test04 {
    public static void main(String[] args) {
        Cat cat1 = new Cat( "Jorik", 5 , 8);
        Cat cat2 = new Cat("Yoj" , 3 , 5);

        System.out.println(cat1);

        if(cat1.fight(cat2)){
            System.out.println("Winner is " + cat1.name);
        }else {
            System.out.println("Winner is " + cat2.name);
        }
    }
    public static class Cat{
        String name;
        int age;
        int power;

        Cat(String n, int a, int p){
            this.name = n;
            this.age = a;
            this.power = p;
        }
        public boolean fight(Cat anotherCat){
            if((this.power) > (anotherCat.power)){
                return true;
            }
            return false;
        }

        @Override
        public String toString() {
            return "Cat{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", power=" + power +
                    '}';
        }
    }


}
