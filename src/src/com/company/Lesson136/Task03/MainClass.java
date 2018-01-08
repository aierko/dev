package com.company.Lesson136.Task03;

/**
 * Created by User on 24.11.2017.
 * Задача: Класс является синглтоном (реализует паттерн(шаблон) Solution),
 * если позволяет создать всего один объект своего типа.

 Реализовать Solution pattern:
 1. Создай класс Solution в отдельном файле.
 2. Добавь в него статический метод getSun().
 3. Метод getSun должен возвращать один и тот же объект класса Solution при любом вызове метода getSun.
 4. Подумай, каким образом можно запретить создание других объектов этого класса.
 5. Сделай все конструкторы в классе Solution приватными (private).
 6. В итоге должна быть возможность создать объект (экземпляр класса) ТОЛЬКО используя метод getSun.

 */
public class MainClass {
    public static void main(String[] args) {
        SingletoneClass singletoneClass = SingletoneClass.getInstance();
        System.out.println(singletoneClass);
        SingletoneClass singletoneClass1 = SingletoneClass.getInstance();
        System.out.println(singletoneClass);
    }
}
