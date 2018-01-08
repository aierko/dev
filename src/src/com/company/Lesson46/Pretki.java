package com.company.Lesson46;

/**
 * Created by user on 11.01.2017.
 *//*Сoздай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human).
        Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
        Примечание:
        Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
        Пример вывода:
        Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
        Имя: Катя, пол: женский, возраст: 55
        Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
  */
public class Pretki {
    public static final int a = 100;

    public static void main(String[] args) {
        Human grandfather = new Human("Kolya", true, 60, null, null);
        Human grandmather = new Human("Kristna", false, 58, null,null);
        Human grandfather2 = new Human("Jenya", true, 60, null, null);
        Human grandmather2 = new Human("Katya", false, 55, null, null);
        Human father = new Human("Kostya", true, 30, grandfather, grandmather);
        Human mather = new Human("Iren", false, 28, grandfather2, grandmather2);
        Human dauhther = new Human("Irina", false, 5,father, mather);
        Human dauhther1= new Human("Tanya", false, 3, father, mather);
        Human brother = new Human("Vova", true, 10, father, mather);

        System.out.println(grandfather);
        System.out.println(grandmather);
        System.out.println(grandfather2);
        System.out.println(grandmather2);
        System.out.println(father);
        System.out.println(mather);
        System.out.println(dauhther);
        System.out.println(dauhther1);
        System.out.println(brother);

    }
    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mather;

        public Human(String n, boolean s, int a, Human f, Human m) {
            this.name = n;
            this.sex = s;
            this.age = a;
            this.father = f;
            this.mather = m;
        }


        @Override
        public String toString() {
            String text = "";
            text += "Name is:" + name;
            if (sex) {
                text += "sex is man:";
            } else text += "sex is woman:";
            text += "age is:" + age;
            if (father != null) {
                text += father.name;
            }
            if (mather != null) {
                text += null;
            }
            return text;


        }
    }
}
