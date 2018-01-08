package com.company.Lesson45;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 06.01.2017.
 *//*
Задача:  Программа вводит с клавиатуры данные про котов и выводит их на экран.
Создать класс Cat с параметрами name, age, weight, tail;
Переопределить метод toString() в классе Cat, что бы он выводил информацию про кота в виде:
"Cat name is " + name + ", age is " + age + ", weight is " + weight + ", tail = " + tailLength;
Вводить параметри с клавиатуры и создавать объект с введенными параметрами.
Ввод продолжается, пока переменная с именем не пуста.
Добавлять каждый объект в список, в конце вывести содержимое списка на экран.
 Пример:
Cat name is Barsik, age is 6, weight is 5, tail = 22
Cat name is Murka, age is 8, weight is 7, tail = 20
*/
public class Cat01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Cat> list = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            int age = Integer.parseInt(reader.readLine());
            int weight = Integer.parseInt(reader.readLine());
            int tail = Integer.parseInt(reader.readLine());
            Cat cat1 = new Cat(s, age, weight, tail);
            list.add(cat1);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


    }

    public static class Cat {
        String name;
        int age;
        int weight;
        int tail;

        Cat(String n, int a, int w, int t) {
            this.name = n;
            this.age = a;
            this.weight = w;
            this.tail = t;
        }

        @Override
        public String toString() {
            return ("Name:" + this.name + ",age:" + this.age + ",weight:" + this.weight + ",tail" + this.tail);
        }
    }

}
