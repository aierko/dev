package com.company.Lesson133.Task3;

/**
 * Created by User on 14.11.2017.
 * 1. Считывать строки(параметры) с консоли, пока пользователь не введет пустую строку(Enter).
 * 2. Каждый параметр соответствует имени кота.
 * Для каждого параметра:
 * 3. Создать объект cat класса Cat, который равен коту из getCatByKey(String параметр).
 * 4. Вывести на экран cat.toString().
 */
public class CatFactory {
    public static Cat1 getCatByKey(String key) {
        Cat1 cat = null;
        if ("vaska".equals(key)) {
            cat = new MaleCat(" Василий");
        } else if ("murka".equals(key)) {
            cat = new FemaleCat(" Мурочка ");
        } else if ("kiska".equals(key)) {
            cat = new FemaleCat(" Кисюлька");
        } else {
            cat = new Cat1(key);
        }

        return cat;
    }
}
