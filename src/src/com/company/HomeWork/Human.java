package com.company.HomeWork;

/**
 * Created by user on 04.04.2017.Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human).
 Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
 Примечание:
 Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
 Пример вывода:
 Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
 Имя: Катя, пол: женский, возраст: 55
 Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
 */
public class Human {
    public static void main(String[] args) {

    }
    public static class Human1{
        String name;
        boolean sex;
        int age;
        Human1 father;
        Human1 mather;

        public Human1(String n, boolean s, int a, Human1 f, Human1 m){
            this.name = n;
            this.sex = s;
            this.age = a;
            this.father = f;
            this.mather = m;
        }



    }

}
