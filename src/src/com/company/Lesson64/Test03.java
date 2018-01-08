package com.company.Lesson64;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by user on 24.02.2017.
 * /* Измерить сколько времени занимает 10 тысяч вызовов get для каждого списка
 Измерить, сколько времени занимает 10 тысяч вызовов get для каждого списка.
 Метод getTimeMsOfGet  должен вернуть время его исполнения в миллисекундах.
 */
public class Test03 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new LinkedList<>();
        addList(list);
        addList(list1);
        System.out.println(getTimeMsOfGet(list));
        System.out.println(getTimeMsOfGet(list1));
    }
    public static List addList(List<Integer> list) {
        for (int i = 0; i < 100000; i++) {
            list.add(i);
        }
        return list;
    }
    public static void get10k(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }
    }
    public static long getTimeMsOfGet(List<Integer> list){
        Date date = new Date();
        get10k(list);
        Date date1 = new Date();
        return date1.getTime() - date.getTime();
    }
}
