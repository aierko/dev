package com.company.Lesson123;

/**
 * Created by User on 08.10.2017.
 * /*
 Создать 2 класса Сow и Whale.
 В классе Cow создать метод getName(), который возвращает строку "Я - корова".
 Унаследовать Whale от Cow
 Переопределить метод getName в классе Whale(Кит), чтобы программа выдавала:
 Я не корова, Я - кит.
 */
public class Test01 {
    public static void main(String[] args) {
       Cow cow = new Cow("Starushka");
       Whale whale = new Whale("Willy");
        System.out.println(cow.getName());
        System.out.println(whale.getName());

    }
}
