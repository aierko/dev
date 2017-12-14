package com.company.Lesson139.Task06;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 08.12.2017.
 * Создай класс PrintListThread который наследует Thread.
 * В конструкторе в качестве параметра передай имя нити.
 * Создай метод List<String> getList который создает список из n элементов: String.format("String %d", (i + 1)).
 * Создай метод printList(List<String> list, String threadName) который выводит имя нити + элемент списка.
 * В методе run() класса PrintListThread вызови метод printList.
 * В главном методе создай и запусти две нити.
 * Подумайте, в каком месте и для какого объекта нужно вызвать метод join, чтобы результат выводился по-порядку сначала для firstThread,
 * а потом для secondThread.
 * Вызовите метод join в нужном месте.
 */
public class PrintListTread extends Thread {
    public PrintListTread(String name) {
        super(name);
    }


    public static ArrayList<String> getList(int n) {
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < n; i++) {
            list.add(String.format("String %d", (i + 1)));
        }
        return list;
    }

    public void printList(List<String> list, String threadName) {
        for (String s : list) {
            System.out.println(threadName + (s));
        }
    }
    public void run(){
        printList(getList(10),getName());
    }
}