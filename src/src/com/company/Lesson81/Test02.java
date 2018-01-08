package com.company.Lesson81;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 12.04.2017.
 * /* Вся семья в сборе
 1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
 2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
 3. Вывести все объекты Human на экран.
 Имя: ded Ivan, пол: мужской, возраст: 70, дети: papa Fedya
 Имя: baba Masha, пол: женский, возраст: 65, дети: papa Fedya
 Имя: papa Fedya, пол: мужской, возраст: 40, дети: son Lesha, son Misha, daughter Masha
 */
public class Test02 {
    public static void main(String[] args) {
        Human son = new Human("Lesha", true, 20, new ArrayList<>());
        Human son1 = new Human("Misha", true, 19, new ArrayList<>());
        Human daughter = new Human("Masha", false, 12, new ArrayList<>());
        List<Human> child1 = new ArrayList<>();
        child1.add(son);
        child1.add(son1);
        child1.add(daughter);
        Human father = new Human("Fedya", true, 40, child1);
        List<Human> father1 = new ArrayList<>();
        father1.add(father);
        Human mather = new Human("Ira", false, 38, child1);
        List<Human> mather1 = new ArrayList<>();
        mather1.add(mather);
        Human ded = new Human("Ivan", true, 70,mather1);
        Human baba = new Human("Ivan", false, 60,mather1);
        Human ded1 = new Human("Kondrat", true, 68,father1);
        Human baba1 = new Human("Nyura", false, 65,father1);
        System.out.println(son);
        System.out.println(son1);
        System.out.println(daughter);
        System.out.println(father);
        System.out.println(mather);
        System.out.println(ded);
        System.out.println(baba);
        System.out.println(ded1);
        System.out.println(baba1);
    }
    public static class Human{
        String name;
        boolean sex;
        int age;
        List<Human> kids;
        public Human(String n, boolean s, int a, List<Human> kids){
            this.name = n;
            this.sex = s;
            this.age = a;
            this.kids = kids;
        }

        @Override
        public String toString() {
            String text = "";
            text = text + " Name is " + name;
            if (sex){
                text += ", sex is man ";
            }
            else text += ", sex is woman ";
            text += ", age is " + age;
            if(!kids.isEmpty()){
                text += ", дети: " + kids.get(0).name;
                for (int i = 1; i < kids.size() ; i++) {
                    text += " ," +  kids.get(i).name;
                }
            }

            return (text);
        }
    }
}
