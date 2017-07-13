package com.company.Lesson44;

/**
 * Created by user on 03.01.2017.
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
        Human grandfather = new Human("Carlton", 80, true, null, null);
        Human grandmather = new Human("Terry", 55, false, null, null);
        Human grandmather1 = new Human("Beth", 70, false, null, null);
        Human grandfather1 = new Human("Mitchel", 72, true, null, null);
        Human father = new Human("Tornton", 30, true, grandfather, grandmather);
        Human mather = new Human("Manatiko", 28, false, grandfather1, grandmather1);
        Human doughter = new Human("Debora", 6, false, father, mather);
        Human son = new Human("Brendon", 3, true, father, mather);
        Human son1 = new Human("Bob", 1, true, father, mather);
        System.out.println(grandfather);
        System.out.println(grandmather);
        System.out.println(grandfather1);
        System.out.println(grandmather1);
        System.out.println(mather);
        System.out.println(father);
        System.out.println(doughter);
        System.out.println(son);
        System.out.println(son1);
    }


    public static class Human {
        String name;
        int age;
        boolean sex;
        Human mather;
        Human father;

        public Human(String n, int a, boolean s, Human m, Human f) {
            this.name = n;
            this.age = a;
            this.sex = s;
            this.mather = m;
            this.father = f;
        }

        @Override
        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            if (sex) {
                text += ", пол: мужской";
            } else {
                text += ", пол: женский";
            }
            text += ", возраст: " + this.age;
            if (this.father != null) {
                text += ", отец: " + father.name;
            }
            if (this.mather != null) {
                text += ", мать: " + mather.name;
            }

            return text;
        }
    }
}



