package com.company.Lesson40;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 21.12.2016.
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
public class Test04 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Cat> spisok = new ArrayList<>();

        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) {
                break;
            }

            int a = Integer.parseInt(reader.readLine());
            int w = Integer.parseInt(reader.readLine());
            int t = Integer.parseInt(reader.readLine());
            Cat cat = new Cat(s, a, w, t);
            spisok.add(cat);
        }

        for (int i = 0; i < spisok.size(); i++) {
            System.out.println(spisok.get(i));
        }
    }

    public static class Cat {
        String name;
        int age;
        int weight;
        int tail;

        public Cat(String name, int age, int weight, int tail) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.tail = tail;
        }

        @Override
        public String toString() {
            return "Cat name is " + name + ", age is " + age + ", weight is " + weight + ", tail length = " + tail;
        }
    }

}
