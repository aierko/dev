package com.company.Lesson82;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by user on 17.04.2017.
 * /* Вся семья в сборе
 * 1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
 * 2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
 * 3. Вывести все объекты Human на экран.
 * <p>
 * Имя: ded Ivan, пол: мужской, возраст: 70, дети: papa Fedya
 * Имя: baba Masha, пол: женский, возраст: 65, дети: papa Fedya
 * Имя: papa Fedya, пол: мужской, возраст: 40, дети: son Lesha, son Misha, daughter Masha
 */
public class Test02 implements Cloneable, Serializable {
    public static void main(String[] args) {
        Human son = new Human("Lesha", true, 10, new ArrayList<>());
        Human son2 = new Human("Misha", true, 13, new ArrayList<>());
        Human daughter = new Human("Masha", false, 6, new ArrayList<>());
        List<Human> kids = new ArrayList<>();
        kids.add(son2);
        kids.add(son);
        kids.add(daughter);
        Human father = new Human("Fedya", true, 40, kids);
        Human mather = new Human("Iren", false, 37, kids);
        List<Human> fedya  = new ArrayList<>();
        List<Human> iren = new ArrayList<>();
        fedya.add(father);
        iren.add(mather);
        Human ded = new Human("Ivan", true, 65, fedya);
        Human baba = new Human("Klavdiya", false,62, fedya);
        Human ded1 = new Human("Tolik", true, 63, iren);
        Human baba1 = new Human("Klara", false, 59, iren);
        List<Human> human = new ArrayList<>();
        human.addAll(kids);
        human.addAll(fedya);
        human.addAll(iren);
        Collections.addAll(human,ded,baba,ded1,baba1);
        for (Human human1 : human) {
            System.out.println(human1);
        }




    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        List<Human> kids;

        public Human(String n, boolean s, int a, List<Human> k) {
            this.name = n;
            this.sex = s;
            this.age = a;
            this.kids = k;
        }

        @Override
        public String toString() {
            String text = "Name is: ";
            text += name;
            if (sex){
                text += ", sex is man: ";
            }
            else text += ", sex is woman: " + name;
            text += ", age is :" + age;
            if (!kids.isEmpty()){
                text += ", kids: " + kids.get(0).name;
                for (int i = 1; i < kids.size(); i++) {
                    text += ", " + kids.get(i).name;
                }
            }
            return (text);
        }
    }


}
