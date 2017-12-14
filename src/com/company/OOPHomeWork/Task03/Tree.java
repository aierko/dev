package com.company.OOPHomeWork.Task03;

/**
 * Created by User on 05.12.2017.1. Создай класс Tree с методом info(Object o) с телом System.out.println(String.format("Дерево № %d , метод Object, параметр %s", number, s.getClass().getSimpleName()));.
 * В нем создай переменные static int globalNumber и int number, в конструкторе должно быть this.number = ++ globalNumber.
 * 1.В классе Tree перегрузи метод info(Object s) два раза так, чтобы получилось три метода info(Object s), info(Number s), info(String s).
 * 1.1. Разберись в методе info(Object s). Сделай по аналогии функционал новых методов.
 * 1.2. Например, для метода info(Number s) результат может быть таким "Дерево № 123, метод Number, параметр Short".
 * 2. В main вызываться метод info(Object s), метод info(Number s) и метод info(String s).
 */
public class Tree {

    public Tree() {
        this.number = ++globalNumber;
    }

    static int globalNumber = 0;
    int number = 0;

    void info(Object s) {
        System.out.println(String.format("Дерево № %d , метод Object, параметр %s", number, s.getClass().getSimpleName()));
    }


    void info(Number s) {
        System.out.println(String.format("Дерево № %d , метод Object, параметр %s", number, s.getClass().getSimpleName()));
    }

    void info(String s) {
        System.out.println(String.format("Дерево № %d , метод Object, параметр %s", number, s.getClass().getSimpleName()));
    }
}
