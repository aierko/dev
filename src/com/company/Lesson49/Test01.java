package com.company.Lesson49;

/**
 * Created by user on 16.01.2017.
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
public class Test01 {
    public static void main(String[] args) {
        Human grandfather = new Human("Tolik", true, 60, null, null);
        Human grandmather = new Human("Sveta", false, 55, null, null);
        Human grandfather1 = new Human("Vova", true, 70, null, null);
        Human grandmather1 = new Human("Toma", false, 65, null, null);
        Human father = new Human("Kostya", true, 35, grandfather, grandmather);
        Human mather = new Human("Kira", false, 30, grandfather1,grandmather1);
        Human brother1 = new Human("Serg", true, 10, father, mather);
        Human brother2 = new Human("Kostya", true, 7, father, mather);
        Human brother3 = new Human("Sasha", true, 3, father, mather);

    }
    public static class Human{
        String name;
        boolean sex;
        int age;
        Human father;
        Human mather;

        public Human(String n, boolean s, int a, Human f, Human m){
            this.name = n;
            this.sex = s;
            this.age = a;
            this.father = f;
            this.mather = m;
        }

        @Override
        public String toString() {
            String text = "";
            text = text + "Name is: " + name;
            if (sex){
                text = text + ", sex is man";
            }
            else text += ", sex is woman:";
            text += ", age is:" + age;
            if (father != null){
                text += ", father is:" + father.name;
            }
            if (mather != null){
                text += ", mather is:" + mather.name;
            }
            return (text);
        }
    }
}
