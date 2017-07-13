package com.company.Lesson60;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 13.02.2017.
 *  Есть класс Cat с полем имя (name, String).
 Создать коллекцию HashMap<String, Cat>.
 Добавить в коллекцию 10 котов, в качестве ключа использовать имя кота из массива:
 String[] cats = new String[] {"васька", "мурка", "дымка", "рыжик", "серый", "снежок", "босс", "борис", "визя", "гарфи"};
 В качестве значения использовать экземпляр кота, с переданным именем из массива в конструктор.
 В классе Cat метод toString() должен переводить переданное в конструктор имя в верхний регистр ( метод toUpperCase() )
 Вывести результат на экран, каждый элемент с новой строки.
 Вывести результат на экран в виде:
 васька - ВАСЬКА
 мурка - МУРКА
 */
public class Test01 {
    public static void main(String[] args) {
        String[] cats = new String[] {"васька", "мурка", "дымка", "рыжик", "серый", "снежок", "босс", "борис", "визя", "гарфи"};
        Map<String, Cat> map = initializeCat(cats);
        for (Map.Entry<String, Cat> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
    public static Map initializeCat(String [] arr1 ){
        Map<String, Cat> arr = new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            arr.put(arr1[i], new Cat(arr1[i]));
        }
        return arr;
    }
    public static class Cat{
        String name;
        public Cat(String n){
          this.name = n;
        }

        @Override
        public String toString() {
            return (name.toUpperCase());
        }
    }
}
