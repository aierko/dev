package com.company.Lesson54;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 30.01.2017.
 * /* Коллекция HashMap из котов
 Есть класс Cat с полем имя (name, String).
 Создать коллекцию HashMap<String, Cat>.
 Добавить в коллекцию 10 котов, в качестве ключа использовать имя кота из массива:
 String[] cats = new String[] {"васька", "мурка", "дымка", "рыжик", "серый", "снежок", "босс", "борис", "визя", "гарфи"};
 В качестве значения использовать экземпляр кота, с переданным именем из массива в конструктор.
 В классе Cat метод toString() должен переводить переданное в конструктор имя в верхний регистр ( метод toUpperCase() )
 */
public class Test04 {
    public static void main(String[] args) {
        String[] cats = new String[]
                {"васька", "мурка", "дымка", "рыжик", "серый", "снежок", "босс", "борис", "визя", "гарфи"};
             map(cats);
        System.out.println(map(cats));

    }
    public static class Cat{
        String name;

        public Cat(String n){
            this.name = n;
        }

        @Override
        public String toString() {
            return(name.toUpperCase());
        }
    }
    public static Map map (String[] cats){
        Map<String, Cat> map = new HashMap<>();
        for (int i = 0; i < cats.length; i++) {
            map.put(cats[i], new Cat(cats[i]));
        }
        return map;
    }


}
