package com.company.Lesson46;

/**
 * Created by user on 09.01.2017.
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
public class Test05 {
    public static void main(String[] args) {
        Human grandmather = new Human("Elis", false, 55, null, null);
        Human grandfather = new Human("Kirk", true, 60, null, null);
        Human grandmather1 = new Human("Katrin", false, 50, null, null);
        Human grandfather1 = new Human("Jhon", true, 55, null, null);
        Human father = new Human("Erik", true, 30, grandfather, grandmather);
        Human mather = new Human("Olya", false, 28, grandfather1, grandmather1);
        Human dauther = new Human("Dezzi", false, 10, father, mather);
        Human brother = new Human("Bob", true, 5, father, mather);
        Human dauther1= new Human("Nora", false, 1, father, mather);
        System.out.println(grandfather);
        System.out.println(grandfather1);
        System.out.println(grandmather);
        System.out.println(grandmather1);
        System.out.println(father);
        System.out.println(mather);
        System.out.println(dauther);
        System.out.println(dauther1);
        System.out.println(brother);
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mather;

        Human(String n, boolean s, int a, Human f, Human m) {
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
            if (sex){
                text += "sex is: man";
            } else {
                text += "sex is: woman";
            }
            text += "age is" + age;
            if (father != null){
                text += "father is:" + father.name;
            }
            if (mather != null){
                text += "mater is:" + mather.name;
            }
            return  text;
        }
    }
}
