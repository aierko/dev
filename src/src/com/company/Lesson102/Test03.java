package com.company.Lesson102;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 09.07.2017.
 * /* Вся семья в сборе
 * 1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
 * 2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
 * 3. Вывести все объекты Human на экран.
 * <p>
 * Имя: ded Ivan, пол: мужской, возраст: 70, дети: papa Fedya
 * Имя: baba Masha, пол: женский, возраст: 65, дети: papa Fedya
 * Имя: papa Fedya, пол: мужской, возраст: 40, дети: son Lesha, son Misha, daughter Masha
 */
public class Test03 {

    public static void main(String[] args) {
        Human son1 = new Human("Kirill", true, 15,new ArrayList<>());
        Human son2 = new Human("Bodya", true, 10,new ArrayList<>());
        Human daughter = new Human("Masha", false, 13,new ArrayList<>());
        List<Human> humans = new ArrayList<>();
        humans.add(son1);
        humans.add(son2);
        humans.add(daughter);
        Human father = new Human("Stepan", true, 35, humans);
        List<Human> father2 = new ArrayList<>();
        father2.add(father);
        Human mather = new Human("Sveta", false, 35, humans);
        List<Human> mather2 = new ArrayList<>();
        mather2.add(mather);
        Human grandfather = new Human("Fedya", true, 90, mather2);
        Human grandmather = new Human("Ira", false, 68, mather2);
        Human grandfather1 = new Human("Kolya", true, 77, father2);
        Human grandmather1 = new Human("Lyusya", false, 70, father2);
        System.out.println(son1);
        System.out.println(son2);
        System.out.println(daughter);
        System.out.println(father);
        System.out.println(mather);
        System.out.println(grandfather);
        System.out.println(grandmather);
        System.out.println(grandmather1);
        System.out.println(grandfather1);

    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        List<Human> humans = new ArrayList<>();

        Human(String n, boolean s, int a, List<Human> h) {
            this.name = n;
            this.sex = s;
            this.age = a;
            this.humans = h;

        }

        @Override
        public String toString() {
            String word = "";
            word = word + " Имя " + name;
            if (sex) {
                word += " , пол мужской :";
            } else word += ", пол женский : ";
            word += " возраст " + age;
            if (!humans.isEmpty()){
                word += ", дети " + humans.get(0).name;
                for (int i = 1; i <humans.size() ; i++) {
                    word += "," + humans.get(i).name;
                }
            }
            return (word);
        }
    }


}
