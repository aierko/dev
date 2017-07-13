package com.company.Lesson43;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 28.12.2016.
 *//* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human).
 Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/
public class Test03 {
    public static void main(String[] args) {
        List<Human> list = new ArrayList<>();
        Human grandFather = new Human("Duglas", true, 60);
        Human grandMather = new Human("Caren", false, 55);
        Human grandFather1 = new Human("Trend", true, 59);
        Human grandMather2 = new Human("Cora", false, 56, null, null);
        Human father = new Human("Catrin", false, 30, grandFather, grandMather);
        Human mather = new Human("Mitch", true, 33, grandFather1, grandMather2);
        Human daughter = new Human("Clar", false, 5, father, mather);
        Human brother = new Human("Greg", true, 2, father, mather);
        Human daughter1 = new Human("Sara", false, 8, father, mather);
        System.out.println(grandFather);
        System.out.println(grandMather);
        System.out.println(grandFather1);
        System.out.println(grandMather2);
        System.out.println(father);
        System.out.println(mather);
        System.out.println(daughter);
        System.out.println(brother);
        System.out.println(daughter1);
    }
    public static class Human{
        String name;
        boolean sex;
        int age;
        Human father;
        Human mather;
        public Human(String name, boolean sex, int age, Human father, Human mather){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mather = mather;
        }

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        @Override
        public String toString() {
            return "";
        }
    }

}
